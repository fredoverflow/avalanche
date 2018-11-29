package b;

import com.jogamp.opengl.GL2;
import g.Renderable;
import h.Element;
import h.Text;
import startup.Startup;

import java.util.Random;

public class F implements Renderable {
    private static final float _ = 0.0F;
    private F._A[] b;
    private long d;
    private static final Random a = new Random();
    private static final float c = -30.0F;

    public F(int var2) {
        this.d = System.nanoTime();
        this.b = new F._A[var2];

        for (int var3 = 0; var3 < var2; ++var3) {
            this.b[var3] = new F._A();
        }

    }

    public void F() {
        this.d = System.nanoTime();

        for (int var1 = 0; var1 < this.b.length; ++var1) {
            if (this.b[var1].A()) {
                this.b[var1] = new F._A();
            }
        }

    }

    public void render() {
        GL2 var1 = Startup.gl2;
        this.F();
        Text.elements.get("monster").enable();
        var1.glDisable(3553);
        var1.glEnable(3042);
        var1.glBlendFunc(770, 771);
        F._A[] var2 = this.b;
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            F._A var5 = var2[var4];
            var5.B();
        }

        var1.glEnable(3553);
        var1.glDisable(3042);
        Text.elements.get("monster").disable();
    }

    private class _A {
        private long G;
        private float P;
        private float N;
        private float Q;
        private float A;
        private float M;
        private float K;
        private float J;
        private float H;
        private float D;
        private float C;
        private float B;
        private float L;
        private float I;
        private float f;
        private float E;
        private float O;

        public _A() {
            this.Q = (float) (F.a.nextInt(512) - 256) / 16.0F;
            this.A = (float) (F.a.nextInt(512) - 256) / 16.0F;
            this.M = (float) (F.a.nextInt(512) - 256) / 16.0F + -30.0F;
            this.K = (float) (F.a.nextInt(512) - 256) / 256.0F;
            this.J = (float) (F.a.nextInt(512) - 256) / 256.0F;
            this.H = (float) (F.a.nextInt(512) - 256) / 256.0F;
            this.P = (float) F.a.nextInt(50) / 10.0F + 5.0F;
            double var2 = (double) F.a.nextInt(360) * 3.141592653589793D / 2.0D;
            double var4 = (double) (F.a.nextInt(180) - 90) * 3.141592653589793D / 2.0D;
            float var6 = (float) Math.cos(var4);
            this.D = var6 * (float) Math.sin(var2);
            this.C = (float) Math.sin(var4);
            this.B = var6 * (float) Math.cos(var2);
            this.L = (float) F.a.nextInt(360) * 0.25F;
            this.G = F.this.d;
            this.A();
        }

        public boolean A() {
            this.N = (float) (F.this.d - this.G) / 1.0E9F;
            this.I = this.Q + this.K * this.N;
            this.f = this.A + this.J * this.N - this.N * this.N * 0.0F;
            this.E = this.M + this.H * this.N;
            this.O = this.L * this.N;
            return this.N >= this.P;
        }

        public void B() {
            GL2 var1 = Startup.gl2;
            var1.glPushMatrix();
            var1.glTranslatef(this.I, this.f, this.E);
            var1.glRotatef(this.O, this.D, this.C, this.B);
            var1.glColor4f(1.0F, 1.0F, 1.0F, (float) Math.sin((double) (this.N / this.P) * 3.141592653589793D) * 0.5F);
            Text.elements.get("monster").draw(0);
            var1.glPopMatrix();
        }
    }
}
