package l;

public class D implements B {
    private double P;
    private double Q;
    private double O;

    public D(double var1, double var3, double var5) {
        this.O = var1;
        this.P = var3;
        this.Q = var5;
    }

    public double A(double var1, double var3) {
        boolean var5 = ((int) Math.floor(var1 * this.O) & 1) == 0;
        boolean var6 = ((int) Math.floor(var3 * this.O) & 1) == 0;
        return var5 ^ var6 ? this.Q : this.P;
    }
}
