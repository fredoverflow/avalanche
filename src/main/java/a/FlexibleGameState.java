package a;

import k.Viewport;

import java.awt.event.KeyEvent;
import java.util.Iterator;

public class FlexibleGameState implements GameState {
    private GameState currentGameState;

    public FlexibleGameState() {
        this.currentGameState = EmptyGameState.instance;
    }

    public void setCurrentGameState(GameState gameState) {
        this.currentGameState = gameState;
    }

    public void update() {
        this.currentGameState.update();
    }

    public void keyPressed(KeyEvent event) {
        this.currentGameState.keyPressed(event);
    }

    public void keyReleased(KeyEvent event) {
        this.currentGameState.keyReleased(event);
    }

    public void keyTyped(KeyEvent event) {
        this.currentGameState.keyTyped(event);
    }

    public void handleInput() {
        this.currentGameState.handleInput();
    }

    public Iterator<Viewport> iterator() {
        return this.currentGameState.iterator();
    }
}
