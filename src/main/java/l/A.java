package l;

public class A implements B {
    private C F;
    private double J;
    private double H;
    private double E;
    private double I;
    private double G;

    public A(double var1, double var3, double var5, double var7, double var9) {
        this.F = new C(var1);
        this.J = 6.283185307179586D * var3;
        this.H = var5;
        this.E = 6.283185307179586D * var7;
        this.I = var9 * 0.5D;
        this.G = 1.0D - this.I;
    }

    public double A(double var1, double var3) {
        return Math.cos(var1 * this.J + this.F.A(var1 * this.H, var3 * this.H) * this.E) * this.I + this.G;
    }
}
