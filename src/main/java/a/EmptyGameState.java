package a;

import k.Viewport;

import java.awt.event.KeyEvent;
import java.util.Iterator;

public class EmptyGameState implements GameState {
    public static final EmptyGameState instance = new EmptyGameState();

    public void update() {
    }

    public void keyPressed(KeyEvent event) {
    }

    public void keyReleased(KeyEvent event) {
    }

    public void keyTyped(KeyEvent event) {
    }

    public void handleInput() {
    }

    public Iterator<Viewport> iterator() {
        return k.B.A;
    }
}
