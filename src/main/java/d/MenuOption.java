package d;

public class MenuOption extends p.B {
    private final String option;

    public MenuOption(String option) {
        this.option = option;
    }

    public void render(float y) {
        h.B.A(this.option, 0.0F, y, 0.0F, 1.0F, 0.5F);
    }
}
