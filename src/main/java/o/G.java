package o;

import c.Timer;

public class G implements B {
    private B I;
    private int K;
    private int H;
    private C L;
    private Timer J;

    public G(B var1, int var2, int var3, C var4) {
        assert var1 != null;

        assert var2 > 0 : var2;

        assert var4 != null;

        this.I = var1;
        this.K = var2;
        this.H = var3;
        this.L = var4;
        this.J = new Timer();
    }

    public void D() {
        this.J.D();
        if (this.J.B() >= this.K) {
            this.I = new A(this.H);
            this.L.A(this.I);
        }

        this.I.D();
        if (this.I.B() < 0) {
            System.out.print("!");
        }

    }

    public int C() {
        return this.I.C();
    }

    public int B() {
        return this.I.B();
    }

    public boolean A() {
        return this.I.A();
    }

    public B A(int var1) {
        return this.I.A(var1);
    }
}
