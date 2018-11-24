package c;

public class G {
    public String A;
    public boolean B;
    public long C;

    public G(String var1) {
        this.A = var1;
        this.B = false;
    }

    public void B() {
        assert !this.B;

        this.C = System.nanoTime();
        this.B = true;
    }

    public void A() {
        assert this.B;

        long var1 = System.nanoTime();
        long var3 = var1 - this.C;
        this.A(var3);
        this.B = false;
    }

    private void A(long var1) {
        String var3 = "ns";
        if (var1 > 9999L) {
            var1 /= 1000L;
            var3 = "µs";
            if (var1 > 9999L) {
                var1 /= 1000L;
                var3 = "ms";
            }
        }

        System.out.println(this.A + ": " + var1 + " " + var3);
    }
}
