package k;

import g.Renderable;

public class C implements Viewport {
    private final float f;
    private final float j;
    private final float g;
    private final float i;
    private final Renderable h;

    public C(float var1, float var2, float var3, float var4, Renderable var5) {
        this.f = var1;
        this.j = var2;
        this.g = var3;
        this.i = var4;
        this.h = var5;
    }

    public float height() {
        return this.i;
    }

    public float width() {
        return this.g;
    }

    public float x() {
        return this.f;
    }

    public float y() {
        return this.j;
    }

    public void render() {
        this.h.render();
    }
}
