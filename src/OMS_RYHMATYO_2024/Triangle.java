package OMS_RYHMATYO_2024;

import java.text.DecimalFormat;

public class Triangle implements ShapeSpecial,CanBeColored {

    private double a = 3.0;
    private double b = 3.0;
    private double c = 3.0;
    static DecimalFormat df2;
    private String color = "No color";

    Triangle()
    {}

    Triangle(String color)
    {
        this.color = color;
    }

    Triangle(double a,double b,double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Triangle(double a,double b,double c, String color)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        double p = this.calculatePerimeter()/2;
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }

    @Override
    public double calculatePerimeter() {
        return this.a+this.b+this.c;
    }

    @Override
    public void drawShape() {
        System.out.printf("This is a triangle with area: %.1f and perimeter: %.0f. Color: %s\n",
                this.calculateArea(),this.calculatePerimeter(),
                this.color);
    }

    @Override
    public String setColor(String color) {
        this.color = color;
        return color;
    }

    @Override
    public String getColor() {
        return (color.equals("No color") ? "The shape is not colored" : color );
    }
}
