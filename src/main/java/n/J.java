package n;

import java.util.Iterator;

public class J implements o.C, Iterable, Cloneable {
    private D E;
    private int C;
    private o.B B;
    public boolean A = false;
    public boolean D = false;

    public J(D var1, int var2, o.B var3) {
        assert var1 != null;

        assert var2 >= 0;

        assert var3 != null;

        this.E = var1;
        this.C = var2;
        this.B = var3;
    }

    public J A(int var1, int var2) {
        J var3 = null;
        D var4 = this.E.B(var1, var2);
        if (var4 != null) {
            try {
                var3 = (J) super.clone();
            } catch (CloneNotSupportedException var6) {
                var6.printStackTrace();
            }

            var3.E = var4;
        }

        return var3;
    }

    public void M() {
        --this.C;
    }

    public void I() {
        ++this.C;
    }

    public void F(int var1) {
        this.B = new o.H(this.B.C(), var1);
    }

    public void A(o.I var1) {
        assert var1 != null;

        this.B = var1.A(this.B);
    }

    public int N() {
        return this.E.F();
    }

    public int P() {
        return this.C;
    }

    public int F() {
        return this.E.A();
    }

    private int H() {
        return this.P() + this.F();
    }

    public int B(int var1) {
        return this.D() + this.A(var1);
    }

    private int A(int var1) {
        return j.A.C(this.E.B(var1 - this.H()));
    }

    public int E() {
        return this.D() + j.A.C(this.E.G());
    }

    public int E(int var1) {
        return this.D() + this.D(var1);
    }

    private int D(int var1) {
        return j.A.C(this.E.A(var1 - this.H()));
    }

    public int A() {
        return this.D() + j.A.C(this.E.C());
    }

    public int A(J var1, int var2) {
        return var1.E(var2) - this.A(var2);
    }

    public void A(D var1) {
        assert var1 != null;

        this.E = var1;
    }

    public D K() {
        return this.E;
    }

    public o.B J() {
        return this.B;
    }

    public int G() {
        return this.E.B();
    }

    public void O() {
        this.B.D();
    }

    public int D() {
        return this.B.C();
    }

    public int C() {
        return this.B.B();
    }

    public boolean L() {
        return this.B.A();
    }

    public o.B C(int var1) {
        return this.B.A(var1);
    }

    public void A(o.B var1) {
        assert var1 != null;

        this.B = var1;
    }

    public Iterator iterator() {
        return new c.C(this.H(), this.N());
    }

    public int B() {
        return this.E.D();
    }
}
