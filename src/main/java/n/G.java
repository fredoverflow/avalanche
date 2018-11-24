package n;

import java.util.ArrayList;
import java.util.Arrays;

public class G implements D {
    private final int H;
    private final int B;
    private final int F;
    private final H[] C;
    private final int G;
    private final int I;
    private final int E;
    private static final c.B D = new c.B();

    private G(int var1, int var2, int var3, H[] var4) {
        assert var4 != null;

        this.H = var1;
        this.B = var2;
        this.F = var3;
        this.C = var4;
        this.G = this.H();
        this.I = this.J();
        this.E = this.I();
    }

    private int I() {
        int var1 = 0;
        H[] var2 = this.C;
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            H var5 = var2[var4];
            var1 += var5.B() - var5.A();
        }

        return var1;
    }

    private int H() {
        int var1 = Integer.MAX_VALUE;
        H[] var2 = this.C;
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            H var5 = var2[var4];
            int var6 = var5.A();
            if (var6 < var1) {
                var1 = var6;
            }
        }

        return var1;
    }

    private int J() {
        int var1 = Integer.MIN_VALUE;
        H[] var2 = this.C;
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            H var5 = var2[var4];
            int var6 = var5.B();
            if (var6 > var1) {
                var1 = var6;
            }
        }

        return var1;
    }

    private G(int var1, int var2, int var3, int[] var4) {
        assert var4 != null;

        assert (var4.length & 1) == 0;

        this.H = var1;
        this.B = var2;
        this.F = var3;
        this.C = new H[var4.length >> 1];
        int var5 = 0;

        for (int var6 = 0; var6 < var4.length; var6 += 2) {
            this.C[var5] = n.H.B(var4[var6], var4[var6 + 1]);
            ++var5;
        }

        this.G = this.H();
        this.I = this.J();
        this.E = this.I();
    }

    public static G A(int var0, int var1, int var2, H[] var3) {
        return (G) D.A(new G(var0, var1, var2, var3));
    }

    public static G A(int var0, int var1, int var2, int[] var3) {
        return (G) D.A(new G(var0, var1, var2, var3));
    }

    public D B(int var1, int var2) {
        int var3 = this.A();
        int var4 = this.B();
        int var5 = this.E();
        ArrayList var6 = new ArrayList(this.F());
        byte var7 = 1;
        H[] var8 = this.C;
        int var9 = var8.length;

        for (int var10 = 0; var10 < var9; ++var10) {
            H var11 = var8[var10];
            H var12 = var11.A(var1, var2);
            if (var12 != null) {
                var6.add(var12);
                var7 = 0;
            }

            var3 += var7;
        }

        return var7 == 0 ? A(var4, var5, var3, (H[]) var6.toArray(new H[var6.size()])) : null;
    }

    public boolean A(int var1, int var2) {
        return var1 >= 0 && var1 < this.C.length && this.C[var1].A(var2);
    }

    public int B(int var1) {
        return this.C[var1].A();
    }

    public int A(int var1) {
        return this.C[var1].B();
    }

    public int B() {
        return this.H;
    }

    public int E() {
        return this.B;
    }

    public int A() {
        return this.F;
    }

    public int F() {
        return this.C.length;
    }

    public boolean equals(Object var1) {
        boolean var2 = var1 instanceof G;
        if (var2) {
            G var3 = (G) var1;
            var2 = this.H == var3.H && this.F == var3.F && Arrays.equals(this.C, var3.C);
        }

        return var2;
    }

    public int hashCode() {
        return 997 * this.H + 57 * this.B + 991 * this.F + Arrays.deepHashCode(this.C);
    }

    public int G() {
        return this.G;
    }

    public int C() {
        return this.I;
    }

    public int D() {
        return this.E;
    }
}
