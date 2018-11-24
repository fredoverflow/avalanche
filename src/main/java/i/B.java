package i;

import n.K;

import java.awt.event.KeyEvent;
import java.util.*;

public class B implements G {
    private static final int[][] Þ = new int[][]{{65, 68, 87, 83, 81, 49}, {37, 39, 38, 40, 10, 8}};
    private K ã;
    private Map à;
    private Map ß;
    private Map â;
    private Queue á;

    public B(K var1) {
        assert var1 != null;

        this.ã = var1;
        this.à = new HashMap();
        this.ß = new HashMap();
        this.â = new HashMap();
        int var2 = Math.min(this.ã.g(), Þ.length);

        for (int var3 = 0; var3 < var2; ++var3) {
            int[] var4 = Þ[var3];
            this.A(var3, var4[0], var4[1], var4[2], var4[3], var4[4], var4[5]);
        }

        this.A(27, new E(new e.C() {
            public void A() {
                B.this.ã.e().A((Object) null);
            }
        }));
        this.á = new LinkedList();
    }

    private void A(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        this.A(var2, new C(this.ã.F(var1), j.A.L, j.A.D));
        this.A(var3, new C(this.ã.I(var1), j.A.L, j.A.D));
        this.A(var4, new E(this.ã.O(var1)));
        this.A(var5, new E(this.ã.J(var1), this.ã.N(var1)));
        this.A(var6, new E(this.ã.D(var1)));
        this.A(var7, new E(this.ã.E(var1)));
    }

    private void A(int var1, H var2) {
        this.à.put(var1, var2);
        this.ß.put(var1, new F(var2));
        this.â.put(var1, new A(var2));
    }

    public synchronized void keyTyped(KeyEvent var1) {
    }

    public synchronized void keyPressed(KeyEvent var1) {
        e.C var2 = (e.C) this.ß.get(var1.getKeyCode());
        if (var2 != null) {
            this.á.offer(var2);
            var1.consume();
        } else {
            System.out.println("key not mapped: " + var1.getKeyCode());
        }

    }

    public synchronized void keyReleased(KeyEvent var1) {
        e.C var2 = (e.C) this.â.get(var1.getKeyCode());
        if (var2 != null) {
            this.á.offer(var2);
            var1.consume();
        }

    }

    public synchronized void i() {
        Iterator var1 = this.á.iterator();

        while (var1.hasNext()) {
            e.C var2 = (e.C) var1.next();
            var2.A();
        }

        this.á.clear();
        var1 = this.à.values().iterator();

        while (var1.hasNext()) {
            H var3 = (H) var1.next();
            var3.B();
        }

    }
}
