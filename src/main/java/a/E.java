package a;

import i.G;

import java.awt.event.KeyEvent;
import java.util.Iterator;

public class E implements D {
    private final g.B í;
    private final G ï;
    private final Iterable î;

    public E(g.B var1, G var2, Iterable var3) {
        this.í = var1;
        this.ï = var2;
        this.î = var3;
    }

    public void A() {
        this.í.A();
    }

    public void keyPressed(KeyEvent var1) {
        this.ï.keyPressed(var1);
    }

    public void keyReleased(KeyEvent var1) {
        this.ï.keyReleased(var1);
    }

    public void keyTyped(KeyEvent var1) {
        this.ï.keyTyped(var1);
    }

    public void i() {
        this.ï.i();
    }

    public Iterator iterator() {
        return this.î.iterator();
    }
}
