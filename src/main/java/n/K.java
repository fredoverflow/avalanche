package n;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class K implements g.B {
    private p.A Ø;
    private F[] Û;
    private Set Ö;
    private int Õ;
    private int[] Ù;

    public K(j.A var1, int var2) {
        assert var2 > 0 : var2;

        assert var2 <= 75 : var2;

        this.Û = new F[var2];
        this.Ö = new HashSet();
        this.Ù = new int[var2];

        for (int var3 = 0; var3 < var2; ++var3) {
            this.Û[var3] = new F(var1);
            this.Û[var3].W().B(new K._A(var3));
            this.Û[var3].ª.B(new K._B(var3));
        }

        this.Ø = new p.B();
    }

    public void A() {
        this.h();
        this.d();
        this.f();
    }

    private void h() {
        Arrays.fill(this.Ù, 0);
        F[] var1 = this.Û;
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            F var4 = var1[var3];
            var4.A();
        }

    }

    private void d() {
        int var1 = this.Û.length;

        for (int var2 = 0; var2 < var1; ++var2) {
            int var3 = this.Ù[var2];
            if (var3 > 1) {
                if (var3 < 4) {
                    --var3;
                }

                int var4;
                for (var4 = 0; var4 < var2; ++var4) {
                    this.Û[var4].B(var3);
                }

                for (var4 = var2 + 1; var4 < var1; ++var4) {
                    this.Û[var4].B(var3);
                }
            }
        }

    }

    private void f() {
        if (!this.Ö.isEmpty()) {
            this.Ø.A((Object) this.Ö);
            this.Ö.clear();
            if (this.Õ >= this.Û.length - 1) {
                this.Ø.A((Object) null);
                this.Õ = 0;
            }
        }

    }

    public p.A e() {
        return this.Ø;
    }

    public int g() {
        return this.Û.length;
    }

    public F H(int var1) {
        return this.Û[var1];
    }

    public int K(int var1) {
        return this.Û[var1].b();
    }

    public int L(int var1) {
        return this.Û[var1].c();
    }

    public e.C F(int var1) {
        return this.Û[var1].Á;
    }

    public e.C I(int var1) {
        return this.Û[var1].µ;
    }

    public e.C O(int var1) {
        return this.Û[var1].Ê;
    }

    public e.C J(int var1) {
        return this.Û[var1].À;
    }

    public e.C N(int var1) {
        return this.Û[var1].Î;
    }

    public e.C G(int var1) {
        return this.Û[var1].Ç;
    }

    public e.C E(int var1) {
        return this.Û[var1].Æ;
    }

    public p.A M(int var1) {
        return this.Û[var1].Ô;
    }

    public e.C D(int var1) {
        return this.Û[var1].Ä;
    }

    private class _B implements p.C<F> {
        private int T;

        public _B(int var2) {
            this.T = var2;
        }

        public void A(F var1) {
            K.this.Ö.add(this.T);
            K.this.Õ++;
        }
    }

    private class _A implements p.C<Integer> {
        private int R;

        public _A(int var2) {
            this.R = var2;
        }

        public void A(Integer var1) {
            K.this.Ù[this.R] = var1;
        }
    }
}
