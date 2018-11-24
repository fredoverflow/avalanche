package c;

import java.util.Iterator;

public class C implements Iterator<Integer> {
    private int A;
    private final int B;

    public C(int var1, int var2) {
        this.B = (this.A = var1) + var2;
    }

    public boolean hasNext() {
        return this.A < this.B;
    }

    public Integer next() {
        return this.A++;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
