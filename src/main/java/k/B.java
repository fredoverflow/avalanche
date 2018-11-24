package k;

import java.util.Iterator;

public class B implements Iterator<A> {
    public static final B A = new B();

    public boolean hasNext() {
        return false;
    }

    public A next() {
        return null;
    }

    public void remove() {
    }
}
