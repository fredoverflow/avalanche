package b;

import g.Renderable;

public class G implements Renderable {
    private Renderable[] e;

    public G(Renderable... var1) {
        this.e = (Renderable[]) var1.clone();
    }

    public void render() {
        Renderable[] var1 = this.e;
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            Renderable var4 = var1[var3];
            var4.render();
        }

    }
}
