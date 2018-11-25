package d;

import h.Text;

public class MenuOption extends p.B {
    private final String option;

    public MenuOption(String option) {
        this.option = option;
    }

    public void render(float y) {
        Text.draw(this.option, 0.0F, y, 0.0F, 1.0F, Text.ALIGN_CENTER);
    }
}
