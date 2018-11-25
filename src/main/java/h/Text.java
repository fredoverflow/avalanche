package h;

import com.jogamp.opengl.GL2;
import startup.Startup;

import static com.jogamp.opengl.GL.*;
import static com.jogamp.opengl.GL2ES3.GL_QUADS;
import static com.jogamp.opengl.fixedfunc.GLLightingFunc.GL_LIGHTING;

public class Text {
    public static final float ALIGN_LEFT = 0.0F;
    public static final float ALIGN_CENTER = 0.5F;
    public static final float ALIGN_RIGHT = 1.0F;

    public static final D B = new D();
    public static final D A = new D();

    public static void A() {
        B.A();
        A.A();
    }

    public static void draw(String text, float x, float y, float z, float width, float alignment) {
        GL2 gl2 = Startup.gl2;
        ((A) B.B("charset")).bindTexture();

        gl2.glEnable(GL_BLEND);
        gl2.glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        gl2.glDisable(GL_DEPTH_TEST);
        gl2.glDisable(GL_LIGHTING);

        gl2.glBegin(GL_QUADS);
        gl2.glNormal3f(0.0F, 0.0F, 1.0F);
        x -= text.length() * width * alignment;

        for (int i = 0; i < text.length(); ++i) {
            int ch = text.charAt(i) & 127;
            int row = ch >> 4;
            int col = ch & 15;

            float u0 = col / 16.0F;
            float u1 = u0 + 0.0625F;
            float v0 = row / 8.0F;
            float v1 = v0 + 0.125F;

            gl2.glTexCoord2f(u0, v1);
            gl2.glVertex3f(x + width * i, y, z);

            gl2.glTexCoord2f(u1, v1);
            gl2.glVertex3f(x + width * (i + 1), y, z);

            gl2.glTexCoord2f(u1, v0);
            gl2.glVertex3f(x + width * (i + 1), y + 2.0F * width, z);

            gl2.glTexCoord2f(u0, v0);
            gl2.glVertex3f(x + width * i, y + 2.0F * width, z);
        }

        gl2.glEnd();
        gl2.glEnable(GL_LIGHTING);
        gl2.glEnable(GL_DEPTH_TEST);
        gl2.glDisable(GL_BLEND);
    }
}
