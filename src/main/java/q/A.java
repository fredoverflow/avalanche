package q;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A implements B {
    private final List m = new ArrayList();

    public void A(B var1) {
        this.m.add(var1);
    }

    public void update() {
        int var1 = 0;

        for (int var2 = this.m.size(); var1 < var2; ++var1) {
            B var3 = (B) this.m.get(var1);
            var3.update();
            if (var3.K()) {
                --var2;
                this.m.set(var1, this.m.get(var2));
                this.m.remove(var2);
            }
        }

    }

    public void render() {
        Iterator var1 = this.m.iterator();

        while (var1.hasNext()) {
            B var2 = (B) var1.next();
            var2.render();
        }

    }

    public boolean K() {
        return this.m.isEmpty();
    }
}
