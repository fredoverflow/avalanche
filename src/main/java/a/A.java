package a;

import java.awt.event.KeyEvent;
import java.util.Iterator;

public class A implements D {
    private D ð;

    public A() {
        this.ð = C.ì;
    }

    public void A(D var1) {
        this.ð = var1;
    }

    public void update() {
        this.ð.update();
    }

    public void keyPressed(KeyEvent var1) {
        this.ð.keyPressed(var1);
    }

    public void keyReleased(KeyEvent var1) {
        this.ð.keyReleased(var1);
    }

    public void keyTyped(KeyEvent var1) {
        this.ð.keyTyped(var1);
    }

    public void handleInput() {
        this.ð.handleInput();
    }

    public Iterator iterator() {
        return this.ð.iterator();
    }
}
