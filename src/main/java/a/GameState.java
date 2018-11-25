package a;

import g.Updateable;
import i.KeyHandler;
import k.Viewport;

public interface GameState extends Updateable, KeyHandler, Iterable<Viewport> {
}
