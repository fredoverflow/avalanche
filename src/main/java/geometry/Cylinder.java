package geometry;

public class Cylinder extends Geometry {
    public Cylinder(float length, int linearResolution, float radius, double alpha, double beta, int angularResolution) {
        super((linearResolution + 1) * (angularResolution + 1), 2 * linearResolution * angularResolution);
        float delta = length / (float) linearResolution;
        double angularDelta = (beta - alpha) / (double) angularResolution;

        for (int a = 0; a <= angularResolution; ++a) {
            double angle = alpha + (double) a * angularDelta;
            float ny = (float) Math.sin(angle);
            float nz = (float) Math.cos(angle);
            float y = radius * ny;
            float z = radius * nz;

            for (int i = 0; i <= linearResolution; ++i) {
                this.addVertex((float) i * delta, y, z, 0.0F, ny, nz);
            }
        }

        for (int a = 0, index = 0; a < angularResolution; ++a, ++index) {
            for (int i = 0; i < linearResolution; ++i, ++index) {
                this.addSquareIndices(index, index + 1, index + linearResolution + 2, index + linearResolution + 1);
            }
        }
    }
}
