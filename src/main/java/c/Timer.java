package c;

public class Timer {
    private static final int J = j.A.B(-2);
    private static final int L = j.A.D(1) - 1;
    private static final long I = 3906250L;
    private static final long A = System.nanoTime();
    private static int K = 0;
    private static int targetFrame = 0;
    private static int currentFrame = 0;
    private final int D;
    private int C;
    private static int E = 0;
    private static int H = 0;
    private static final int F = 5;

    public static int update() {
        K = targetFrame;
        targetFrame = (int) ((System.nanoTime() - A) / 3906250L);
        int var0 = targetFrame - K;
        E += var0;
        ++H;
        if (E >= j.A.D(5)) {
            System.out.println((float) H / 5.0F + " fps");
            E = 0;
            H = 0;
        }

        return var0;
    }

    public static boolean currentFrameLowerThanTargetFrame() {
        return currentFrame < targetFrame;
    }

    public static int incrementCurrentFrame() {
        return ++currentFrame;
    }

    public static int A(int var0) {
        return currentFrame += var0;
    }

    public Timer() {
        this.D = currentFrame;
    }

    public void D() {
        this.C = currentFrame - this.D;
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
