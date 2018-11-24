package l;

public class C implements B {
    private double N;
    private int M;
    static final int[] L = new int[512];
    static final int[] K = new int[]{151, 160, 137, 91, 90, 15, 131, 13, 201, 95, 96, 53, 194, 233, 7, 225, 140, 36, 103, 30, 69, 142, 8, 99, 37, 240, 21, 10, 23, 190, 6, 148, 247, 120, 234, 75, 0, 26, 197, 62, 94, 252, 219, 203, 117, 35, 11, 32, 57, 177, 33, 88, 237, 149, 56, 87, 174, 20, 125, 136, 171, 168, 68, 175, 74, 165, 71, 134, 139, 48, 27, 166, 77, 146, 158, 231, 83, 111, 229, 122, 60, 211, 133, 230, 220, 105, 92, 41, 55, 46, 245, 40, 244, 102, 143, 54, 65, 25, 63, 161, 1, 216, 80, 73, 209, 76, 132, 187, 208, 89, 18, 169, 200, 196, 135, 130, 116, 188, 159, 86, 164, 100, 109, 198, 173, 186, 3, 64, 52, 217, 226, 250, 124, 123, 5, 202, 38, 147, 118, 126, 255, 82, 85, 212, 207, 206, 59, 227, 47, 16, 58, 17, 182, 189, 28, 42, 223, 183, 170, 213, 119, 248, 152, 2, 44, 154, 163, 70, 221, 153, 101, 155, 167, 43, 172, 9, 129, 22, 39, 253, 19, 98, 108, 110, 79, 113, 224, 232, 178, 185, 112, 104, 218, 246, 97, 228, 251, 34, 242, 193, 238, 210, 144, 12, 191, 179, 162, 241, 81, 51, 145, 235, 249, 14, 239, 107, 49, 192, 214, 31, 181, 199, 106, 157, 184, 84, 204, 176, 115, 121, 50, 45, 127, 4, 150, 254, 138, 236, 205, 93, 222, 114, 67, 29, 24, 72, 243, 141, 128, 195, 78, 66, 215, 61, 156, 180};

    public C(double var1) {
        this.M = (int) Math.floor(var1) & 255;
        this.N = var1 - Math.floor(var1);
    }

    public double A(double var1, double var3) {
        int var5 = (int) Math.floor(var1) & 255;
        int var6 = (int) Math.floor(var3) & 255;
        var1 -= Math.floor(var1);
        var3 -= Math.floor(var3);
        double var7 = A(var1);
        double var9 = A(var3);
        double var11 = A(this.N);
        int var13 = L[var5] + var6;
        int var14 = L[var13] + this.M;
        int var15 = L[var13 + 1] + this.M;
        int var16 = L[var5 + 1] + var6;
        int var17 = L[var16] + this.M;
        int var18 = L[var16 + 1] + this.M;
        return A(var11, A(var9, A(var7, A(L[var14], var1, var3, this.N), A(L[var17], var1 - 1.0D, var3, this.N)), A(var7, A(L[var15], var1, var3 - 1.0D, this.N), A(L[var18], var1 - 1.0D, var3 - 1.0D, this.N))), A(var9, A(var7, A(L[var14 + 1], var1, var3, this.N - 1.0D), A(L[var17 + 1], var1 - 1.0D, var3, this.N - 1.0D)), A(var7, A(L[var15 + 1], var1, var3 - 1.0D, this.N - 1.0D), A(L[var18 + 1], var1 - 1.0D, var3 - 1.0D, this.N - 1.0D))));
    }

    static double A(double var0) {
        return var0 * var0 * var0 * (var0 * (var0 * 6.0D - 15.0D) + 10.0D);
    }

    static double A(double var0, double var2, double var4) {
        return var2 + var0 * (var4 - var2);
    }

    static double A(int var0, double var1, double var3, double var5) {
        int var7 = var0 & 15;
        double var8 = var7 < 8 ? var1 : var3;
        double var10 = var7 < 4 ? var3 : (var7 != 12 && var7 != 14 ? var5 : var1);
        return ((var7 & 1) == 0 ? var8 : -var8) + ((var7 & 2) == 0 ? var10 : -var10);
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            L[256 + var0] = L[var0] = K[var0];
        }

    }
}
