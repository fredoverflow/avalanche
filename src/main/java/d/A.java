package d;

import i.KeyHandler;

import java.awt.event.KeyEvent;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class A implements KeyHandler {
    private final Menu Ý;
    private final Queue Ü;

    public A(Menu var1) {
        this.Ý = var1;
        this.Ü = new ArrayDeque();
    }

    public synchronized void handleInput() {
        KeyEvent var2;
        for (Iterator var1 = this.Ü.iterator(); var1.hasNext(); var2.consume()) {
            var2 = (KeyEvent) var1.next();
            switch (var2.getKeyCode()) {
                case 10:
                    this.Ý.select();
                    break;
                case 38:
                    this.Ý.pickPreviousOption();
                    break;
                case 40:
                    this.Ý.pickNextOption();
            }
        }

        this.Ü.clear();
    }

    public synchronized void keyPressed(KeyEvent var1) {
        this.Ü.offer(var1);
    }

    public void keyReleased(KeyEvent var1) {
    }

    public void keyTyped(KeyEvent var1) {
    }
}
