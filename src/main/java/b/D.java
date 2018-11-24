package b;

import com.jogamp.opengl.GL2;
import n.I;
import startup.Startup;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class D implements g.A {
    private p.A H;
    private I L;
    private Queue G;
    private c.A F;
    private float K;
    private float I;

    public D(I var2, float var3, float var4) {
        assert var2 != null;

        this.L = var2;
        this.G = new LinkedList();
        Iterator var5 = this.L.iterator();

        while (var5.hasNext()) {
            n.D var6 = (n.D) var5.next();
            this.B(var6);
        }

        this.F = new c.A(0, 0.0F, 0.0F);
        this.L.D().B(new D._A());
        this.H = new p.B();
        this.K = var3;
        this.I = var4;
    }

    private void B(n.D var1) {
        this.G.offer(new C(var1));
    }

    public void B() {
        GL2 var1 = Startup.gl2;
        this.F.B();
        float var2 = this.F.A();
        Iterator var3 = this.G.iterator();

        while (var3.hasNext()) {
            C var4 = (C) var3.next();
            var1.glPushMatrix();
            var2 += -10.0F;
            var1.glTranslatef(this.K, this.I, var2);
            var4.B();
            var1.glPopMatrix();
        }

    }

    public p.A C() {
        return this.H;
    }

    public c.A D() {
        return this.F;
    }

    private class _A implements p.C<n.D> {
        private _A() {
        }

        public void A(n.D var1) {
            D.this.B(var1);
            D.this.F = new c.A(j.A.B(-4), -10.0F, 0.0F);
            D.this.H.A(D.this.G.poll());
        }

        // $FF: synthetic method
        _A(Object var2) {
            this();
        }
    }
}
