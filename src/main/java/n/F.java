package n;

import java.util.Iterator;

public class F implements g.B, Iterable {
    private final j.A Â;
    private final E Ñ;
    public final int ¥;
    public final int ¤;
    private final I º;
    private final F._I È;
    private D ¢;
    private boolean Ó;
    private int Ã;
    private J Í;
    private N £;
    public final p.A Ô = new p.B();
    public final p.A ª = new p.B();
    public final p.A Ò = new p.B();
    public final p.A É = new p.B();
    public final p.A Å = new p.B();
    public final p.A Ï = new p.B();
    public final e.A Á = new e.A(new F._M(new F._D()));
    public final e.A µ = new e.A(new F._M(new F._A()));
    public final e.A Ê = new e.A(new F._M(new F._H()));
    public final e.A À = new e.A(new F._L());
    public final e.A Î = new e.A(new F._B());
    public final e.A Ç = new e.A(new F._J());
    public final e.A Ä = new e.A(new F._G());
    public final e.A Æ = new e.A(new F._E());
    public final e.A Ì = new e.A(new F._K());
    private final e.A[] Ë;

    public F(j.A var1) {
        this.Ë = new e.A[]{this.Á, this.µ, this.Ê, this.À, this.Î, this.Ç, this.Æ, this.Ì};
        this.Â = var1;
        this.Ñ = new E(var1);
        this.¥ = var1.T / 2 - 2;
        this.¤ = var1.S - 4;
        this.º = new I(this.Â);
        this.È = new F._I();
        this.¢ = this.Â.R.B(0, 0);
        this.Ã = this.Â.W;
        this.P();
    }

    private void P() {
        this.A(this.º.A(), true, this.È);
    }

    private void A(D var1, boolean var2, e.C var3) {
        this.Í = new J(var1, this.¥, new o.H(j.A.C(this.¤), this.Ã));
        this.Ó = var2;
        if (this.Ñ.D(this.Í)) {
            this.Ñ.I();
            this.Î.A();
        }

        this.Ñ.B(this.Í);
        this.Í.A = true;
        this.Í.D = true;
        this.£ = new F._F();
        var3.A();
    }

    public void A() {
        this.£.B();
    }

    public void C(int var1) {
        assert var1 < 0 : var1;

        this.Ã = Math.max(var1, this.Â.C);
        if (this.Ã < this.Í.C()) {
        }

    }

    public void a() {
        this.Ñ.I();
    }

    public void B(int var1) {
        this.Ñ.A(var1);
    }

    public I Z() {
        return this.º;
    }

    public J U() {
        return this.Í;
    }

    public D T() {
        return this.º.A();
    }

    public D Q() {
        return this.¢;
    }

    public int Y() {
        return this.Ñ.C(this.Í);
    }

    public J S() {
        return this.Ñ.E();
    }

    public int b() {
        return this.Â.T;
    }

    public int c() {
        return this.Â.S;
    }

    public Iterator iterator() {
        return this.Ñ.iterator();
    }

    public p.A V() {
        return this.Ñ.M;
    }

    public p.A X() {
        return this.Ñ.D;
    }

    public p.A W() {
        return this.Ñ.F;
    }

    public p.A O() {
        return this.Ñ.G;
    }

    public p.A _() {
        return this.Ñ.L;
    }

    public p.A R() {
        return this.Ñ.B;
    }

    private class _K implements e.C {
        private _K() {
        }

        public void A() {
            F.this.ª.A((Object) F.this);
        }

        // $FF: synthetic method
        _K(Object var2) {
            this();
        }
    }

    private class _E implements e.C {
        private _E() {
        }

        public void A() {
            F.this.£.C();
        }

        // $FF: synthetic method
        _E(Object var2) {
            this();
        }
    }

    private class _G implements e.C {
        private _G() {
        }

        public void A() {
            F.this.Í.A((o.B) (new o.A(j.A.C(-4))));
            F.this.A();
        }

        // $FF: synthetic method
        _G(Object var2) {
            this();
        }
    }

    private class _J implements e.C {
        private _J() {
        }

        public void A() {
            F.this.Í.A((o.I) (new o.J(F.this.Â.Z)));
        }

