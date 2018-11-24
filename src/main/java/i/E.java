package i;

public class E implements H {
    private e.C B;
    private e.C C;
    private boolean A;

    public E(e.C var1, e.C var2) {
        assert var1 != null;

        assert var2 != null;

        this.B = var1;
        this.C = var2;
        this.A = false;
    }

    public E(e.C var1) {
        this(var1, e.B.A);
    }

    public void C() {
        if (!this.A) {
            this.A = true;
            this.B.A();
        }

    }

    public void A() {
        if (this.A) {
            this.A = false;
            this.C.A();
        }

    }

    public void B() {
    }
}
