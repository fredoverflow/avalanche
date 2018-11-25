package n;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class I implements Iterable {
    private final p.A B = new p.B();
    private final LinkedList A = new LinkedList();
    private final m.B C;

    public p.A D() {
        return this.B;
    }

    public I(j.A var1) {
        this.C = new m.B(var1.R, new Random(var1.E));

        for (int var2 = var1.G; var2 > 0; --var2) {
            this.B();
        }

    }

    private void B() {
        this.A.offer(this.C.A());
    }

    public D A() {
        return (D) this.A.peek();
    }

    public D C() {
        this.B();
        D var1 = (D) this.A.poll();
        this.B.select(this.A.getLast());
        return var1;
    }

    public Iterator iterator() {
        return this.A.iterator();
    }
}
