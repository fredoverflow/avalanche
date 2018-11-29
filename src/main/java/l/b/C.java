package l.b;

import l.TexelFunction;

public class C implements TexelFunction {
    private TexelFunction C;
    private A D;

    public C(TexelFunction var1, A var2) {
        this.C = var1;
        this.D = var2;
    }

    public double apply(double x, double y) {
        this.D.A(x, y);
        return this.C.apply(this.D.A(), this.D.B());
    }
}
