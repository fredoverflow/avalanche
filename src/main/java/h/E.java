package h;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLContext;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class E implements C {
    private final GLContext E;
    private final int[] C = new int[2];
    private int F;
    private int[] G;
    private int[] D;

    public E(GLContext var1) {
        this.E = var1;
        var1.getGL().glGenBuffers(2, this.C, 0);
    }

    public void A(f.D var1) {
        GL var2 = this.E.getGL();
        this.G = var1.D();
        this.D = var1.N();
        var2.glBindBuffer(34962, this.C[0]);
        FloatBuffer var3 = var1.A();
        var2.glBufferData(34962, var3.capacity() * 4, var3, 35044);
        var2.glBindBuffer(34963, this.C[1]);
        IntBuffer var4 = var1.J();
        this.F = var4.capacity();
        var2.glBufferData(34963, this.F * 4, var4, 35044);
        int var5 = var3.capacity();
        System.out.printf("vertices: %d\n indices: %d\nmemory: %d KiB\n", var5, this.F, (var5 + this.F) / 256);
    }

    public void C() {
        GL2 var1 = this.E.getGL().getGL2();
        var1.glBindBuffer(34962, this.C[0]);
        var1.glBindBuffer(34963, this.C[1]);
        var1.glEnableClientState(32884);
        var1.glEnableClientState(32885);
        var1.glVertexPointer(3, 5126, 24, 0L);
        var1.glNormalPointer(5126, 24, 12L);
    }

    public void D() {
        this.E.getGL().glDrawElements(4, this.F, 5125, 0L);
    }

    public void A(int var1) {
        this.E.getGL().glDrawElements(4, this.D[var1], 5125, (long) (this.G[var1] * 4));
    }

    public void B() {
        GL2 var1 = this.E.getGL().getGL2();
        var1.glDisableClientState(32885);
        var1.glDisableClientState(32884);
        var1.glBindBuffer(34963, 0);
        var1.glBindBuffer(34962, 0);
    }

    public void A() {
        this.E.getGL().glDeleteBuffers(2, this.C, 0);
    }
}
