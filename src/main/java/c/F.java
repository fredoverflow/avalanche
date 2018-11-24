package c;

public class F {
    private final long C;
    private int B;
    private long D;
    private long A;

    public F(int var1) {
        this.C = (long) var1 * 1000000000L;
        this.D = System.nanoTime();
    }

    public boolean A() {
        ++this.B;
        long var1 = System.nanoTime();
        long var3 = var1 - this.D;
        boolean var5 = var3 >= this.C;
        if (var5) {
            this.A = 1000000000L * (long) this.B / var3;
            this.D = var1;
            this.B = 0;
        }

        return var5;
    }

    public long B() {
        return this.A;
    }
}
