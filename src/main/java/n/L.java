package n;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class L implements Iterable {
    private int A;
    private SortedSet C;

    public L(int var1) {
        this.A = var1;
        this.C = new TreeSet(new L._B());
    }

    public boolean C(J var1) {
        assert var1 != null;

        return this.C.contains(var1);
    }

    public boolean D(J var1) {
        assert var1 != null;

        assert !this.C(var1);

        this.C.add(var1);

        assert this.C(var1);

        return this.C.last() != var1;
    }

    public void A(J var1) {
        assert var1 != null;

        assert this.C(var1);

        this.C.remove(var1);

        assert !this.C(var1) : var1;

    }

    public boolean B(J var1) {
        int var2 = var1.B(this.A);
        int var3 = var1.E(this.A);
        Iterator var4 = this.iterator();

        J var5;
        do {
            if (!var4.hasNext()) {
                return false;
            }

            var5 = (J) var4.next();
        } while (var2 >= var5.E(this.A) || var5.B(this.A) >= var3);

        return true;
    }

    public void A() {
        this.C.clear();
    }

    public Iterator iterator() {
        return this.C.iterator();
    }

    public final class _A {
        private Iterator C;
        private J B;
        private J E;

        public _A() {
            this.B();
        }

        public void B() {
            this.C = L.this.C.iterator();
            this.B = null;
            this.D();
        }

        public _A(L._A var2) {
            this.A(var2.B);

            assert this.B == var2.B;

            assert this.E == var2.E;

        }

        public boolean D() {
            this.E = this.B;
            boolean var1 = this.C.hasNext();
            this.B = var1 ? (J) this.C.next() : null;
            return var1;
        }

        public boolean A(J var1) {
            while (this.D() && this.B != var1) {
            }

            return this.B == var1;
        }

        public int A(int var1) {
            do {
                if (this.B.E(L.this.A) > var1 && this.B.L() && !this.B.D) {
                    return this.B.B(L.this.A);
                }
            } while (this.D());

            return Integer.MIN_VALUE;
        }

        public J A() {
            return this.B;
        }

        public J E() {
            return this.E;
        }

        public boolean C() {
            this.D();
            int var1 = this.E.E(L.this.A) - this.B.B(L.this.A);
            boolean var2 = var1 > 0;
            if (var2) {
                this.B.A(this.E.C(var1 + this.B.D() - this.E.D()));
            }

            return var2;
        }
    }

    private class _B implements Comparator<J> {
        private _B() {
        }

        public int compare(J var1, J var2) {
            return var1.B(L.this.A) - var2.B(L.this.A);
        }

        // $FF: synthetic method
        _B(Object var2) {
            this();
        }
    }
}
