package q;

import com.jogamp.opengl.GL2;
import n.J;
import o.D;
import o.H;
import startup.Startup;

import java.util.Random;

public class C implements B {
    private static final Random q = new Random();
    private b.C p;
    private o.B n;
    private o.B t;
    private o.B r;
    private c.A s;

    public C(J var2, int var3, int var4, int var5) {
        this.p = new b.C(var2.K());
        this.n = new H(j.A.C(var2.P()), q.nextInt(var3 + 1) * 2 - var3);
        this.t = new D(var2.D(), 0, var4);
        this.r = new H(0, q.nextInt(var3 + 1));
        this.s = new c.A(var5, 1.0F, 0.0F);
    }

    public void A() {
        this.n.D();
        this.t.D();
        this.r.D();
        this.s.B();
    }

    public boolean K() {
        return this.s.C();
    }

    public void B() {
        GL2 var1 = Startup.gl2;
        var1.glPushMatrix();
        var1.glTranslated((double) j.A.A((float) this.n.C()), (double) j.A.A((float) this.t.C()), (double) j.A.A((float) this.r.C()));
        var1.glEnable(3042);
        var1.glBlendFunc(770, 771);
        this.p.A(this.s.A());
        this.p.B();
        var1.glDisable(3042);
        var1.glPopMatrix();
    }
}
