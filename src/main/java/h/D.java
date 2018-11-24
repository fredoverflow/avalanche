package h;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class D implements C {
    private final Map A = new HashMap();

    public boolean C(String var1) {
        return this.A.containsKey(var1);
    }

    public C A(String var1, C var2) {
        assert !this.C(var1) : var1;

        this.A.put(var1, var2);
        return var2;
    }

    public C B(String var1) {
        assert this.C(var1) : var1;

        return (C) this.A.get(var1);
    }

    public void A(String var1) {
        assert this.C(var1) : var1;

        this.A.remove(var1);
    }

    public void A() {
        Iterator var1 = this.A.values().iterator();

        while (var1.hasNext()) {
            C var2 = (C) var1.next();
            var2.A();
        }

        this.A.clear();
    }
}
