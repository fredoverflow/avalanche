package startup;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.Animator;
import h.E;
import l.b.C;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;

public class Startup {
    public static GL2 gl2;

    private static final GLU C = new GLU();
    private static final double B = 1.5707963267948966D;
    private static final double A = 32.0D;

    public static void main(String[] var0) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Frame frame = new Frame();
                frame.setSize(1024, 768);
                frame.setVisible(true);

                a.B D = new a.B();

                GLEventListener glEventListener = new GLEventListener() {
                    @Override
                    public void init(GLAutoDrawable var1) {
                        GL2 var2 = var1.getGL().getGL2();
                        gl2 = var2;
                        var2.glClearColor(0.43820223F, 0.43820223F, 1.0F, 1.0F);
                        var2.glEnable(2929);
                        var2.glFrontFace(2305);
                        var2.glCullFace(1029);
                        var2.glEnable(2884);
                        float[] var4 = new float[]{0.43820223F, 0.43820223F, 1.0F, 1.0F};
                        var2.glFogi(2917, 9729);
                        var2.glFogfv(2918, var4, 0);
                        var2.glFogf(2914, 0.35F);
                        var2.glHint(3156, 4352);
                        var2.glFogf(2915, 25.0F);
                        var2.glFogf(2916, 100.0F);
                        var2.glEnable(2912);
                        ((h.A) h.B.B.A("marble", new h.A())).A(new C(new l.A(2.0D, 4.0D, 12.0D, 0.75D, 0.25D), new l.b.B(5.0D)),
                                512, 512);
                        ((h.A) h.B.B.A("charset", new h.A())).A("/charset.png", "png");
                        ((h.A) h.B.B.A("border", new h.A())).A(new l.A(2.0D, 16.0D, 48.0D, 1.0D, 0.5D), 512, 512);
                        ((E) h.B.A.A("border bottom", new E())).A(new f.B(20.0F, 72, 2.0F, 0.0D, 6.283185307179586D, 64));
                        ((E) h.B.A.A("border side", new E())).A((new f.B(24.0F, 96, 2.0F, 0.0D, 6.283185307179586D, 64)).E());
                        float var5 = 0.33333334F;
                        byte var6 = 8;
                        float var8 = -0.5F + var5;
                        float var10 = 0.5F - var5;
                        float var11 = var10 - var8;
                        f.C var12 = new f.C(var8, var8, var10, var10, 0.5F);
                        f.D[][] var13 = new f.D[4][2];
                        var13[2][0] = new f.C(var8, -0.5F, var10, var8, 0.5F);
                        var13[2][0] = new f.D(new f.D[]{(new f.D(var13[2][0])).G(), var13[2][0]});
                        var13[2][1] = (new f.B(var11, 1, var5, -1.5707963267948966D, 0.0D, var6)).A(var8, var8, var10);
                        var13[2][1] = new f.D(new f.D[]{var13[2][1], (new f.D(new f.D[]{var12, var13[2][1]})).C()});
                        var13[1][0] = (new f.D(var13[2][0])).E();
                        var13[1][1] = (new f.D(var13[2][1])).E();
                        var13[3][0] = (new f.D(var13[1][0])).E();
                        var13[3][1] = (new f.D(var13[1][1])).E();
                        var13[0][0] = (new f.D(var13[3][0])).E();
                        var13[0][1] = (new f.D(var13[3][1])).E();
                        f.D var29 = new f.D(new f.D[]{var12, (new f.D(var12)).G()});
                        f.D[][] var14 = new f.D[4][4];
                        var14[3][0] = new f.D(
                                new f.D[]{new f.C(var10, var10, 0.5F, 0.5F, 0.5F), (new f.C(-0.5F, var10, var8, 0.5F, 0.5F)).G()});
                        f.B var15 = new f.B(var5, 1, var5, 0.0D, 1.5707963267948966D, var6);
                        var14[3][1] = (new f.D(var15)).A(var10, var10, var10);
                        var14[3][1] = new f.D(new f.D[]{var14[3][1],
                                (new f.D(new f.D[]{new f.C(var10, var8, 0.5F, var10, 0.5F), var14[3][1]})).O()});
                        var14[3][2] = (new f.D(var15)).B().A(var10, 0.5F, var10);
                        var14[3][2] = new f.D(new f.D[]{var14[3][2],
                                (new f.D(new f.D[]{new f.C(var8, var10, var10, 0.5F, 0.5F), var14[3][2]})).H()});
                        var14[3][3] = (new f.A(var5, var6)).A(var10, var10, var10);
                        var14[3][3] = new f.D(
                                new f.D[]{var14[3][3],
                                        (new f.D(new f.D[]{
                                                (new f.B(var11, 1, var5, 0.0D, 1.5707963267948966D, var6)).A(var8, var10, var10),
                                                var14[3][3]})).H()});
                        var14[2][0] = (new f.D(var14[3][0])).G();
                        var14[2][1] = (new f.D(var14[3][1])).G();
                        var14[2][2] = (new f.D(var14[3][2])).G();
                        var14[2][3] = (new f.D(var14[3][3])).G();
                        var14[0][0] = (new f.D(var14[2][0])).I();
                        var14[0][1] = (new f.D(var14[2][1])).I();
                        var14[0][2] = (new f.D(var14[2][2])).I();
                        var14[0][3] = (new f.D(var14[2][3])).I();
                        var14[1][0] = (new f.D(var14[0][0])).G();
                        var14[1][1] = (new f.D(var14[0][1])).G();
                        var14[1][2] = (new f.D(var14[0][2])).G();
                        var14[1][3] = (new f.D(var14[0][3])).G();
                        f.D var16 = new f.D(new f.D[]{var14[0][0], var14[0][1], var14[0][2], var14[0][3], var14[1][0], var14[1][1],
                                var14[1][2], var14[1][3], var14[2][0], var14[2][1], var14[2][2], var14[2][3], var14[3][0], var14[3][1],
                                var14[3][2], var14[3][3], var13[0][0], var13[0][1], var13[1][0], var13[1][1], var13[2][0], var13[2][1],
                                var13[3][0], var13[3][1], var29});
                        int[][] var17 = new int[256][];

                        for (int var18 = 0; var18 < 256; ++var18) {
                            int[] var19 = new int[13];
                            boolean var20 = (var18 & 1) != 0;
                            boolean var21 = (var18 & 2) != 0;
                            boolean var22 = (var18 & 4) != 0;
                            boolean var23 = (var18 & 8) != 0;
                            boolean var24 = (var18 & 16) != 0 & var22 & var20;
                            boolean var25 = (var18 & 32) != 0 & var22 & var21;
                            boolean var26 = (var18 & 64) != 0 & var23 & var20;
                            boolean var27 = (var18 & 128) != 0 & var23 & var21;
                            byte var28 = 0;
                            int var30 = var28 + 1;
                            var19[var28] = 24;
                            var19[var30++] = var20 ? 16 : 17;
                            var19[var30++] = var21 ? 18 : 19;
                            var19[var30++] = var22 ? 20 : 21;
                            var19[var30++] = var23 ? 22 : 23;
                            var19[var30++] = var24 ? 0 : (var20 ? 1 : (var22 ? 2 : 3));
                            if (!var24 & var22 & var20) {
                                var19[var30++] = 2;
                            }

                            var19[var30++] = var25 ? 4 : (var21 ? 5 : (var22 ? 6 : 7));
                            if (!var25 & var22 & var21) {
                                var19[var30++] = 6;
                            }

                            var19[var30++] = var26 ? 8 : (var20 ? 9 : (var23 ? 10 : 11));
                            if (!var26 & var23 & var20) {
                                var19[var30++] = 10;
                            }

                            var19[var30++] = var27 ? 12 : (var21 ? 13 : (var23 ? 14 : 15));
                            if (!var27 & var23 & var21) {
                                var19[var30++] = 14;
                            }

                            System.arraycopy(var19, 0, var17[var18] = new int[var30], 0, var30);
                        }

                        final Animator var30 = new Animator(var1);
                        frame.addWindowListener(new WindowAdapter() {
                            public void windowClosing(WindowEvent var1) {
                                (new Thread(new Runnable() {
                                    public void run() {
                                        var30.stop();
                                        System.exit(0);
                                    }
                                })).start();
                            }
                        });
                        var30.start();

                        ((E) h.B.A.A("monster", new E())).A(new f.D(var16, var17));
                        gl2 = null;
                    }

                    public void display(GLAutoDrawable var1) {
                        c.D.A();

                        while (c.D.C()) {
                            D.A();
                            c.D.E();
                        }

                        D.i();
                        GL2 var2 = var1.getGL().getGL2();
                        gl2 = var2;
                        int var3 = var1.getSurfaceWidth();
                        int var4 = var1.getSurfaceHeight();
                        var2.glClear(16384);
                        Iterator var5 = D.iterator();

                        while (var5.hasNext()) {
                            k.A var6 = (k.A) var5.next();
                            int var7 = (int) (var6.G() * (float) var3);
                            int var8 = (int) (var6.I() * (float) var4);
                            int var9 = (int) (var6.J() * (float) var3);
                            int var10 = (int) (var6.H() * (float) var4);
                            var2.glViewport(var7, var8, var9, var10);
                            var2.glMatrixMode(5889);
                            var2.glLoadIdentity();
                            C.gluPerspective(45.0D, (double) var9 / (double) var10, 1.0D, 1000.0D);
                            var2.glClear(256);
                            var2.glMatrixMode(5888);
                            var2.glLoadIdentity();
                            var2.glTranslatef(0.0F, 0.0F, -32.0F);
                            float var11 = 0.05F;
                            float var12 = 0.5F;
                            float var13 = 1.0F;
                            float[] var14 = new float[]{var11, var11, var11, 1.0F};
                            float[] var15 = new float[]{var12, var12, var12, 1.0F};
                            float[] var16 = new float[]{var13, var13, var13, 1.0F};
                            float[] var17 = new float[]{-10.0F, 10.0F, 10.0F, 1.0F};
                            var2.glLightfv(16384, 4608, var14, 0);
                            var2.glLightfv(16384, 4609, var15, 0);
                            var2.glLightfv(16384, 4610, var16, 0);
                            var2.glLightfv(16384, 4611, var17, 0);
                            var2.glEnable(16384);
                            var2.glEnable(2896);
                            var2.glColorMaterial(1032, 5634);
                            var2.glEnable(2903);
                            var2.glMaterialfv(1028, 4610, var16, 0);
                            var2.glMateriali(1028, 5633, 128);
                            var6.B();
                        }
                    }

                    @Override
                    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
                    }

                    @Override
                    public void dispose(GLAutoDrawable drawable) {
                    }
                };

                GLCanvas glcanvas = new GLCanvas();
                glcanvas.addGLEventListener(glEventListener);
                glcanvas.addKeyListener(D);
                glcanvas.setFocusable(true);
                glcanvas.requestFocus();

                frame.add(glcanvas);
            }
        });
    }
}
