package n;

import java.util.*;

public class E implements Iterable {
    private final j.A I;
    private final L[] H;
    private final List J;
    private final J K;
    private final Random C;
    private final Set E = new HashSet();
    public final p.A M = new p.B();
    public final p.A D = new p.B();
    public final p.A F = new p.B();
    public final p.A G = new p.B();
    public final p.A L = new p.B();
    public final p.A B = new p.B();

    public E(j.A var1) {
        this.I = var1;
        this.H = new L[this.I.T];

        for (int var2 = 0; var2 < this.H.length; ++var2) {
            this.H[var2] = new L(var2);
        }

        this.J = new ArrayList();
        this.K = new J(new C(this.I.T, 3, 50, -2), 0, new o.A(0));
        this.K.D = true;
        this.B(this.K);
        this.C = new Random(this.I.E);
    }

    public boolean D(J var1) {
        assert !this.J.contains(var1);

        Iterator var2 = var1.iterator();

        int var3;
        do {
            if (!var2.hasNext()) {
                return false;
            }

            var3 = (Integer) var2.next();
        } while (!this.H[var3].B(var1));

        return true;
    }

    public void B(J var1) {
        if (this.E(var1)) {
            this.B();
        }

    }

    private boolean E(J var1) {
        assert !this.J.contains(var1);

        assert !this.D(var1);

        boolean var2 = false;

        int var4;
        for (Iterator var3 = var1.iterator(); var3.hasNext(); var2 |= this.H[var4].D(var1)) {
            var4 = (Integer) var3.next();
        }

        this.J.add(var1);
        return var2;
    }

    private void B() {
        this.J.clear();
        E._A var1 = new E._A();
        int var2 = 0;
        c.H var3 = new c.H(this.I.T);

        while (!var3.B()) {
            J var4 = var1.B(var2).A();

            for (int var5 = var4.N(); var1.B(var2).A() == var4; var2 = var3.A()) {
                --var5;
                if (var5 == 0) {
                    this.J.add(var4);
                    Iterator var6 = var4.iterator();

                    while (var6.hasNext()) {
                        int var7 = (Integer) var6.next();
                        if (!var1.B(var7).D()) {
                            var3.A(var7);
                        }
                    }
                }
            }
        }

    }

    public void A(J var1) {
        assert this.J.contains(var1);

        Iterator var2 = var1.iterator();

        while (var2.hasNext()) {
            int var3 = (Integer) var2.next();
            this.H[var3].A(var1);
        }

        this.J.remove(var1);

        assert !this.J.contains(var1);

    }

    public void I() {
        L[] var1 = this.H;
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            L var4 = var1[var3];
            var4.A();
        }

