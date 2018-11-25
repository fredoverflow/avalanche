package o;

public class A implements B {
    private int R;

    public A(int var1) {
        this.R = var1;
    }

    public A() {
        this(0);
    }

    public boolean A() {
        return true;
    }

    public A A(int var1) {
        A var2 = null;

        try {
            var2 = (A) super.clone();
            var2.R = this.R + var1;
        } catch (CloneNotSupportedException var4) {
            var4.printStackTrace();
        }

        return var2;
    }

    public int B() {
        return 0;
    }

    // Are the above and below methods the same as in the implemented interface?

    public int C() {
        return this.R;
    }

    public void D() {
    }
}
