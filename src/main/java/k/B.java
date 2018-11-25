package k;

import java.util.Iterator;

public class B implements Iterator<Viewport> {
    public static final B A = new B();

    public boolean hasNext() {
        return false;
    }

    public Viewport next() {
        return null;
    }

    public void remove() {
    }
}
