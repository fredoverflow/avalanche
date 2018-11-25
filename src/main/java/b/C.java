package b;

import com.jogamp.opengl.GL2;
import g.Renderable;
import h.Text;
import startup.Startup;

public class C implements Renderable {
    private static final float A = 0.125F;
    private static final float[] E = new float[]{0.5643347F, 0.5643347F, 0.0F, 0.5F, 0.0F, 0.7132669F, 0.7132669F, 0.5F, 0.0F, 0.8517889F, 0.0F, 0.5F, 1.0F, 0.2867333F, 0.2867333F, 0.5F, 0.84388167F, 0.42194083F, 0.0F, 0.5F, 0.43566582F, 0.43566582F, 1.0F, 0.5F, 1.0F, 0.14821129F, 1.0F, 0.5F, 0.54901963F, 0.47058824F, 0.3254902F, 0.5F, 0.5F, 0.5F, 0.5F, 0.5F};
    private n.D C;
    private final float[] B;

    public static float[] A(int var0) {
        int var1 = 4 * var0;
        return new float[]{E[var1], E[var1 + 1], E[var1 + 2], E[var1 + 3]};
    }

    public C(n.D var2) {
        this.A(var2);
        this.B = A(var2.B());
    }

    public void A(n.D var1) {
        this.C = var1;
    }

    public void A(float var1) {
        this.B[3] = var1;
    }

    public void render() {
        GL2 var1 = Startup.gl2;
        var1.glColor4fv(this.B, 0);
        int var2 = 0;

        for (int var3 = this.C.F(); var3 > 0; --var3) {
            for (int var4 = this.C.B(var2); var4 < this.C.A(var2); ++var4) {
                int var5 = this.C.A(var2 - 1, var4) ? 1 : 0;
                int var6 = this.C.A(var2 + 1, var4) ? 2 : 0;
                int var7 = this.C.A(var2, var4 - 1) ? 4 : 0;
                int var8 = this.C.A(var2, var4 + 1) ? 8 : 0;
                int var9 = this.C.A(var2 - 1, var4 - 1) ? 16 : 0;
                int var10 = this.C.A(var2 + 1, var4 - 1) ? 32 : 0;
                int var11 = this.C.A(var2 - 1, var4 + 1) ? 64 : 0;
                int var12 = this.C.A(var2 + 1, var4 + 1) ? 128 : 0;
                h.E var13 = (h.E) Text.A.B("monster");
                var1.glPushMatrix();
                var1.glTranslatef((float) (this.C.A() + var2) + 0.5F, (float) var4 + 0.5F, 0.0F);
                var1.glTexGenfv(8192, 9473, new float[]{0.125F, 0.0F, 0.0F, ((float) var2 + 0.5F) * 0.125F}, 0);
                var1.glTexGenfv(8193, 9473, new float[]{0.0F, 0.125F, 0.0F, ((float) var4 + 0.5F) * 0.125F}, 0);
                var13.A(var5 | var6 | var7 | var8 | var9 | var10 | var11 | var12);
                var1.glPopMatrix();
            }

            ++var2;
        }

    }
}
