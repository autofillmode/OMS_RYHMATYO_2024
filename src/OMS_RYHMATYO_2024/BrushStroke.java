package OMS_RYHMATYO_2024;

import java.util.Random;
import java.util.random.RandomGenerator;

public class BrushStroke extends Visibility implements ShapeBasic, CanBeColored{
    private int thickness;
    private String color = "Yellow";

    BrushStroke()
    {
        Random r = Random.from(RandomGenerator.getDefault());
        this.thickness = r.nextInt(11);
    }

    public void draw()
    {
        System.out.printf("Brush strokes with thickness %d\n", this.thickness);
    }

    public void grow()
    {
        System.out.printf("Adding some color... %s\n", this.getColor());
    }

    @Override
    public String printText() {
        return "Brush Stroke";
    }

    @Override
    public String setColor(String color) {
        this.color = color;
        return color;
    }

    @Override
    public String getColor() {
        return (color.equals("No color") ? "Out of color..." : color );
    }
}
