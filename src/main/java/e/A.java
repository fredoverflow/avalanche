package e;

public class A implements C {
    private C T;
    private C S;

    public A(C var1) {
        assert var1 != null;

        this.T = var1;
        this.S = var1;
    }

    public void C() {
        this.S = this.T;
    }

    public void B() {
        this.S = B.A;
    }

    public boolean D() {
        return this.S == this.T;
    }

    public void A() {
        this.S.A();
    }
}
