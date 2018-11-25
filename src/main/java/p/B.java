package p;

import java.util.ArrayList;
import java.util.Iterator;

public class B implements A {
    private ArrayList C = new ArrayList();
    private ArrayList B;
    private boolean A = true;

    public void B(C var1) {
        assert var1 != null;

        assert !this.C.contains(var1);

        this.C.add(var1);
        this.A = true;

        assert this.C.contains(var1);

    }

    public void A(C var1) {
        assert var1 != null;

        assert this.C.contains(var1);

        this.C.remove(var1);
        this.A = true;

        assert !this.C.contains(var1);

    }

    public void select(Object parameter) {
        if (this.A) {
            this.B = new ArrayList(this.C);
            this.A = false;
        }

        Iterator var2 = this.B.iterator();

        while (var2.hasNext()) {
            C var3 = (C) var2.next();
            var3.A(parameter);
        }

    }
}
