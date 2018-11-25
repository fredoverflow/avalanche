package h;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.glu.gl2.GLUgl2;
import com.jogamp.opengl.util.texture.TextureData;
import com.jogamp.opengl.util.texture.TextureIO;
import startup.Startup;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

import static com.jogamp.opengl.GL.*;
import static com.jogamp.opengl.GL2ES1.GL_MODULATE;
import static com.jogamp.opengl.GL2ES1.GL_TEXTURE_ENV;
import static com.jogamp.opengl.GL2ES1.GL_TEXTURE_ENV_MODE;

public class Texture implements Deleteable {
    private static final int[] formats = new int[]{0, GL_LUMINANCE, 2, GL_RGB, 4};

    private int[] texture;

    public Texture() {
        this.texture = new int[1];
        GL2 gl2 = Startup.gl2;
        gl2.glGenTextures(1, this.texture, 0);
        this.bindTexture();

        gl2.glTexEnvi(GL_TEXTURE_ENV, GL_TEXTURE_ENV_MODE, GL_MODULATE);
        gl2.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
        gl2.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR_MIPMAP_LINEAR);
        gl2.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_REPEAT);
        gl2.glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_REPEAT);
        gl2.glEnable(GL_TEXTURE_2D);
    }

    public void bindTexture() {
        Startup.gl2.glBindTexture(GL_TEXTURE_2D, this.texture[0]);
    }

    public void load(String resourceName, String extension) {
        try {
            GLProfile profile = GLProfile.getDefault();
            InputStream stream = getClass().getResourceAsStream(resourceName);
            TextureData data = TextureIO.newTextureData(profile, stream, false, extension);
            this.bindTexture();
            (new GLUgl2()).gluBuild2DMipmaps(GL_TEXTURE_2D, 2, data.getWidth(), data.getHeight(), data.getPixelFormat(), data.getPixelType(), data.getBuffer());
        } catch (IOException ex) {
            ex.printStackTrace();
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

    private void A(byte[] var1, int var2, int var3, int var4) {
        this.bindTexture();
        (new GLUgl2()).gluBuild2DMipmaps(GL_TEXTURE_2D, var4, var2, var3, formats[var4], GL_UNSIGNED_BYTE, ByteBuffer.wrap(var1));
    }

    public void delete() {
        Startup.gl2.glDeleteTextures(1, this.texture, 0);
    }
}
