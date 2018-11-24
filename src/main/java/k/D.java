package k;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class D implements Iterable {
    private final List A;

    public D(g.A... var1) {
        int var2 = var1.length;
        this.A = new ArrayList(var2);
        float var3 = 1.0F / (float) var2;
        float var4 = 0.0F;
        g.A[] var5 = var1;
        int var6 = var1.length;

        for (int var7 = 0; var7 < var6; ++var7) {
            g.A var8 = var5[var7];
            this.A.add(new C(var4, 0.0F, var3, 1.0F, var8));
            var4 += var3;
        }

    }

    public Iterator iterator() {
        return this.A.iterator();
    }
}
