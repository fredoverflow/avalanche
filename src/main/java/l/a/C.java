package l.a;

import l.TexelFunction;

public class C implements TexelFunction {
    private TexelFunction A;
    private I B;

    public C(TexelFunction var1, I var2) {
        this.A = var1;
        this.B = var2;
    }

    public double apply(double x, double y) {
        return this.B.A(this.A.apply(x, y));
    }
}
