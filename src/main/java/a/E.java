package a;

import g.Updateable;
import i.KeyHandler;

import java.awt.event.KeyEvent;
import java.util.Iterator;

public class E implements D {
    private final Updateable í;
    private final KeyHandler ï;
    private final Iterable î;

    public E(Updateable var1, KeyHandler var2, Iterable var3) {
        this.í = var1;
        this.ï = var2;
        this.î = var3;
    }

    public void update() {
        this.í.update();
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

    public void handleInput() {
        this.ï.handleInput();
    }

    public Iterator iterator() {
        return this.î.iterator();
    }
}
