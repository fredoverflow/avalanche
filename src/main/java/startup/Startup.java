package startup;

import c.Timer;
import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.Animator;
import geometry.Cylinder;
import geometry.Geometry;
import geometry.SphereOctant;
import geometry.Square;
import h.E;
import k.Viewport;
import l.b.C;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static com.jogamp.opengl.GL.*;
import static com.jogamp.opengl.GL2ES1.*;
import static com.jogamp.opengl.fixedfunc.GLMatrixFunc.GL_MODELVIEW;
import static com.jogamp.opengl.fixedfunc.GLMatrixFunc.GL_PROJECTION;

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

                a.B gameLike = new a.B();

                GLEventListener glEventListener = new GLEventListener() {
                    @Override
                    public void init(GLAutoDrawable drawable) {
                        GL2 gl2 = drawable.getGL().getGL2();
                        Startup.gl2 = gl2;

                        gl2.glClearColor(0.43820223F, 0.43820223F, 1.0F, 1.0F);
                        gl2.glEnable(GL_DEPTH_TEST);
                        gl2.glFrontFace(GL_CCW);
                        gl2.glCullFace(GL_BACK);
                        gl2.glEnable(GL_CULL_FACE);

                        gl2.glFogi(GL_FOG_MODE, GL_LINEAR);
                        gl2.glFogfv(GL_FOG_COLOR, new float[]{0.43820223F, 0.43820223F, 1.0F, 1.0F}, 0);
                        gl2.glFogf(GL_FOG_DENSITY, 0.35F);
                        gl2.glHint(GL_FOG_HINT, GL_DONT_CARE);
                        gl2.glFogf(GL_FOG_START, 25.0F);
                        gl2.glFogf(GL_FOG_END, 100.0F);
                        gl2.glEnable(GL_FOG);

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

                        h.B.A.A("monster", new E()).A(new Geometry(maybeCube, var17));

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
                    }

                    public void display(GLAutoDrawable drawable) {
                        Timer.update();
                        while (Timer.currentFrameLowerThanTargetFrame()) {
                            gameLike.update();
                            Timer.incrementCurrentFrame();
                        }
                        gameLike.handleInput();

                        GL2 gl2 = Startup.gl2;
                        gl2.glClear(GL_COLOR_BUFFER_BIT);
                        int surfaceWidth = drawable.getSurfaceWidth();
                        int surfaceHeight = drawable.getSurfaceHeight();
                        GLU glu = new GLU();

                        for (Viewport viewport : gameLike) {
                            int x = (int) (viewport.x() * (float) surfaceWidth);
                            int y = (int) (viewport.y() * (float) surfaceHeight);
                            int width = (int) (viewport.width() * (float) surfaceWidth);
                            int height = (int) (viewport.height() * (float) surfaceHeight);
                            gl2.glViewport(x, y, width, height);
                            gl2.glClear(GL_DEPTH_BUFFER_BIT);

                            gl2.glMatrixMode(GL_PROJECTION);
                            gl2.glLoadIdentity();
                            glu.gluPerspective(45.0, (double) width / (double) height, 1.0, 1000.0);
                            gl2.glMatrixMode(GL_MODELVIEW);
                            gl2.glLoadIdentity();
                            gl2.glTranslatef(0.0F, 0.0F, -32.0F);

                            float ambient = 0.05F;
                            float diffuse = 0.5F;
                            float specular = 1.0F;
                            gl2.glLightfv(GL_LIGHT0, GL_AMBIENT, new float[]{ambient, ambient, ambient, 1.0F}, 0);
                            gl2.glLightfv(GL_LIGHT0, GL_DIFFUSE, new float[]{diffuse, diffuse, diffuse, 1.0F}, 0);
                            gl2.glLightfv(GL_LIGHT0, GL_SPECULAR, new float[]{specular, specular, specular, 1.0F}, 0);
                            gl2.glLightfv(GL_LIGHT0, GL_POSITION, new float[]{-10.0F, 10.0F, 10.0F, 1.0F}, 0);
                            gl2.glEnable(GL_LIGHT0);
                            gl2.glEnable(GL_LIGHTING);
                            gl2.glColorMaterial(GL_FRONT_AND_BACK, GL_AMBIENT_AND_DIFFUSE);
                            gl2.glEnable(GL_COLOR_MATERIAL);
                            gl2.glMaterialfv(GL_FRONT, GL_SPECULAR, new float[]{specular, specular, specular, 1.0F}, 0);
                            gl2.glMateriali(GL_FRONT, GL_SHININESS, 128);

                            viewport.render();
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
                glcanvas.addKeyListener(gameLike);
                glcanvas.setFocusable(true);
                glcanvas.requestFocus();

                frame.add(glcanvas);
                frame.setSize(1024, 768);
                frame.setVisible(true);
            }
        });
    }
}
