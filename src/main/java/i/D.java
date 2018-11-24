package i;

import java.awt.event.KeyEvent;
import java.util.*;

public class D implements G {
    private static final int[] å = new int[]{37, 39, 38, 40, 10, 8};
    private n.F ë;
    private Map ç;
    private Map æ;
    private Map é;
    private Queue è;

    public D(n.F var1) {
        assert var1 != null;

        this.ë = var1;
        this.ç = new HashMap();
        this.æ = new HashMap();
        this.é = new HashMap();
        this.A(å[0], å[1], å[2], å[3], å[4], å[5]);
        this.B(27, new E(this.ë.Ì));
        this.è = new LinkedList();
    }

    private void A(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.B(var1, new C(this.ë.Á, j.A.L, j.A.D));
        this.B(var2, new C(this.ë.µ, j.A.L, j.A.D));
        this.B(var3, new E(this.ë.Ê));
        this.B(var4, new E(this.ë.À, this.ë.Î));
        this.B(var5, new E(this.ë.Ä));
        this.B(var6, new E(this.ë.Æ));
    }

    private void B(int var1, H var2) {
        this.ç.put(var1, var2);
        this.æ.put(var1, new F(var2));
        this.é.put(var1, new A(var2));
    }

    public synchronized void keyTyped(KeyEvent var1) {
    }

    public synchronized void keyPressed(KeyEvent var1) {
        e.C var2 = (e.C) this.æ.get(var1.getKeyCode());
        if (var2 != null) {
            this.è.offer(var2);
            var1.consume();
        } else {
            System.out.println("key not mapped: " + var1.getKeyCode());
        }

    }

    public synchronized void keyReleased(KeyEvent var1) {
        e.C var2 = (e.C) this.é.get(var1.getKeyCode());
        if (var2 != null) {
            this.è.offer(var2);
            var1.consume();
        }

    }

    public synchronized void i() {
        Iterator var1 = this.è.iterator();

        while (var1.hasNext()) {
            e.C var2 = (e.C) var1.next();
            var2.A();
        }

        this.è.clear();
        var1 = this.ç.values().iterator();

        while (var1.hasNext()) {
            H var3 = (H) var1.next();
            var3.B();
        }

    }
}
