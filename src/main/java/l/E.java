package l;

public class E implements B {
    private B S;
    private double R;
    private double U;
    private double T;

    public E(double var1, double var3, double var5) {
        this.S = new C(var1);
        this.R = var3;
        this.U = var5;
        this.T = 1.0D - var5;
    }

    public double A(double var1, double var3) {
        double var5 = this.S.A(var1, var3) * this.R;
        var5 -= Math.floor(var5);
        var5 = var5 * this.U + this.T;
        return var5;
    }
}
