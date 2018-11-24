package m;

import n.G;

public class C {
    private final n.D[][] B;
    private final n.D[] A;

    public C(A var1) {
        int[][][] var2 = var1.B();
        int[][] var3 = var1.A();
        int var4 = var2.length;
        this.B = new n.D[var4][];
        this.A = new n.D[var4];

        for (int var5 = 0; var5 < var4; ++var5) {
            int var6 = var2[var5].length;
            this.B[var5] = new n.D[var6];

            for (int var7 = 0; var7 < var6; ++var7) {
                this.B[var5][var7] = G.A(var5, var7, var3[var5][var7], var2[var5][var7]);
            }

            this.A[var5] = this.B[var5][0];
        }

    }

    public int B() {
        return this.B.length;
    }

    public int A(int var1) {
        return this.B[var1].length;
    }

    public n.D B(int var1, int var2) {
        return this.B[var1][var2];
    }

    public int A(int var1, int var2) {
        return this.B[var1][var2].A();
    }

    public n.D[] A() {
        return (n.D[]) this.A.clone();
    }
}
