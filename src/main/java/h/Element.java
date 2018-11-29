package h;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import geometry.Geometry;
import startup.Startup;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import static com.jogamp.opengl.GL.*;
import static com.jogamp.opengl.fixedfunc.GLPointerFunc.GL_NORMAL_ARRAY;
import static com.jogamp.opengl.fixedfunc.GLPointerFunc.GL_VERTEX_ARRAY;

public class Element implements Deleteable {
    private final int[] buffers = new int[2];
    private int indexCapacity;
    private int[] offsets;
    private int[] lengths;

    public Element() {
        Startup.gl2.glGenBuffers(2, this.buffers, 0);
    }

    public void load(Geometry geometry) {
        GL2 gl2 = Startup.gl2;
        offsets = geometry.getOffsets();
        lengths = geometry.getLengths();

        gl2.glBindBuffer(GL_ARRAY_BUFFER, buffers[0]);
        FloatBuffer vertexBuffer = geometry.vertexBuffer();
        gl2.glBufferData(GL_ARRAY_BUFFER, vertexBuffer.capacity() * 4, vertexBuffer, GL_STATIC_DRAW);

        gl2.glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, buffers[1]);
        IntBuffer indexBuffer = geometry.indexBuffer();
        indexCapacity = indexBuffer.capacity();
        gl2.glBufferData(GL_ELEMENT_ARRAY_BUFFER, indexCapacity * 4, indexBuffer, GL_STATIC_DRAW);

        int vertexCapacity = vertexBuffer.capacity();
        System.out.printf("vertices: %d\n indices: %d\nmemory: %d KiB\n", vertexCapacity, this.indexCapacity, (vertexCapacity + this.indexCapacity) / 256);
    }

    public void enable() {
        GL2 gl2 = Startup.gl2;
        gl2.glBindBuffer(GL_ARRAY_BUFFER, this.buffers[0]);
        gl2.glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, this.buffers[1]);
        gl2.glEnableClientState(GL_VERTEX_ARRAY);
        gl2.glEnableClientState(GL_NORMAL_ARRAY);
        gl2.glVertexPointer(3, GL_FLOAT, 24, 0);
        gl2.glNormalPointer(GL_FLOAT, 24, 12);
    }

    public void draw() {
        Startup.gl2.glDrawElements(GL_TRIANGLES, this.indexCapacity, GL_UNSIGNED_INT, 0);
    }

    public void draw(int index) {
        Startup.gl2.glDrawElements(GL_TRIANGLES, this.lengths[index], GL_UNSIGNED_INT, this.offsets[index] * 4);
    }

    public void disable() {
        GL2 gl2 = Startup.gl2;
        gl2.glDisableClientState(GL_NORMAL_ARRAY);
        gl2.glDisableClientState(GL_VERTEX_ARRAY);
        gl2.glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, 0);
        gl2.glBindBuffer(GL_ARRAY_BUFFER, 0);
    }

    public void delete() {
        Startup.gl2.glDeleteBuffers(2, this.buffers, 0);
    }
}
