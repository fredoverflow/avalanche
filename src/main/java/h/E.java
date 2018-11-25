package h;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import geometry.Geometry;
import startup.Startup;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class E implements C {
    private final int[] C = new int[2];
    private int F;
    private int[] G;
    private int[] D;

    public E() {
        Startup.gl2.glGenBuffers(2, this.C, 0);
    }

    public void A(Geometry var1) {
        GL2 var2 = Startup.gl2;
        this.G = var1.getOffsets();
        this.D = var1.getLengths();

        var2.glBindBuffer(GL.GL_ARRAY_BUFFER, this.C[0]);
        FloatBuffer var3 = var1.vertexBuffer();
        var2.glBufferData(GL.GL_ARRAY_BUFFER, var3.capacity() * 4, var3, 35044);

        var2.glBindBuffer(GL.GL_ELEMENT_ARRAY_BUFFER, this.C[1]);
        IntBuffer var4 = var1.indexBuffer();
        this.F = var4.capacity();
        var2.glBufferData(GL.GL_ELEMENT_ARRAY_BUFFER, this.F * 4, var4, GL.GL_STATIC_DRAW);

        int var5 = var3.capacity();
        System.out.printf("vertices: %d\n indices: %d\nmemory: %d KiB\n", var5, this.F, (var5 + this.F) / 256);
    }

    public void C() {
        GL2 var1 = Startup.gl2;
        var1.glBindBuffer(34962, this.C[0]);
        var1.glBindBuffer(34963, this.C[1]);
        var1.glEnableClientState(32884);
        var1.glEnableClientState(32885);
        var1.glVertexPointer(3, 5126, 24, 0L);
        var1.glNormalPointer(5126, 24, 12L);
    }

    public void D() {
        Startup.gl2.glDrawElements(4, this.F, 5125, 0L);
    }

    public void A(int var1) {
        Startup.gl2.glDrawElements(4, this.D[var1], 5125, (long) (this.G[var1] * 4));
    }

    public void B() {
        GL2 var1 = Startup.gl2;
        var1.glDisableClientState(32885);
        var1.glDisableClientState(32884);
        var1.glBindBuffer(34963, 0);
        var1.glBindBuffer(34962, 0);
    }

    public void A() {
        Startup.gl2.glDeleteBuffers(2, this.C, 0);
    }
}
