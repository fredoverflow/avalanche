package geometry;

public class B extends Geometry {
    public B(float var1, int var2, float var3, double var4, double var6, int var8) {
        super((var2 + 1) * (var8 + 1), 2 * var2 * var8);
        float var9 = var1 / (float) var2;
        double var10 = (var6 - var4) / (double) var8;

        int var12;
        for (var12 = 0; var12 <= var8; ++var12) {
            double var13 = var4 + (double) var12 * var10;
            float var15 = (float) Math.sin(var13);
            float var16 = (float) Math.cos(var13);
            float var17 = var3 * var15;
            float var18 = var3 * var16;

            for (int var19 = 0; var19 <= var2; ++var19) {
                this.add((float) var19 * var9, var17, var18, 0.0F, var15, var16);
            }
        }

        var12 = 0;

        for (int var20 = 0; var12 < var8; ++var20) {
            for (int var14 = 0; var14 < var2; ++var20) {
                this.addSquare(var20, var20 + 1, var20 + var2 + 2, var20 + var2 + 1);
                ++var14;
            }

            ++var12;
        }

    }
}
