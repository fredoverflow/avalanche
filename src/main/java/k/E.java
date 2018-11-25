package k;

import g.Renderable;

import java.util.Iterator;

public class E implements Iterable {
    private final Viewport A;

    public E(final Renderable var1) {
        this.A = new Viewport() {
            public float height() {
                return 1.0F;
            }

            public float width() {
                return 1.0F;
            }

            public float x() {
                return 0.0F;
            }

            public float y() {
                return 0.0F;
            }

            public void render() {
                var1.render();
            }
        };
    }

    public Iterator<Viewport> iterator() {
        return new Iterator<Viewport>() {
            private boolean B = true;

            public boolean hasNext() {
                return this.B;
            }

            public Viewport next() {
                this.B = false;
                return E.this.A;
            }

            public void remove() {
            }
        };
    }
}
