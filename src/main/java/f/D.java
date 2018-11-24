package f;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class D {
    public static final int D = 6;
    public static final int C = 3;
    private final float[] G;
    private int E;
    private int[] H;
    private int F;
    private int[] B;
    private int[] I;

    public int[] D() {
        return (int[]) this.B.clone();
    }

    public int[] N() {
        return (int[]) this.I.clone();
    }

    protected D(int var1, int var2) {
        this.G = new float[var1 * 6];
        this.H = new int[var2 * 3];
        this.B = new int[]{0};
        this.I = new int[]{this.H.length};
    }

    public D(D var1) {
        this.G = (float[]) var1.G.clone();
        this.H = (int[]) var1.H.clone();
        this.B = var1.B;
        this.I = var1.I;
    }

    public D(D... var1) {
        assert var1.length != 0;

        this.B = new int[var1.length];
        this.I = new int[var1.length];
        this.E = 0;
        this.F = 0;
        int var2 = 0;
        D[] var3 = var1;
        int var4 = var1.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            D var6 = var3[var5];
            this.B[var2] = this.F;
            this.I[var2] = var6.H.length;
            ++var2;
            this.E += var6.G.length;
            this.F += var6.H.length;
        }

        this.G = new float[this.E];
        this.H = new int[this.F];
        this.E = 0;
        this.F = 0;
        D[] var11 = var1;
        int var12 = var1.length;

        for (var4 = 0; var4 < var12; ++var4) {
            D var13 = var11[var4];
            int var14 = this.E / 6;
            System.arraycopy(var13.G, 0, this.G, this.E, var13.G.length);
            this.E += var13.G.length;
            int[] var7 = var13.H;
            int var8 = var7.length;

            for (int var9 = 0; var9 < var8; ++var9) {
                int var10 = var7[var9];
                this.H[this.F++] = var10 + var14;
            }
        }

        this.M();
    }

    public D(D var1, int[][] var2) {
        this.G = (float[]) var1.G.clone();
        this.B = new int[var2.length];
        this.I = new int[var2.length];
        this.F = 0;
        int[][] var3 = var2;
        int var4 = var2.length;

        int var5;
        int[] var7;
        int var9;
        int var10;
        for (var5 = 0; var5 < var4; ++var5) {
            int[] var6 = var3[var5];
            var7 = var6;
            int var8 = var6.length;

            for (var9 = 0; var9 < var8; ++var9) {
                var10 = var7[var9];
                this.F += var1.I[var10];
            }
        }

        this.H = new int[this.F];
        this.F = 0;
        int var12 = 0;
        int[][] var13 = var2;
        var5 = var2.length;

        for (int var14 = 0; var14 < var5; ++var14) {
            var7 = var13[var14];
            this.B[var12] = this.F;
            int[] var15 = var7;
            var9 = var7.length;

            for (var10 = 0; var10 < var9; ++var10) {
                int var11 = var15[var10];
                System.arraycopy(var1.H, var1.B[var11], this.H, this.F, var1.I[var11]);
                this.F += var1.I[var11];
            }

            this.I[var12] = this.F - this.B[var12];
            ++var12;
        }

        assert this.F == this.H.length;

    }

    public D F() {
        for (int var1 = 0; var1 < this.G.length; var1 += 6) {
            float var2 = this.G[var1 + 3];
            float var3 = this.G[var1 + 4];
            float var4 = this.G[var1 + 5];
            float var5 = 1.0F / (var2 * var2 + var3 * var3 + var4 * var4);
            this.G[var1 + 3] = var2 * var5;
            this.G[var1 + 4] = var3 * var5;
            this.G[var1 + 5] = var4 * var5;
        }

        return this;
    }

    public D A(float var1) {
        for (int var2 = 0; var2 < this.G.length; var2 += 6) {
            float[] var10000 = this.G;
            var10000[var2 + 0] *= var1;
            var10000 = this.G;
            var10000[var2 + 1] *= var1;
            var10000 = this.G;
            var10000[var2 + 2] *= var1;
        }

        return this;
    }

    public D A(float var1, float var2, float var3) {
        for (int var4 = 0; var4 < this.G.length; var4 += 6) {
            float[] var10000 = this.G;
            var10000[var4 + 0] += var1;
            var10000 = this.G;
            var10000[var4 + 1] += var2;
            var10000 = this.G;
            var10000[var4 + 2] += var3;
        }

        return this;
    }

    public D C() {
        for (int var1 = 0; var1 < this.G.length; var1 += 3) {
            float var2 = this.G[var1 + 1];
            this.G[var1 + 1] = -this.G[var1 + 2];
            this.G[var1 + 2] = var2;
        }

        return this;
    }

    public D I() {
        for (int var1 = 0; var1 < this.G.length; var1 += 3) {
            this.G[var1 + 1] = -this.G[var1 + 1];
            this.G[var1 + 2] = -this.G[var1 + 2];
        }

        return this;
    }

    public D O() {
        for (int var1 = 0; var1 < this.G.length; var1 += 3) {
            float var2 = this.G[var1 + 1];
            this.G[var1 + 1] = this.G[var1 + 2];
            this.G[var1 + 2] = -var2;
        }

        return this;
    }

    public D H() {
        for (int var1 = 0; var1 < this.G.length; var1 += 3) {
            float var2 = this.G[var1 + 0];
            this.G[var1 + 0] = this.G[var1 + 2];
            this.G[var1 + 2] = -var2;
        }

        return this;
    }

    public D G() {
        for (int var1 = 0; var1 < this.G.length; var1 += 3) {
            this.G[var1 + 0] = -this.G[var1 + 0];
            this.G[var1 + 2] = -this.G[var1 + 2];
        }

        return this;
    }

    public D K() {
        for (int var1 = 0; var1 < this.G.length; var1 += 3) {
            float var2 = this.G[var1 + 0];
            this.G[var1 + 0] = -this.G[var1 + 2];
            this.G[var1 + 2] = var2;
        }

        return this;
    }

    public D E() {
        for (int var1 = 0; var1 < this.G.length; var1 += 3) {
            float var2 = this.G[var1 + 0];
            this.G[var1 + 0] = -this.G[var1 + 1];
            this.G[var1 + 1] = var2;
        }

        return this;
    }

    public D L() {
        for (int var1 = 0; var1 < this.G.length; var1 += 3) {
            this.G[var1 + 0] = -this.G[var1 + 0];
            this.G[var1 + 1] = -this.G[var1 + 1];
        }

        return this;
    }

    public D B() {
        for (int var1 = 0; var1 < this.G.length; var1 += 3) {
            float var2 = this.G[var1 + 0];
            this.G[var1 + 0] = this.G[var1 + 1];
            this.G[var1 + 1] = -var2;
        }

        return this;
    }

    public FloatBuffer A() {
        return FloatBuffer.wrap(this.G);
    }

    public IntBuffer J() {
        return IntBuffer.wrap(this.H);
    }

    protected void B(int var1) {
        this.E = var1 * 6;
    }

    protected void A(float var1, float var2, float var3, float var4, float var5, float var6) {
        this.G[this.E++] = var1;
        this.G[this.E++] = var2;
        this.G[this.E++] = var3;
        this.G[this.E++] = var4;
        this.G[this.E++] = var5;
        this.G[this.E++] = var6;
    }

    protected void A(double var1, double var3) {
        float var5 = (float) Math.cos(var3);
        float var6 = var5 * (float) Math.sin(var1);
        float var7 = (float) Math.sin(var3);
        float var8 = var5 * (float) Math.cos(var1);
        this.A(var6, var7, var8, var6, var7, var8);
    }

    protected void A(double var1, double var3, float var5) {
        float var6 = (float) Math.cos(var3);
        float var7 = var6 * (float) Math.sin(var1);
        float var8 = (float) Math.sin(var3);
        float var9 = var6 * (float) Math.cos(var1);
        this.A(var5 * var7, var5 * var8, var5 * var9, var7, var8, var9);
    }

    protected void A(int var1) {
        this.F = var1 * 3;
    }

    protected void A(int var1, int var2, int var3) {
        this.H[this.F++] = var1;
        this.H[this.F++] = var2;
        this.H[this.F++] = var3;
    }

    protected void A(int var1, int var2, int var3, int var4) {
        this.A(var1, var2, var3);
        this.A(var3, var4, var1);
    }

    protected void A(int... var1) {
        int[] var2 = var1;
        int var3 = var1.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            int var5 = var2[var4];
            this.H[this.F++] = var5;
        }

    }

    protected void M() {
        assert this.F == this.H.length;

        assert this.E == this.G.length;

    }
}
