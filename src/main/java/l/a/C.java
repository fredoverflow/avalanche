package l.a;

public class C implements l.B {
    private l.B A;
    private I B;

    public C(l.B var1, I var2) {
        this.A = var1;
        this.B = var2;
    }

    public double A(double var1, double var3) {
        return this.B.A(this.A.A(var1, var3));
    }
}
