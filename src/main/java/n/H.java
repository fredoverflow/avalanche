package n;

public class H {
    private final int A;
    private final int C;
    private static final c.B B = new c.B();

    private H(int var1, int var2) {
        assert var1 < var2 : "" + var1 + "/" + var2;

        this.A = var1;
        this.C = var2;
    }

    public static H B(int var0, int var1) {
        return (H) B.A(new H(var0, var1));
    }

    public H A(int var1, int var2) {
        int var3 = Math.max(var1, this.A);
        int var4 = Math.min(var2, this.C);
        return var3 < var4 ? B(var3, var4) : null;
    }

    public boolean A(int var1) {
        return var1 >= this.A && var1 < this.C;
    }

    public int A() {
        return this.A;
    }

    public int B() {
        return this.C;
    }

    public boolean equals(Object var1) {
        boolean var2 = var1 instanceof H;
        if (var2) {
            H var3 = (H) var1;
            var2 = this.A == var3.A && this.C == var3.C;
        }

        return var2;
    }

    public int hashCode() {
        return this.A * 37 + this.C;
    }

    public String toString() {
        return "[" + this.A + " - " + this.C + "]";
    }
}
