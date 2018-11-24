package b;

public class G implements g.A {
    private g.A[] e;

    public G(g.A... var1) {
        this.e = (g.A[]) var1.clone();
    }

    public void B() {
        g.A[] var1 = this.e;
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            g.A var4 = var1[var3];
            var4.B();
        }

    }
}
