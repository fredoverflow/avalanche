package a;

import g.Updateable;
import i.KeyHandler;
import k.Viewport;

import java.awt.event.KeyEvent;
import java.util.Iterator;

public class DelegatingGameState implements GameState {
    private final Updateable updateable;
    private final KeyHandler keyHandler;
    private final Iterable<Viewport> viewports;

    public DelegatingGameState(Updateable updateable, KeyHandler keyHandler, Iterable viewports) {
        this.updateable = updateable;
        this.keyHandler = keyHandler;
        this.viewports = viewports;
    }

    public void update() {
        this.updateable.update();
    }

    public void keyPressed(KeyEvent event) {
        this.keyHandler.keyPressed(event);
    }

    public void keyReleased(KeyEvent event) {
        this.keyHandler.keyReleased(event);
    }

    public void keyTyped(KeyEvent event) {
        this.keyHandler.keyTyped(event);
    }

    public void handleInput() {
        this.keyHandler.handleInput();
    }

    public Iterator<Viewport> iterator() {
        return this.viewports.iterator();
    }
}