        // $FF: synthetic method
        _J(Object var2) {
            this();
        }
    }

    private class _B implements e.C {
        private _B() {
        }

        public void A() {
            F.this.Í.F(F.this.Ã);
        }

        // $FF: synthetic method
        _B(Object var2) {
            this();
        }
    }

    private class _L implements e.C {
        private _L() {
        }

        public void A() {
            F.this.Í.F(F.this.Â.C);
        }

        // $FF: synthetic method
        _L(Object var2) {
            this();
        }
    }

    private class _H implements B {
        private D D;

        private _H() {
        }

        public void B() {
            m.C var1 = F.this.Â.R;
            this.D = F.this.Í.K();
            int var2 = this.D.B();
            int var3 = this.D.E();
            var3 = (var3 + 1) % var1.A(var2);
            F.this.Í.A(var1.B(var2, var3));
            if (F.this.Ñ.D(F.this.Í)) {
                F.this.Í.I();
                if (F.this.Ñ.D(F.this.Í)) {
                    F.this.Í.M();
                    F.this.Í.M();
                    if (F.this.Ñ.D(F.this.Í)) {
                        F.this.Í.I();
                    } else {
                        F.this.Ò.A((Object) F.this.Í);
                    }
                } else {
                    F.this.É.A((Object) F.this.Í);
                }
            }

        }

        public void C() {
            F.this.Í.A(this.D);
        }

        public p.A A() {
            return F.this.Å;
        }

        // $FF: synthetic method
        _H(Object var2) {
            this();
        }
    }

    private class _A implements B {
        private _A() {
        }

        public void B() {
            F.this.Í.I();
        }

        public void C() {
            F.this.Í.M();
        }

        public p.A A() {
            return F.this.É;
        }

        // $FF: synthetic method
        _A(Object var2) {
            this();
        }
    }

    private class _D implements B {
        private _D() {
        }

        public void B() {
            F.this.Í.M();
        }

        public void C() {
            F.this.Í.I();
        }

        public p.A A() {
            return F.this.Ò;
        }

        // $FF: synthetic method
        _D(Object var2) {
            this();
        }
    }

    private class _M implements e.C {
        private B Q;

        public _M(B var2) {
            assert var2 != null;

            this.Q = var2;
        }

        public void A() {
            F.this.Ñ.A(F.this.Í);
            this.Q.B();
            if (F.this.Ñ.D(F.this.Í)) {
                this.Q.C();
            } else {
                this.Q.A().A((Object) F.this.Í);
                F.this.£.A();
            }

            F.this.Ñ.B(F.this.Í);
        }
    }

    private class _C implements N {
        public void B() {
        }

        public void A() {
        }

        public void C() {
        }
    }

    private class _N implements N {
        private final c.D C = new c.D();

        public _N() {
        }

        public void B() {
            F.this.Ñ.J();
            this.C.D();
            if (this.C.B() >= F.this.Â._) {
                F.this.Í.D = false;
                F.this.P();
                F.this.Ñ.C();
                F.this.Ñ.G();
            }

        }

        public void A() {
            F.this.Ç.A();
        }

        public void C() {
        }
    }

    private class _F implements N {
        private _F() {
        }

        public void B() {
            o.B var1 = F.this.Í.J();
            F.this.Ñ.J();
            if (var1 != F.this.Í.J()) {
                F.this.Í.A = false;
                F.this.£ = F.this.new _N();
            }

        }

        public void A() {
        }

        public void C() {
            if (F.this.Ó) {
                final J var1 = F.this.Í;
                D var2 = F.this.¢;
                F.this.¢ = F.this.Í.K();
                F.this.Ñ.A(F.this.Í);
                F.this.A(var2, false, new e.C() {
                    public void A() {
                        F.this.Ï.A((Object) var1);
                    }
                });
            }

        }

        // $FF: synthetic method
        _F(Object var2) {
            this();
        }
    }

    private class _I implements e.C {
        private _I() {
        }

        public void A() {
            F.this.º.C();
            F.this.Ô.A((Object) F.this.Í);
        }

        // $FF: synthetic method
        _I(Object var2) {
            this();
        }
    }
}
