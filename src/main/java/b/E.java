package b;

import com.jogamp.opengl.GL2;
import n.J;
import startup.Startup;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class E implements g.A {
    private n.F T;
    private D X;
    private Map R;
    private C U;
    private c.A W;
    private c.A V;
    private c.A Y;
    private B Q;
    private B S;
    private B P;
    private q.A N;

    public E(n.F var2) {
        this.T = var2;
        this.R = new HashMap();
        Iterator var3 = this.T.iterator();

        while (var3.hasNext()) {
            J var4 = (J) var3.next();
            this.B(var4);
        }

        this.U = new C(this.T.Q());
        this.U.A(0.125F);
        this.W = new c.A(this.T.¥ + 3);
        this.V = new c.A(this.T.¤);
        this.Y = new c.A(0);
        this.Q = new B(new E._E());
        this.S = new B(new E._G());
        this.P = new B(new E._B());
        this.T.O().B(new E._D());
        this.T.R().B(new E._H());
        this.T.Å.B(new E._L());
        this.T.Ò.B(new E._F());
        this.T.É.B(new E._A());
        this.T.V().B(new E._K());
        this.T.X().B(new E._I());
        this.T.Ï.B(new E._J());
        this.N = new q.A();
        this.X = new D(var2.Z(), (float) this.T.¥, (float) this.T.¤);
        this.X.C().B(new E._C());
    }

    public void B() {
        GL2 var1 = Startup.gl2;
        var1.glTexGeni(8193, 9472, 9217);
        var1.glTexGeni(8192, 9472, 9217);
        var1.glTexGenfv(8192, 9473, new float[]{0.1F, 0.0F, 0.0F, 0.0F}, 0);
        var1.glTexGenfv(8193, 9473, new float[]{0.0F, 0.1F, 0.0F, 0.0F}, 0);
        var1.glEnable(3168);
        var1.glEnable(3169);
        float var2 = (float) Math.sin((double) ((float) System.nanoTime() / 2.5E9F));
        var1.glPushMatrix();
        float var3 = (float) (this.T.b() / 2);
        float var4 = (float) (this.T.c() / 2);
        var1.glRotatef(0.0F, 0.0F, 1.0F, 0.0F);
        var1.glTranslatef(-var3, -var4, 0.0F);
        var1.glColor4f(0.43820223F, 0.43820223F, 1.0F, 1.0F);
        ((h.A) h.B.B.B("border")).E();
        h.E var5 = (h.E) h.B.A.B("border side");
        var5.C();
        var1.glPushMatrix();
        var1.glTranslatef(1.0F, 0.0F, 0.0F);
        var5.D();
        var1.glTranslatef((float) (this.T.b() - 2), 0.0F, 0.0F);
        var5.D();
        var1.glPopMatrix();
        var1.glPushMatrix();
        var5 = (h.E) h.B.A.B("border bottom");
        var5.C();
        var1.glTranslatef(-1.0F, -2.0F, 0.0F);
        var1.glRotatef(-45.0F, 1.0F, 0.0F, 0.0F);
        var5.D();
        var5.B();
        var1.glPopMatrix();
        ((h.A) h.B.B.B("marble")).E();
        ((h.E) h.B.A.B("monster")).C();
        this.X.B();
        Iterator var6 = this.R.entrySet().iterator();

        while (var6.hasNext()) {
            Entry var7 = (Entry) var6.next();
            J var8 = (J) var7.getKey();
            C var9 = (C) var7.getValue();
            var3 = (float) var8.P();
            if (var8 == this.T.U()) {
                var4 = j.A.A((float) this.T.Y());
                var1.glPushMatrix();
                var1.glTranslatef(var3, var4, 0.0F);
                var1.glEnable(3042);
                var1.glDisable(2929);
                var1.glBlendFunc(770, 771);
                this.S.A(var8);
                this.Q.A(var8);
                var9.B();
                var1.glDisable(3042);
                var1.glEnable(2929);
                var1.glPopMatrix();
                this.Y.B();
                var3 += this.Y.A();
            }

            var4 = j.A.A((float) var8.D());
            var1.glPushMatrix();
            var1.glTranslatef(var3, var4, 0.0F);
            this.S.A(var8);
            this.Q.A(var8);
            this.P.A(var8);
            var9.B();
            var1.glPopMatrix();
        }

        var1.glPushMatrix();
        this.W.B();
        this.V.B();
        var1.glTranslatef(this.W.A(), this.V.A(), 0.0F);
        var1.glEnable(3042);
        var1.glDisable(2929);
        var1.glBlendFunc(770, 771);
        this.U.B();
        var1.glDisable(3042);
        var1.glEnable(2929);
        var1.glPopMatrix();
        this.N.A();
        this.N.B();
        ((h.E) h.B.A.B("monster")).B();
        var1.glEnable(3553);
        var1.glDisable(3168);
        var1.glDisable(3169);
        var1.glPopMatrix();
    }

    private void B(J var1) {
        this.R.put(var1, new C(var1.K()));
    }

    private void A(J var1) {
        this.R.remove(var1);
    }

    private class _I implements p.C<List<J>> {
        private _I() {
        }

        public void A(List<J> var1) {
            Iterator var2 = var1.iterator();
            J var3 = (J) var2.next();
            E.this.A(var3);
            J var4 = (J) var2.next();
            q.C var5 = new q.C(var4, j.A.A(4), j.A.P, j.A.B(-4));
            E.this.N.A(var5);

            while (var2.hasNext()) {
                E.this.B((J) var2.next());
            }

        }

        // $FF: synthetic method
        _I(Object var2) {
            this();
        }
    }

    private class _K implements p.C {
        private _K() {
        }

        public void A(Object var1) {
            Iterator var2 = E.this.R.keySet().iterator();

            while (var2.hasNext()) {
                J var3 = (J) var2.next();
                q.C var4 = new q.C(var3, j.A.A(4), j.A.P, j.A.B(1));
                E.this.N.A(var4);
            }

            E.this.R.clear();
        }

        // $FF: synthetic method
        _K(Object var2) {
            this();
        }
    }

    private class _J implements p.C<J> {
        private _J() {
        }

        public void A(J var1) {
            C var2 = (C) E.this.R.get(var1);
            E.this.R.remove(var1);
            E.this.R.put(E.this.T.U(), E.this.U);
            E.this.U = var2;
            E.this.W = new c.A(j.A.U, (float) var1.P(), (float) (E.this.T.¥ + 3));
            E.this.V = new c.A(j.A.U, j.A.A((float) var1.D()), (float) E.this.T.¤);
            E.this.Y = new c.A(j.A.U, 3.0F, 0.0F);
        }

        // $FF: synthetic method
        _J(Object var2) {
            this();
        }
    }

    private class _A implements p.C<J> {
        private _A() {
        }

        public void A(J var1) {
            E.this.S.A(var1, new c.A(j.A.O, -1.0F, 0.0F));
        }

        // $FF: synthetic method
        _A(Object var2) {
            this();
        }
    }

    private class _F implements p.C<J> {
        private _F() {
        }

        public void A(J var1) {
            E.this.S.A(var1, new c.A(j.A.O, 1.0F, 0.0F));
        }

        // $FF: synthetic method
        _F(Object var2) {
            this();
        }
    }

    private class _L implements p.C<J> {
        private _L() {
        }

        public void A(J var1) {
            C var2 = (C) E.this.R.get(var1);
            n.D var3 = var1.K();
            var2.A(var3);
            E.this.Q.A(var1, new c.A(j.A.K, 90.0F, 0.0F));
        }

        // $FF: synthetic method
        _L(Object var2) {
            this();
        }
    }

    private class _H implements p.C<J> {
        private _H() {
        }

        public void A(J var1) {
            E.this.A(var1);
        }

        // $FF: synthetic method
        _H(Object var2) {
            this();
        }
    }

    private class _D implements p.C<J> {
        private _D() {
        }

        public void A(J var1) {
            E.this.B(var1);
        }

        // $FF: synthetic method
        _D(Object var2) {
            this();
        }
    }

    private class _B implements A {
        private _B() {
        }

        public void A(float var1) {
            Startup.gl2.glTranslatef(0.0F, 0.0F, var1);
        }

        // $FF: synthetic method
        _B(Object var2) {
            this();
        }
    }

    private class _G implements A {
        private _G() {
        }

        public void A(float var1) {
            Startup.gl2.glTranslatef(var1, 0.0F, 0.0F);
        }

        // $FF: synthetic method
        _G(Object var2) {
            this();
        }
    }

    private class _E implements A {
        private _E() {
        }

        public void A(float var1) {
            GL2 var2 = Startup.gl2;
            float var3 = E.this.T.U().G() < 2 ? 2.0F : 1.5F;
            var2.glTranslatef(var3, var3, 0.0F);
            var2.glRotatef(var1, 0.0F, 0.0F, 1.0F);
            var2.glTranslatef(-var3, -var3, 0.0F);
        }

        // $FF: synthetic method
        _E(Object var2) {
            this();
        }
    }

    private class _C implements p.C<C> {
        private _C() {
        }

        public void A(C var1) {
            J var2 = E.this.T.U();
            E.this.R.put(var2, var1);
            E.this.P.A(var2, E.this.X.D());
        }

        // $FF: synthetic method
        _C(Object var2) {
            this();
        }
    }
}
