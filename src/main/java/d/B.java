package d;

import com.jogamp.opengl.GL2;
import g.Renderable;
import g.Updateable;
import startup.Startup;

public class B implements Renderable, Updateable {
    private final String z;
    private C[] u;
    private int x;
    private float[] y;
    private float[] w;

    public B(String var2, float[] var3, float[] var4, C... var5) {
        this.z = var2;
        this.u = var5.clone();
        this.x = 0;
        this.y = var3;
        this.w = var4;
    }

    public void M() {
        this.x = Math.max(this.x - 1, 0);
    }

    public void L() {
        this.x = Math.min(this.x + 1, this.u.length - 1);
    }

    public void N() {
        this.u[this.x].A((Object) null);
    }

    public void render() {
        GL2 var1 = Startup.gl2;
        var1.glColor3fv(this.y, 0);
        h.B.A(this.z, 0.0F, 10.0F, 0.0F, 1.5F, 0.5F);
        float var2 = (float) (this.u.length - 2);

        for (int var3 = 0; var3 < this.u.length; ++var3) {
            if (var3 == this.x) {
                var1.glColor3fv(this.w, 0);
            }

            this.u[var3].A(var2);
            if (var3 == this.x) {
                var1.glColor3fv(this.y, 0);
            }

            var2 -= 2.0F;
        }
    }

    public void update() {
    }
}
