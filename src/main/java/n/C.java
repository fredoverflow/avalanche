package n;

public class C implements D {
    private final int O;
    private final int R;
    private final int Q;
    private final int P;

    public C(int var1, int var2, int var3, int var4) {
        this.O = var1;
        this.R = var2;
        this.Q = var3;
        this.P = var4;
    }

    public boolean A(int var1, int var2) {
        return var1 >= 0 && var1 < this.O ? this.B(var1) <= var2 && var2 < this.A(var1) : false;
    }

    public D B(int var1, int var2) {
        throw new UnsupportedOperationException();
    }

    public int B(int var1) {
        return this.P;
    }

    public int G() {
        return this.P;
    }

    public int A() {
        return 0;
    }

    public int E() {
        return 0;
    }

    public int B() {
        return 7;
    }

    public int A(int var1) {
        return var1 >= this.R && var1 < this.O - this.R ? 0 : this.Q;
    }

    public int C() {
        return this.Q;
    }

    public int F() {
        return this.O;
    }

    public int D() {
        return Integer.MAX_VALUE;
    }
}
