package a;

import b.F;
import b.G;
import d.Menu;
import d.MenuOption;
import g.Renderable;
import n.K;

import java.util.Set;

public class MenuGameState extends FlexibleGameState {
    public MenuGameState() {
        this.j();
    }

    private void j() {
        MenuOption one = new MenuOption("One Player");
        MenuOption two = new MenuOption("Two Players");
        MenuOption three = new MenuOption("Three Players");
        Menu var4 = new Menu("a v a l a n c h e", new float[]{0.0F, 0.0F, 0.5F}, new float[]{1.0F, 1.0F, 1.0F}, one, two);
        d.A var5 = new d.A(var4);
        F var6 = new F(100);
        this.setCurrentGameState(new DelegatingGameState(var4, var5, new k.E(new G(var6, var4))));
        one.B(new p.C() {
            public void A(Object ignored) {
                MenuGameState.this.singlePlayer();
            }
        });
        two.B(new p.C() {
            public void A(Object ignored) {
                MenuGameState.this.multiPlayer(2);
            }
        });
        three.B(new p.C() {
            public void A(Object ignored) {
                MenuGameState.this.multiPlayer(3);
            }
        });
    }

    private void singlePlayer() {
        j.A var1 = new j.A(64, 4, 256, -4, 1, 20, -4, 6, 18, 24, System.nanoTime(), new m.C(new m.D()));
        n.F var2 = new n.F(var1);
        new n.A(var2, var1);
        i.D var3 = new i.D(var2);
        b.E var4 = new b.E(var2);
        this.setCurrentGameState(new DelegatingGameState(var2, var3, new k.E(var4)));
        var2.ª.B(new p.C<n.F>() {
            public void A(n.F var1) {
                MenuGameState.this.j();
            }
        });
    }

    private void multiPlayer(int numPlayers) {
        j.A var2 = new j.A(64, 4, 256, -4, 1, 20, -4, 6, 18, 24, System.nanoTime(), new m.C(new m.D()));
        K var3 = new K(var2, 2);
        i.B var4 = new i.B(var3);
        b.E var5 = new b.E(var3.H(0));
        b.E var6 = new b.E(var3.H(1));
        this.setCurrentGameState(new DelegatingGameState(var3, var4, new k.D(new Renderable[]{var5, var6})));
        var3.e().B(new p.C<Set>() {
            public void A(Set var1) {
                MenuGameState.this.j();
            }
        });
    }
}
