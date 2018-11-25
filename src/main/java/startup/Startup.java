package startup;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.Animator;
import geometry.Cylinder;
import geometry.Geometry;
import geometry.SphereOctant;
import geometry.Square;
import h.E;
import l.b.C;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;

public class Startup {
    public static GL2 gl2;

    private static final double _180 = Math.PI;
    private static final double _360 = _180 * 2;
    private static final double _90 = _180 / 2;

    private static final double A = 32.0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Frame frame = new Frame();

                a.B D = new a.B();

                GLEventListener glEventListener = new GLEventListener() {
                    @Override
                    public void init(GLAutoDrawable drawable) {
                        GL2 gl2 = drawable.getGL().getGL2();
                        Startup.gl2 = gl2;

                        gl2.glClearColor(0.43820223F, 0.43820223F, 1.0F, 1.0F);
                        gl2.glEnable(GL.GL_DEPTH_TEST);
                        gl2.glFrontFace(GL.GL_CCW);
                        gl2.glCullFace(GL.GL_BACK);
                        gl2.glEnable(GL.GL_CULL_FACE);

                        gl2.glFogi(GL2ES1.GL_FOG_MODE, GL.GL_LINEAR);
                        gl2.glFogfv(GL2ES1.GL_FOG_COLOR, new float[]{0.43820223F, 0.43820223F, 1.0F, 1.0F}, 0);
                        gl2.glFogf(GL2ES1.GL_FOG_DENSITY, 0.35F);
                        gl2.glHint(GL2ES1.GL_FOG_HINT, GL.GL_DONT_CARE);
                        gl2.glFogf(GL2ES1.GL_FOG_START, 25.0F);
                        gl2.glFogf(GL2ES1.GL_FOG_END, 100.0F);
                        gl2.glEnable(GL2ES1.GL_FOG);

                        h.B.B.A("marble", new h.A()).A(new C(new l.A(2.0, 4.0, 12.0, 0.75, 0.25), new l.b.B(5.0)),
                                512, 512);
                        h.B.B.A("charset", new h.A()).A("/charset.png", "png");
                        h.B.B.A("border", new h.A()).A(new l.A(2.0, 16.0, 48.0, 1.0, 0.5), 512, 512);
                        h.B.A.A("border bottom", new E()).A(new Cylinder(20.0F, 72, 2.0F, 0.0, _360, 64));
                        h.B.A.A("border side", new E()).A((new Cylinder(24.0F, 96, 2.0F, 0.0, _360, 64)).rotateZ90());

                        float third = 0.33333334F;
                        byte eight = 8;
                        float negSixth = third - 0.5F;
                        float posSixth = 0.5F - third;
                        // TODO thirdAgain probably has a different unit than third
                        float thirdAgain = posSixth - negSixth;

                        Square oneSquare = new Square(negSixth, negSixth, posSixth, posSixth, 0.5F);

                        Geometry[][] var13 = new Geometry[4][2];
                        var13[2][0] = new Square(negSixth, -0.5F, posSixth, negSixth, 0.5F);
                        var13[2][0] = new Geometry((new Geometry(var13[2][0])).rotateY180(), var13[2][0]);
                        var13[2][1] = (new Cylinder(thirdAgain, 1, third, -_90, 0.0, eight)).translate(negSixth, negSixth, posSixth);
                        var13[2][1] = new Geometry(var13[2][1], (new Geometry(oneSquare, var13[2][1])).rotateX90());
                        var13[1][0] = (new Geometry(var13[2][0])).rotateZ90();
                        var13[1][1] = (new Geometry(var13[2][1])).rotateZ90();
                        var13[3][0] = (new Geometry(var13[1][0])).rotateZ90();
                        var13[3][1] = (new Geometry(var13[1][1])).rotateZ90();
                        var13[0][0] = (new Geometry(var13[3][0])).rotateZ90();
                        var13[0][1] = (new Geometry(var13[3][1])).rotateZ90();

                        Geometry twoSquares = new Geometry(oneSquare, (new Geometry(oneSquare)).rotateY180());

                        Geometry[][] var14 = new Geometry[4][4];
                        var14[3][0] = new Geometry(
                                new Square(posSixth, posSixth, 0.5F, 0.5F, 0.5F), (new Square(-0.5F, posSixth, negSixth, 0.5F, 0.5F)).rotateY180());
                        Cylinder var15 = new Cylinder(third, 1, third, 0.0, _90, eight);
                        var14[3][1] = (new Geometry(var15)).translate(posSixth, posSixth, posSixth);
                        var14[3][1] = new Geometry(var14[3][1],
                                (new Geometry(new Square(posSixth, negSixth, 0.5F, posSixth, 0.5F), var14[3][1])).rotateX270());
                        var14[3][2] = (new Geometry(var15)).rotateZ270().translate(posSixth, 0.5F, posSixth);
                        var14[3][2] = new Geometry(var14[3][2],
                                (new Geometry(new Square(negSixth, posSixth, posSixth, 0.5F, 0.5F), var14[3][2])).rotateY90());
                        var14[3][3] = (new SphereOctant(third, eight)).translate(posSixth, posSixth, posSixth);
                        var14[3][3] = new Geometry(
                                var14[3][3],
                                (new Geometry((new Cylinder(thirdAgain, 1, third, 0.0, _90, eight)).translate(negSixth, posSixth, posSixth),
                                        var14[3][3])).rotateY90());
                        var14[2][0] = (new Geometry(var14[3][0])).rotateY180();
                        var14[2][1] = (new Geometry(var14[3][1])).rotateY180();
                        var14[2][2] = (new Geometry(var14[3][2])).rotateY180();
                        var14[2][3] = (new Geometry(var14[3][3])).rotateY180();
                        var14[0][0] = (new Geometry(var14[2][0])).rotateX180();
                        var14[0][1] = (new Geometry(var14[2][1])).rotateX180();
                        var14[0][2] = (new Geometry(var14[2][2])).rotateX180();
                        var14[0][3] = (new Geometry(var14[2][3])).rotateX180();
                        var14[1][0] = (new Geometry(var14[0][0])).rotateY180();
                        var14[1][1] = (new Geometry(var14[0][1])).rotateY180();
                        var14[1][2] = (new Geometry(var14[0][2])).rotateY180();
                        var14[1][3] = (new Geometry(var14[0][3])).rotateY180();

                        Geometry maybeCube = new Geometry(var14[0][0], var14[0][1], var14[0][2], var14[0][3], var14[1][0], var14[1][1],
                                var14[1][2], var14[1][3], var14[2][0], var14[2][1], var14[2][2], var14[2][3], var14[3][0], var14[3][1],
                                var14[3][2], var14[3][3], var13[0][0], var13[0][1], var13[1][0], var13[1][1], var13[2][0], var13[2][1],
                                var13[3][0], var13[3][1], twoSquares);
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

                        final Animator animator = new Animator(drawable);
                        frame.addWindowListener(new WindowAdapter() {
                            public void windowClosing(WindowEvent var1) {
                                (new Thread(new Runnable() {
                                    public void run() {
                                        animator.stop();
                                        System.exit(0);
                                    }
                                })).start();
                            }
                        });
                        animator.start();

                        h.B.A.A("monster", new E()).A(new Geometry(maybeCube, var17));
                        Startup.gl2 = null;
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

                        GLU glu = new GLU();

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
                            glu.gluPerspective(45.0, (double) var9 / (double) var10, 1.0, 1000.0);
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
                frame.setSize(1024, 768);
                frame.setVisible(true);
            }
        });
    }
}
