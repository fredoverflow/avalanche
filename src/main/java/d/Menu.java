package d;

import com.jogamp.opengl.GL2;
import g.Renderable;
import g.Updateable;
import h.Text;
import startup.Startup;

public class Menu implements Renderable, Updateable {
    private final String title;
    private MenuOption[] options;
    private int choice;
    private float[] normalColor;
    private float[] selectedColor;

    public Menu(String title, float[] normalColor, float[] selectedColor, MenuOption... options) {
        this.title = title;
        this.options = options.clone();
        this.choice = 0;
        this.normalColor = normalColor;
        this.selectedColor = selectedColor;
    }

    public void pickPreviousOption() {
        this.choice = Math.max(this.choice - 1, 0);
    }

    public void pickNextOption() {
        this.choice = Math.min(this.choice + 1, this.options.length - 1);
    }

    public void select() {
        this.options[this.choice].select(null);
    }

    public void render() {
        GL2 gl2 = Startup.gl2;
        gl2.glColor3fv(this.normalColor, 0);
        Text.draw(this.title, 0.0F, 10.0F, 0.0F, 1.5F, Text.ALIGN_CENTER);
        float var2 = (float) (this.options.length - 2);

        for (int var3 = 0; var3 < this.options.length; ++var3) {
            if (var3 == this.choice) {
                gl2.glColor3fv(this.selectedColor, 0);
            }

            this.options[var3].render(var2);
            if (var3 == this.choice) {
                gl2.glColor3fv(this.normalColor, 0);
            }

            var2 -= 2.0F;
        }
    }

    public void update() {
    }
}
