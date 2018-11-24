package b;

import n.J;

import java.util.HashMap;
import java.util.Map;

public class B {
    private A A;
    private Map B;

    public B(A var1) {
        this.A = var1;
        this.B = new HashMap();
    }

    public void A(J var1, c.A var2) {
        c.A var3 = (c.A) this.B.get(var1);
        if (var3 != null) {
            var3.A(var2);
        } else {
            this.B.put(var1, var2);
        }

    }

    public void A(J var1) {
        c.A var2 = (c.A) this.B.get(var1);
        if (var2 != null) {
            var2.B();
            if (var2.C()) {
                this.B.remove(var1);
            } else {
                this.A.A(var2.A());
            }
        }

    }

    public boolean A() {
        return this.B.isEmpty();
    }
}
