package l.a;

public class F implements I {
    private double D;
    private double C;

    public F(double var1, double var3) {
        assert var1 <= var3 : "" + var1 + " <= " + var3;

        this.D = var1;
        this.C = var3;
    }

    public double A(double var1) {
        return Math.min(Math.max(var1, this.D), this.C);
    }
}
