package c;

public class D {
    private static final int J = j.A.B(-2);
    private static final int L = j.A.D(1) - 1;
    private static final long I = 3906250L;
    private static final long A = System.nanoTime();
    private static int K = 0;
    private static int B = 0;
    private static int G = 0;
    private final int D;
    private int C;
    private static int E = 0;
    private static int H = 0;
    private static final int F = 5;

    public static int A() {
        K = B;
        B = (int) ((System.nanoTime() - A) / 3906250L);
        int var0 = B - K;
        E += var0;
        ++H;
        if (E >= j.A.D(5)) {
            System.out.println((float) H / 5.0F + " fps");
            E = 0;
            H = 0;
        }

        return var0;
    }

    public static boolean C() {
        return G < B;
    }

    public static int E() {
        return ++G;
    }

    public static int A(int var0) {
        return G += var0;
    }

    public D() {
        this.D = G;
    }

    public void D() {
        this.C = G - this.D;
    }

    public int B() {
        return this.C;
    }

    public int D(int var1) {
        return var1 * this.C >> 8;
    }

    public int B(int var1) {
        return var1 * this.C + J >> 8;
    }

    public int C(int var1) {
        return var1 * this.C + L >> 8;
    }

    public float A(float var1) {
        return j.A.B(var1 * (float) this.C);
    }
}
