package h;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.glu.gl2.GLUgl2;
import com.jogamp.opengl.util.texture.TextureData;
import com.jogamp.opengl.util.texture.TextureIO;
import l.TexelFunction;
import startup.Startup;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

import static com.jogamp.opengl.GL.*;
import static com.jogamp.opengl.GL2ES1.GL_MODULATE;
import static com.jogamp.opengl.GL2ES1.GL_TEXTURE_ENV;
import static com.jogamp.opengl.GL2ES1.GL_TEXTURE_ENV_MODE;

public class Texture implements Deleteable {
    private static final int[] formats = {0, GL_LUMINANCE, 2, GL_RGB, 4};

    private final int[] texture = new int[1];

    public Texture() {
        GL2 gl2 = Startup.gl2;
        gl2.glGenTextures(1, this.texture, 0);
        bindTexture();

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
            bindTexture();
            new GLUgl2().gluBuild2DMipmaps(GL_TEXTURE_2D, 2, data.getWidth(), data.getHeight(), data.getPixelFormat(), data.getPixelType(), data.getBuffer());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void generate(TexelFunction f, int width, int height) {
        byte[] array = new byte[width * height];
        double deltaX = 1.0 / (double) width;
        double halfDeltaX = 0.5 * deltaX;
        double deltaY = 1.0 / (double) height;
        double halfDeltaY = 0.5 * deltaY;
        int i = 0;

        for (int intY = 0; intY < height; ++intY) {
            double y = intY * deltaY;

            for (int intX = 0; intX < width; ++intX) {
                double x = intX * deltaX;

                double a = f.apply(x, y);
                double b = f.apply(x + halfDeltaX, y);
                double c = f.apply(x, y + halfDeltaY);
                double d = f.apply(x + halfDeltaX, y + halfDeltaY);
                double average = (a + b + c + d) * 0.25;
                array[i++] = (byte) (average * 255.99609375);
            }
        }

        this.bindTexture();
        new GLUgl2().gluBuild2DMipmaps(GL_TEXTURE_2D, 1, width, height, formats[1], GL_UNSIGNED_BYTE, ByteBuffer.wrap(array));
    }

    public void delete() {
        Startup.gl2.glDeleteTextures(1, this.texture, 0);
    }
}
