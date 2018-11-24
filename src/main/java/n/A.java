package n;

public class A {
    private final F E;
    private final j.A C;
    private int B;
    private int A;

    public A(F var1, j.A var2) {
        assert var1 != null;

        this.E = var1;
        this.C = var2;
        this.E.W().B(new A._A());
        this.E.V().B(new p.C() {
            public void A(Object var1) {
                A.this.A();
            }
        });
        this.A();
    }

    private void A() {
        this.B = 0;
        this.A = 0;
        this.E.C(this.C.W);
    }

    public int B() {
        return this.B;
    }

    public int C() {
        return this.A;
    }

    private class _A implements p.C<Integer> {
        private _A() {
        }

        public void A(Integer var1) {
            int var2 = var1;
            A.this.B = var2;

            int var3;
            for (var3 = var2 == 1 ? 40 : 100; var2-- > 2; var3 += var3) {
            }

            A.this.A = var3;
            int var4 = A.this.C.W + A.this.C.Y * A.this.B;
            A.this.E.C(var4);
        }

        // $FF: synthetic method
        _A(Object var2) {
            this();
        }
    }
}