        this.J.clear();
        this.M.A((Object) null);
        this.B(this.K);
    }

    public void J() {
        boolean var1 = this.F();
        this.D();
        if (!var1 && this.F()) {
            this.C();
            this.G();
        }

    }

    private void D() {
        Iterator var1 = this.J.iterator();
        J var2 = (J) var1.next();

        assert var2 == this.K : var2;

        this.K.O();
        E._A var3 = new E._A();

        while (var1.hasNext()) {
            var3.B((J) var1.next());
        }

    }

    public void C() {
        if (this.F()) {
            E._A var1 = new E._A();
            int var2 = 3;
            int var3 = this.I.T - 9;

            while (true) {
                --var3;
                if (var3 < 0) {
                    break;
                }

                int var4 = 0;
                int var5 = this.I.S - 3;

                label76:
                while (true) {
                    label74:
                    while (true) {
                        --var5;
                        if (var5 < 0) {
                            break label76;
                        }

                        this.E.clear();
                        int var6 = var2;
                        int var7 = 4;

                        while (true) {
                            --var7;
                            int var10;
                            if (var7 < 0) {
                                if (this.E.size() != 4) {
                                    var4 += 256;
                                    break;
                                }

                                var6 = -1;
                                var7 = -1;
                                Iterator var12 = this.E.iterator();

                                while (var12.hasNext()) {
                                    J var13 = (J) var12.next();
                                    var10 = var13.G();
                                    if (var10 != var6) {
                                        var6 = var10;
                                        ++var7;
                                    }

                                    this.A(var13);
                                    this.B.A((Object) var13);
                                }

                                this.A(4, 4, var2, new o.A(var4), var7 == 0 ? 7 : 8);
                                var4 += j.A.C(4);
                                break;
                            }

                            var1.A(var6);
                            int var8 = var4;
                            int var9 = 4;

                            while (true) {
                                --var9;
                                if (var9 < 0) {
                                    ++var6;
                                    break;
                                }

                                var10 = var1.B(var6).A(var8);
                                if (var10 == Integer.MIN_VALUE) {
                                    break label76;
                                }

                                if (var10 > var8) {
                                    var4 = var10;
                                    continue label74;
                                }

                                J var11 = var1.B(var6).A();
                                if (var11.B() != 4 || var11.G() >= 7) {
                                    var4 = var11.A();
                                    continue label74;
                                }

                                this.E.add(var11);
                                var8 += 256;
                            }
                        }
                    }
                }

                ++var2;
            }
        }

    }

    private boolean F() {
        Iterator var1 = this.J.iterator();

        J var2;
        do {
            if (!var1.hasNext()) {
                return true;
            }

            var2 = (J) var1.next();
        } while (var2.L() || var2.D);

        return false;
    }

    public void G() {
        if (this.F()) {
            E._A var1 = new E._A();
            int var2 = 0;

            for (int var3 = var1.C(0); var3 != Integer.MIN_VALUE; ++var2) {
                this.A(var1.B(), var3);
                var1 = new E._A();
                var3 = var1.C(var3 + 256);
            }

            if (var2 > 0) {
                this.B();
                this.A();
                this.F.A((Object) var2);
            }
        }

    }

    private void A(Collection var1, int var2) {
        Iterator var3 = var1.iterator();

        while (var3.hasNext()) {
            J var4 = (J) var3.next();
            ArrayList var5 = new ArrayList(4);
            var5.add(var4);
            this.A(var4);
            this.A(var4, (var2 - var4.D()) / 256, var5);
            this.D.A((Object) var5);
        }

    }

    private void A(J var1, int var2, List var3) {
        J var4 = var1.A(var2, var2 + 1);

        assert var4 != null;

        var3.add(var4);
        this.A(var1, var2 + 1, Integer.MAX_VALUE, var3);
        this.A(var1, Integer.MIN_VALUE, var2, var3);
    }

    private void A(J var1, int var2, int var3, List var4) {
        J var5 = var1.A(var2, var3);
        if (var5 != null) {
            var4.add(var5);
            this.E(var5);
        }

    }

    private void A() {
        Iterator var1 = this.J.iterator();

        while (var1.hasNext()) {
            J var2 = (J) var1.next();
            if (!var2.A) {
                var2.A((o.I) (new o.J(this.I.F / var2.N())));
            }
        }

    }

    public void A(int var1) {
        assert var1 > 0 : var1;

        int var2 = this.K.D() - j.A.C(var1);
        int var3 = c.E.A(2 * var2 * this.I.J);
        o.D var4 = new o.D(var2, var3, this.I.J);
        int var5 = -j.A.B(1) * var3 / this.I.J;
        o.G var6 = new o.G(var4, var5, 0, this.K);
        this.K.A((o.B) var6);
        int var7 = 2 + this.C.nextInt(this.I.T - 11);
        int var8 = this.I.T - 7 - var7;
        this.A(var7, var1, 3, var4, 8);
        this.A(var8, var1, 4 + var7, var4, 8);
    }

    private void A(int var1, int var2, int var3, o.B var4, int var5) {
        M var6 = n.M.A(var1, var2, var5);
        J var7 = new J(var6, var3, var4);
        this.B(var7);
        this.G.A((Object) var7);
    }

    public J E() {
        return this.K;
    }

    public Iterator iterator() {
        Iterator var1 = this.J.iterator();
        J var2 = (J) var1.next();

        assert var2 == this.K : var2;

        return var1;
    }

    public int H() {
        return this.J.size() - 1;
    }

    public int C(J var1) {
        return (new E._A()).A(var1);
    }

    private class _A {
        private final L._A[] B;

        public _A() {
            this.B = new L._A[E.this.H.length];

            for (int var2 = 0; var2 < this.B.length; ++var2) {
                this.B[var2] = E.this.H[var2].new _A();
            }

        }

        public void B(J var1) {
            var1.O();
            boolean var2 = false;

            int var4;
            for (Iterator var3 = var1.iterator(); var3.hasNext(); var2 |= this.B[var4].C()) {
                var4 = (Integer) var3.next();
            }

            if (var2) {
                E.this.L.A((Object) var1);
            }

        }

        public void A() {
            for (int var1 = 0; var1 < this.B.length; ++var1) {
                this.A(var1);
            }

        }

        public void A(int var1) {
            this.B[var1].B();
        }

        public L._A B(int var1) {
            return this.B[var1];
        }

        public int A(J var1) {
            int var2 = Integer.MIN_VALUE;
            Iterator var3 = var1.iterator();

            while (var3.hasNext()) {
                int var4 = (Integer) var3.next();
                this.B[var4].A(var1);
                int var5 = var1.A(this.B[var4].E(), var4);
                if (var5 > var2) {
                    var2 = var5;
                }
            }

            return var2;
        }

        public int C(int var1) {
            int var2 = 2;
            int var3 = E.this.I.T - 3;

            while (true) {
                ++var2;
                if (var2 >= var3) {
                    return var1;
                }

                int var4 = this.B[var2].A(var1);
                if (var4 == Integer.MIN_VALUE) {
                    return var4;
                }

                if (var4 > var1) {
                    var1 = var4;
                    var2 = 2;
                }
            }
        }

        public Set B() {
            HashSet var1 = new HashSet();
            int var2 = 3;

            for (int var3 = E.this.I.T - 3; var2 < var3; ++var2) {
                var1.add(this.B[var2].A());
            }

            return var1;
        }
    }
}
