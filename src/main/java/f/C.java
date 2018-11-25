package f;

public class C extends Geometry {
    public C(float var1, float var2, float var3, float var4, float var5) {
        super(4, 2);
        this.add(var1, var2, var5, 0.0F, 0.0F, 1.0F);
        this.add(var3, var2, var5, 0.0F, 0.0F, 1.0F);
        this.add(var1, var4, var5, 0.0F, 0.0F, 1.0F);
        this.add(var3, var4, var5, 0.0F, 0.0F, 1.0F);
        this.addSquare(0, 1, 3, 2);
    }

    public C(float var1, float var2, float var3, float var4, float var5, int var6) {
        super((var6 + 1) * (var6 + 1), 2 * var6 * var6);
        float var7 = var3 - var1;
        float var8 = var4 - var2;

        int var9;
        int var11;
        for (var9 = 0; var9 <= var6; ++var9) {
            float var10 = var2 + var8 * (float) var9 / (float) var6;

            for (var11 = 0; var11 <= var6; ++var11) {
                float var12 = var1 + var7 * (float) var11 / (float) var6;
                this.add(var12, var10, var5, 0.0F, 0.0F, 1.0F);
            }
        }

        var9 = 0;

        for (int var13 = var6 * var6; var9 < var13; var9 = var11) {
            var11 = var9 + var6 + 1;

            for (int var14 = 0; var14 < var6; ++var14) {
                this.addSquare(var9 + var14, var9 + var14 + 1, var11 + var14 + 1, var11 + var14);
            }
        }

    }
}
