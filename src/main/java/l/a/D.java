package l.a;

public class D implements I {
    private double B;
    private double A;

    public D(double var1) {
        this.B = var1;
        this.A = 1.0D - var1;
    }

    public double A(double var1) {
        return var1 * this.B + this.A;
    }
}
