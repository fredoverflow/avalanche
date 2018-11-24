package c;

public class H {
    private final int[] C;
    private final int[] B;
    private final int E;
    private int A;
    private int D;

    public H(int var1) {
        assert var1 > 0 : var1;

        this.C = new int[var1];
        this.B = new int[var1];
        this.C[0] = var1 - 1;
        int var2 = 0;

        for (int var3 = 1; var3 < var1; ++var3) {
            this.B[var2] = var3;
            this.C[var3] = var2++;
        }

        this.B[var1 - 1] = 0;
        this.E = var1;
        this.A = var1;
        this.D = 0;
    }

    public boolean B() {
        return this.A == 0;
    }

    public int C() {
        return this.D;
    }

    public int A() {
        return this.D = this.B[this.D];
    }

    public int A(int var1) {
        assert var1 >= 0;

        assert var1 < this.E;

        int var2 = this.C[var1];
        int var3 = this.B[var1];
        this.B[var2] = var3;
        this.C[var3] = var2;
        --this.A;
        return this.D = var3;
    }
}
