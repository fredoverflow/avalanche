package l.b;

public class C implements l.B {
    private l.B C;
    private A D;

    public C(l.B var1, A var2) {
        this.C = var1;
        this.D = var2;
    }

    public double A(double var1, double var3) {
        this.D.A(var1, var3);
        return this.C.A(this.D.A(), this.D.B());
    }
}
