package h;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class D implements Deleteable {
    private final Map A = new HashMap();

    public boolean C(String var1) {
        return this.A.containsKey(var1);
    }

    public <T extends Deleteable> T A(String var1, T var2) {
        assert !this.C(var1) : var1;

        this.A.put(var1, var2);
        return var2;
    }

    public Deleteable B(String var1) {
        assert this.C(var1) : var1;

        return (Deleteable) this.A.get(var1);
    }

    public void A(String var1) {
        assert this.C(var1) : var1;

        this.A.remove(var1);
    }

    public void delete() {
        Iterator var1 = this.A.values().iterator();

        while (var1.hasNext()) {
            Deleteable var2 = (Deleteable) var1.next();
            var2.delete();
        }

        this.A.clear();
    }
}
