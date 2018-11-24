package f;

public class A extends D {
    private static final double J = 1.5707963267948966D;

    public A(float var1, int var2) {
        super((var2 + 1) * (var2 + 2) / 2, var2 * var2);

        int var3;
        int var6;
        int var7;
        for (var3 = 0; var3 < var2; ++var3) {
            double var4 = 1.5707963267948966D * (double) var3 / (double) var2;
            var6 = 0;

            for (var7 = var2 - var3; var6 <= var7; ++var6) {
                this.A(1.5707963267948966D * (double) var6 / (double) var7, var4, var1);
            }
        }

        this.A(0.0D, 1.5707963267948966D, var1);
        var3 = 0;

        for (int var9 = 0; var9 < var2; ++var9) {
            int var5 = var3;
            var6 = var3 + var2 - var9;
            var3 = var6 + 1;
            var7 = var3 - var5;

            int var8;
            for (var8 = var5; var8 < var6; ++var8) {
                this.A(var8, var8 + 1, var8 + var7);
            }

            for (var8 = var5 + 1; var8 < var6; ++var8) {
                this.A(var8, var8 + var7, var8 + var7 - 1);
            }
        }

        this.M();
    }
}
