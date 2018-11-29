package l;

public class A implements TexelFunction {
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

    public double apply(double x, double y) {
        return Math.cos(x * this.J + this.F.apply(x * this.H, y * this.H) * this.E) * this.I + this.G;
    }
}
