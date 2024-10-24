package OMS_RYHMATYO_2024;

import java.text.DecimalFormat;

public class ShapeDiamond implements ShapeSpecial, CanBeColored {
    private double a = 2.0;
    private double b = 2.0;
    static DecimalFormat df2;
    private String color = "No color";

    ShapeDiamond()
    {}

    ShapeDiamond(String color)
    {
        this.color = color;
    }

    ShapeDiamond(double a, double b, String color)
    {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    public double calculateArea()
    {
        return a*b;
    }

    public double calculatePerimeter()
    {
        return a*4;
    }

    public void drawShape()
    {

        System.out.printf("This is a diamond shape with area %.1f and perimeter %.0f Color: %s\n"
                ,this.calculateArea(),this.calculatePerimeter(),this.color);
    }

    @Override
    public String setColor(String color) {
        this.color = color;
        return color;
    }

    @Override
    public String getColor() {
        return (color.equals("No color") ? "The shape is not colored\n" : color );
    }
}
