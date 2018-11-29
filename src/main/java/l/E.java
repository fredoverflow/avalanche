package l;

public class E implements TexelFunction {
    private TexelFunction S;
    private double R;
    private double U;
    private double T;

    public E(double var1, double var3, double var5) {
        this.S = new C(var1);
        this.R = var3;
        this.U = var5;
        this.T = 1.0D - var5;
    }

    public double apply(double x, double y) {
        double var5 = this.S.apply(x, y) * this.R;
        var5 -= Math.floor(var5);
        var5 = var5 * this.U + this.T;
        return var5;
    }
}
