package h;

import com.jogamp.opengl.GL2;
import startup.Startup;

public class B {
    public static final float D = 0.0F;
    public static final float E = 0.5F;
    public static final float C = 1.0F;
    public static final D B = new D();
    public static final D A = new D();

    public static void A() {
        B.A();
        A.A();
    }

    public static void A(String var1, float var2, float var3, float var4, float var5, float var6) {
        ((A) B.B("charset")).E();
        GL2 var0 = Startup.gl2;
        var0.glEnable(3042);
        var0.glBlendFunc(770, 771);
        var0.glDisable(2929);
        var0.glDisable(2896);
        var0.glBegin(7);
        var0.glNormal3f(0.0F, 0.0F, 1.0F);
        var2 -= (float) var1.length() * var5 * var6;

        for (int var7 = 0; var7 < var1.length(); ++var7) {
            int var8 = var1.charAt(var7) & 127;
            int var9 = var8 >> 4;
            int var10 = var8 & 15;
            float var11 = (float) var10 / 16.0F;
            float var12 = var11 + 0.0625F;
            float var13 = (float) var9 / 8.0F;
            float var14 = var13 + 0.125F;
            var0.glTexCoord2f(var11, var14);
            var0.glVertex3f(var2 + var5 * (float) var7, var3, var4);
            var0.glTexCoord2f(var12, var14);
            var0.glVertex3f(var2 + var5 * (float) (var7 + 1), var3, var4);
            var0.glTexCoord2f(var12, var13);
            var0.glVertex3f(var2 + var5 * (float) (var7 + 1), var3 + 2.0F * var5, var4);
            var0.glTexCoord2f(var11, var13);
            var0.glVertex3f(var2 + var5 * (float) var7, var3 + 2.0F * var5, var4);
        }

        var0.glEnd();
        var0.glEnable(2896);
        var0.glEnable(2929);
        var0.glDisable(3042);
    }
}
