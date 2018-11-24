package c;

import java.util.HashMap;
import java.util.Map;

public class B {
    private final Map A = new HashMap();

    public Object A(Object var1) {
        if (this.A.containsKey(var1)) {
            var1 = this.A.get(var1);
        } else {
            this.A.put(var1, var1);
        }

        return var1;
    }
}
