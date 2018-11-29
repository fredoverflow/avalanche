package l;

public class D implements TexelFunction {
    private double P;
    private double Q;
    private double O;

    public D(double var1, double var3, double var5) {
        this.O = var1;
        this.P = var3;
        this.Q = var5;
    }

    public double apply(double x, double y) {
        boolean var5 = ((int) Math.floor(x * this.O) & 1) == 0;
        boolean var6 = ((int) Math.floor(y * this.O) & 1) == 0;
        return var5 ^ var6 ? this.Q : this.P;
    }
}
