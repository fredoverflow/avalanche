package geometry;

public class SphereOctant extends Geometry {
    private static final double _90 = 1.5707963267948966;

    public SphereOctant(float radius, int resolution) {
        super((resolution + 1) * (resolution + 2) / 2, resolution * resolution);

        for (int b = 0; b < resolution; ++b) {
            double beta = _90 * b / resolution;

            for (int a = 0, max = resolution - b; a <= max; ++a) {
                this.addSphereVertex(_90 * a / max, beta, radius);
            }
        }

        this.addSphereVertex(0.0, _90, radius);
        int nextStartIndex = 0;

        for (int b = 0; b < resolution; ++b) {
            int startIndex = nextStartIndex;
            int indexBound = nextStartIndex + resolution - b;
            nextStartIndex = indexBound + 1;
            int indexDelta = nextStartIndex - startIndex;

            for (int index = startIndex; index < indexBound; ++index) {
                this.addTriangleIndices(index, index + 1, index + indexDelta);
            }

            for (int index = startIndex + 1; index < indexBound; ++index) {
                this.addTriangleIndices(index, index + indexDelta, index + indexDelta - 1);
            }
        }

        this.checkArraysFull();
    }
}
