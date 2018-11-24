package m;

import java.util.Random;

public class B {
    private final C D;
    private final Random C;
    private n.D[] B;
    private int A;

    public B(C var1, Random var2) {
        this.D = var1;
        this.C = var2;
    }

    public n.D A() {
        if (this.A == 0) {
            this.B = this.D.A();
            this.A = this.B.length;
        }

        int var1 = this.C.nextInt(this.A--);
        n.D var2 = this.B[var1];
        this.B[var1] = this.B[this.A];
        this.B[this.A] = null;
        return var2;
    }
}
