package l.a;

public class A implements l.B {
    private l.B V;

    public A(l.B var1) {
        this.V = var1;
    }

    public double A(double var1, double var3) {
        return this.V.A(var1, var3) + var1;
    }
}
