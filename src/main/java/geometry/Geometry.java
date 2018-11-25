package geometry;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class Geometry {
    private final float[] vertex;
    private int v;

    private final int[] index;
    private int n;

    private int[] offset;
    private int[] length;

    public int[] getOffsets() {
        return offset.clone();
    }

    public int[] getLengths() {
        return length.clone();
    }

    protected Geometry(int numVertices, int numIndices) {
        vertex = new float[numVertices * 6];
        index = new int[numIndices * 3];
        offset = new int[]{0};
        length = new int[]{index.length};
    }

    public Geometry(Geometry that) {
        vertex = that.vertex.clone();
        index = that.index.clone();
        offset = that.offset;
        length = that.length;
    }

    public Geometry(Geometry... geometries) {
        assert geometries.length != 0;

        offset = new int[geometries.length];
        length = new int[geometries.length];
        v = 0;
        n = 0;

        for (int i = 0; i < geometries.length; ++i) {
            Geometry that = geometries[i];
            offset[i] = n;
            length[i] = that.index.length;
            n += that.index.length;
            v += that.vertex.length;
        }

        vertex = new float[v];
        index = new int[n];
        v = 0;
        n = 0;

        for (Geometry that : geometries) {
            int numVertices = v / 6;
            System.arraycopy(that.vertex, 0, vertex, v, that.vertex.length);
            v += that.vertex.length;

            for (int idx : that.index) {
                index[n++] = idx + numVertices;
            }
        }

        checkArraysFull();
    }

    public Geometry(Geometry that, int[][] iss) {
        vertex = that.vertex.clone();
        offset = new int[iss.length];
        length = new int[iss.length];

        int k = 0;
        for (int[] is : iss) {
            for (int i : is) {
                k += that.length[i];
            }
        }
        index = new int[k];

        for (k = 0; k < iss.length; k++) {
            offset[k] = n;
            for (int i : iss[k]) {
                System.arraycopy(that.index, that.offset[i], index, n, that.length[i]);
                n += that.length[i];
            }
            length[k] = n - offset[k];
        }
        assert n == index.length;
    }

    public Geometry normalize() {
        for (int i = 0; i < vertex.length; i += 6) {
            float nx = vertex[i + 3];
            float ny = vertex[i + 4];
            float nz = vertex[i + 5];
            float factor = 1.0F / (nx * nx + ny * ny + nz * nz);
            vertex[i + 3] = nx * factor;
            vertex[i + 4] = ny * factor;
            vertex[i + 5] = nz * factor;
        }
        return this;
    }

    public Geometry scale(float factor) {
        for (int i = 0; i < vertex.length; i += 6) {
            vertex[i + 0] *= factor;
            vertex[i + 1] *= factor;
            vertex[i + 2] *= factor;
        }
        return this;
    }

    public Geometry translate(float dx, float dy, float dz) {
        for (int i = 0; i < vertex.length; i += 6) {
            vertex[i + 0] += dx;
            vertex[i + 1] += dy;
            vertex[i + 2] += dz;
        }
        return this;
    }

    public Geometry rotateX90() {
        for (int i = 0; i < vertex.length; i += 3) {
            float oldY = vertex[i + 1];
            vertex[i + 1] = -vertex[i + 2];
            vertex[i + 2] = oldY;
        }
        return this;
    }

    public Geometry rotateX180() {
        for (int i = 0; i < vertex.length; i += 3) {
            vertex[i + 1] = -vertex[i + 1];
            vertex[i + 2] = -vertex[i + 2];
        }
        return this;
    }

    public Geometry rotateX270() {
        for (int i = 0; i < vertex.length; i += 3) {
            float var2 = vertex[i + 1];
            vertex[i + 1] = vertex[i + 2];
            vertex[i + 2] = -var2;
        }
        return this;
    }

    public Geometry rotateY90() {
        for (int i = 0; i < vertex.length; i += 3) {
            float oldX = vertex[i + 0];
            vertex[i + 0] = vertex[i + 2];
            vertex[i + 2] = -oldX;
        }

        return this;
    }

    public Geometry rotateY180() {
        for (int i = 0; i < vertex.length; i += 3) {
            vertex[i + 0] = -vertex[i + 0];
            vertex[i + 2] = -vertex[i + 2];
        }

        return this;
    }

    public Geometry rotateY270() {
        for (int i = 0; i < vertex.length; i += 3) {
            float oldX = vertex[i + 0];
            vertex[i + 0] = -vertex[i + 2];
            vertex[i + 2] = oldX;
        }

        return this;
    }

    public Geometry rotateZ90() {
        for (int i = 0; i < vertex.length; i += 3) {
            float oldX = vertex[i + 0];
            vertex[i + 0] = -vertex[i + 1];
            vertex[i + 1] = oldX;
        }
        return this;
    }

    public Geometry rotateZ180() {
        for (int i = 0; i < vertex.length; i += 3) {
            vertex[i + 0] = -vertex[i + 0];
            vertex[i + 1] = -vertex[i + 1];
        }
        return this;
    }

    public Geometry rotateZ270() {
        for (int i = 0; i < vertex.length; i += 3) {
            float oldX = vertex[i + 0];
            vertex[i + 0] = vertex[i + 1];
            vertex[i + 1] = -oldX;
        }
        return this;
    }

    public FloatBuffer vertexBuffer() {
        return FloatBuffer.wrap(vertex);
    }

    public IntBuffer indexBuffer() {
        return IntBuffer.wrap(index);
    }

    protected void setNumVertices(int numVertices) {
        v = numVertices * 6;
    }

    protected void add(float x, float y, float z, float nx, float ny, float nz) {
        vertex[v++] = x;
        vertex[v++] = y;
        vertex[v++] = z;
        vertex[v++] = nx;
        vertex[v++] = ny;
        vertex[v++] = nz;
    }

    protected void addUnit(double alpha, double beta) {
        float b = (float) Math.cos(beta);
        float x = b * (float) Math.sin(alpha);
        float y = (float) Math.sin(beta);
        float z = b * (float) Math.cos(alpha);
        add(x, y, z, x, y, z);
    }

    protected void addUnit(double alpha, double beta, float scale) {
        float b = (float) Math.cos(beta);
        float x = b * (float) Math.sin(alpha);
        float y = (float) Math.sin(beta);
        float z = b * (float) Math.cos(alpha);
        add(scale * x, scale * y, scale * z, x, y, z);
    }

    protected void setNumIndices(int numIndices) {
        n = numIndices * 3;
    }

    protected void addTriangle(int index0, int index1, int index2) {
        index[n++] = index0;
        index[n++] = index1;
        index[n++] = index2;
    }

    protected void addSquare(int index0, int index1, int index2, int index3) {
        addTriangle(index0, index1, index2);
        addTriangle(index2, index3, index0);
    }

    protected void addIndices(int... indices) {
        for (int idx : indices) {
            index[n++] = idx;
        }
    }

    protected void checkArraysFull() {
        assert n == index.length;
        assert v == vertex.length;
    }
}
