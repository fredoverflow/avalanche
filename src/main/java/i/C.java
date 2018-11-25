package i;

import c.Timer;

public class C implements H {
    private e.C H;
    private int J;
    private int F;
    private boolean E;
    private Timer I;
    private int G;

    public C(e.C var1, int var2, int var3) {
        assert var1 != null;

        assert var2 > 0;

        assert var3 > 0;

        this.H = var1;
        this.J = var2;
        this.F = var3;
        this.E = false;
        this.I = new Timer();
    }

    public void C() {
        if (!this.E) {
            this.E = true;
            this.H.A();
            this.I = new Timer();
            this.G = this.J;
        }

    }

    public void A() {
        this.E = false;
    }

    public void B() {
        if (this.E) {
            this.I.D();

            for (long var1 = (long) this.I.B(); var1 >= (long) this.G; this.G += this.F) {
                this.H.A();
            }
        }

    }
}
