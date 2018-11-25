package c;

public class A {
    private Timer B;
    private int C;
    private float E;
    private float D;
    private float A;

    public A(int var1) {
        this.A(0, (float) var1, (float) var1);
    }

    public A(int var1, float var2, float var3) {
        this.A(var1, var2, var3);
    }

    public A(float var1, float var2, float var3) {
        this.B = new Timer();
        this.A = var3;
        this.E = var1;
        this.D = var2;
        this.C = (int) ((float) j.A.D(1) * (var2 - var1) / this.A);
    }

    private void A(int var1, float var2, float var3) {
        this.B = new Timer();
        this.C = var1;
        this.E = var2;
        this.D = var3;
        this.A = (float) j.A.D(1) * (var3 - var2) / (float) this.C;
    }

    public void B() {
        this.B.D();
    }

    public boolean C() {
        return this.B.B() >= this.C;
    }

    public float A() {
        return this.C() ? this.D : this.E + this.B.A(this.A);
    }

    public void A(A var1) {
        this.A(this.C, this.A() + var1.E, var1.D);
    }
}
