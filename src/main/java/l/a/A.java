package l.a;

import l.TexelFunction;

public class A implements TexelFunction {
    private TexelFunction V;

    public A(TexelFunction var1) {
        this.V = var1;
    }

    public double apply(double x, double y) {
        return this.V.apply(x, y) + x;
    }
}
