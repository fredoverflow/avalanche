package l.b;

public class B extends D {
    private double C;

    public B(double var1) {
        this.C = var1;
    }

    public void A(double var1, double var3) {
        var1 -= 0.5D;
        var3 -= 0.5D;
        double var5 = Math.sqrt(var1 * var1 + var3 * var3) * this.C;
        this.B = var1 * Math.cos(var5) - var3 * Math.sin(var5);
        this.A = var1 * Math.sin(var5) + var3 * Math.cos(var5);
    }
}
