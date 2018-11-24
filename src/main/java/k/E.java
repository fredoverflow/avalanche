package k;

import java.util.Iterator;

public class E implements Iterable {
    private final A A;

    public E(final g.A var1) {
        this.A = new A() {
            public float H() {
                return 1.0F;
            }

            public float J() {
                return 1.0F;
            }

            public float G() {
                return 0.0F;
            }

            public float I() {
                return 0.0F;
            }

            public void B() {
                var1.B();
            }
        };
    }

    public Iterator<A> iterator() {
        return new Iterator<A>() {
            private boolean B = true;

            public boolean hasNext() {
                return this.B;
            }

            public A next() {
                this.B = false;
                return E.this.A;
            }

            public void remove() {
            }
        };
    }
}
