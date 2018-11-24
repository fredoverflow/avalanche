package n;

public class M implements D {
    private final int J;
    private final H M;
    private final int K;
    private final int N;
    private static final c.B L = new c.B();

    private M(int var1, H var2, int var3) {
        this.J = var1;
        this.M = var2;
        this.K = var1 * (var2.B() - var2.A());
        this.N = var3;
    }

    public static M A(int var0, int var1, int var2) {
        return (M) L.A(new M(var0, H.B(0, var1), var2));
    }

    public boolean A(int var1, int var2) {
        return var1 >= 0 && var1 < this.J && this.M.A(var2);
    }

    public D B(int var1, int var2) {
        H var3 = this.M.A(var1, var2);
        return var3 != null ? (M) L.A(new M(this.J, var3, this.N)) : null;
    }

    public int B(int var1) {
        return this.M.A();
    }

    public int A(int var1) {
        return this.M.B();
    }

    public int G() {
        return this.M.A();
    }

    public int C() {
        return this.M.B();
    }

    public int A() {
        return 0;
    }

    public int E() {
        return 0;
    }

    public int B() {
        return this.N;
    }

    public int F() {
        return this.J;
    }

    public boolean equals(Object var1) {
        boolean var2 = var1 instanceof M;
        if (var2) {
            M var3 = (M) var1;
            var2 = this.J == var3.J && this.N == var3.N && this.M.equals(var3.M);
        }

        return var2;
    }

    public int hashCode() {
        return this.J * 37 + this.N * 97 + this.M.hashCode();
    }

    public int D() {
        return this.K;
    }
}
