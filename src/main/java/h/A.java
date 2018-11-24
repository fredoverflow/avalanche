package h;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.glu.gl2.GLUgl2;
import com.jogamp.opengl.util.texture.TextureData;
import com.jogamp.opengl.util.texture.TextureIO;
import startup.Startup;

import java.io.IOException;
import java.nio.ByteBuffer;

public class A implements C {
    private int[] H;
    private static int[] J = new int[]{0, 6409, 2, 6407, 4};

    public A() {
        this.H = new int[1];
        GL2 var2 = Startup.gl2;
        var2.glGenTextures(1, this.H, 0);
        this.E();
        var2.glTexEnvf(8960, 8704, 8448.0F);
        var2.glTexParameterf(3553, 10241, 9987.0F);
        var2.glTexParameterf(3553, 10240, 9729.0F);
        var2.glTexParameterf(3553, 10242, 10497.0F);
        var2.glTexParameterf(3553, 10243, 10497.0F);
        var2.glEnable(3553);
    }

    public void E() {
        Startup.gl2.glBindTexture(3553, this.H[0]);
    }

    public void A(byte[] var1, int var2, int var3, int var4) {
        this.E();
        (new GLUgl2()).gluBuild2DMipmaps(3553, var4, var2, var3, J[var4], 5121, ByteBuffer.wrap(var1));
    }

    public void A(String var1, String var2) {
        try {
            GLProfile profile = GLProfile.getDefault();
            TextureData var3 = TextureIO.newTextureData(profile, getClass().getResourceAsStream(var1), false, var2);
            System.out.println(var3.getPixelType());
            this.E();
            (new GLUgl2()).gluBuild2DMipmaps(3553, 2, var3.getWidth(), var3.getHeight(), var3.getPixelFormat(), var3.getPixelType(), var3.getBuffer());
        } catch (IOException var4) {
            var4.printStackTrace();
        }

    }

    public void A(l.B var1, int var2, int var3) {
        byte[] var4 = new byte[var2 * var3];
        double var5 = 1.0D / (double) var2;
        double var7 = 0.5D * var5;
        double var9 = 1.0D / (double) var3;
        double var11 = 0.5D * var9;
        int var13 = 0;

        for (int var14 = 0; var14 < var3; ++var14) {
            double var15 = (double) var14 * var9;

            for (int var17 = 0; var17 < var2; ++var17) {
                double var18 = (double) var17 * var5;
                double var20 = var1.A(var18, var15);
                double var22 = var1.A(var18 + var7, var15);
                double var24 = var1.A(var18, var15 + var11);
                double var26 = var1.A(var18 + var7, var15 + var11);
                double var28 = (var20 + var22 + var24 + var26) * 0.25D;
                var4[var13++] = (byte) ((int) (var28 * 255.99609375D));
            }
        }

        this.A(var4, var2, var3, 1);
    }

    public void A() {
        Startup.gl2.glDeleteTextures(1, this.H, 0);
    }
}
