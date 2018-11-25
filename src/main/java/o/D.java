package o;

import c.Timer;

public class D implements B {
    private Timer E = new Timer();
    private int G;
    private int D;
    private int B;
    private int F;
    private int A;
    private int C;

    public D(int var1, int var2, int var3) {
        this.G = var1;
        this.D = var2;
        this.B = var3;
        this.F = this.B >> 1;
        this.A = this.G;
        this.C = this.D;
    }

    public void D() {
        this.E.D();
        this.A = this.G + this.E.D(this.D + this.E.D(this.F));
        this.C = this.D + this.E.D(this.B);
    }

    public int C() {
        return this.A;
    }

    public int B() {
        return this.C;
    }

    public boolean A() {
        return false;
    }

    public D A(int var1) {
        D var2 = null;

        try {
            var2 = (D) super.clone();
            var2.G = this.G + var1;
            var2.A = this.A + var1;
        } catch (CloneNotSupportedException var4) {
            var4.printStackTrace();
        }

        return var2;
    }
}
