package o;

import c.Timer;

public class H implements B {
    private Timer P = new Timer();
    private int Q;
    private int O;
    private int N;

    public H(int var1, int var2) {
        this.Q = var1;
        this.O = var2;
        this.N = this.Q;
    }

    public void D() {
        this.P.D();
        this.N = this.Q + this.P.D(this.O);
    }

    public int C() {
        return this.N;
    }

    public int B() {
        return this.O;
    }

    public boolean A() {
        return false;
    }

    public H A(int var1) {
        H var2 = null;

        try {
            var2 = (H) super.clone();
            var2.Q = this.Q + var1;
            var2.N = this.N + var1;
        } catch (CloneNotSupportedException var4) {
            var4.printStackTrace();
        }

        return var2;
    }
}
