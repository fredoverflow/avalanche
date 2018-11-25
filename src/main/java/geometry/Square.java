package geometry;

public class Square extends Geometry {
    public Square(float x0, float y0, float x1, float y1, float z) {
        super(4, 2);
        this.addVertex(x0, y0, z, 0.0F, 0.0F, 1.0F);
        this.addVertex(x1, y0, z, 0.0F, 0.0F, 1.0F);
        this.addVertex(x0, y1, z, 0.0F, 0.0F, 1.0F);
        this.addVertex(x1, y1, z, 0.0F, 0.0F, 1.0F);
        this.addSquareIndices(0, 1, 3, 2);
    }
}
