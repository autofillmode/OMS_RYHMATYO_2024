package OMS_RYHMATYO_2024;

public class AdapterMain {
    AdapterMain()
    {}

    public static void main(String[] Args)
    {
        ShapeDrawer sd = new ShapeDrawer();
        Rectangle rect = new Rectangle();
        rect.changeVisibility();
        Rectangle rect2 = new Rectangle();
        Circle circle = new Circle();
        Circle circle2 = new Circle();
        circle2.changeVisibility();
        Rectangle rect3 = new Rectangle();
        sd.addBasicShape(rect);
        sd.addBasicShape(rect2);
        sd.addBasicShape(circle);
        sd.addBasicShape(circle2);
        sd.addBasicShape(rect3);
        sd.draw();
        sd.grow();
        sd.showVisibility();

        ShapeDrawer sd2 = new ShapeDrawer();
        Rectangle rect4 = new Rectangle();
        Rectangle rect5 = new Rectangle();
        rect2.changeVisibility();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();
        circle2.changeVisibility();
        Rectangle rect6 = new Rectangle();
        Triangle triangle = new Triangle("Other color");
        ShapeAdapter triangleAd = new ShapeAdapter(triangle);
        ShapeDiamond diamond  = new ShapeDiamond("PURPLE");
        ShapeAdapter diamondAd = new ShapeAdapter(diamond);
        ShapeDiamond diamond2 = new ShapeDiamond("somethingElse");
        ShapeAdapter diamond2Ad = new ShapeAdapter(diamond2);
        diamond2Ad.changeVisibility();
        ShapeDiamond diamond3 = new ShapeDiamond(4.0,4.0,"Yellow");
        ShapeAdapter diamond3Ad = new ShapeAdapter(diamond3);
        diamond3Ad.changeVisibility();
        Triangle triangle2 = new Triangle(6.0,6.0,6.0,"Blue");
        ShapeAdapter triangle2Ad = new ShapeAdapter(triangle2);
        triangle2Ad.changeVisibility();
        ShapeDiamond diamond4 = new ShapeDiamond(1.0,1.0,"Green");
        ShapeAdapter diamond4Ad = new ShapeAdapter(diamond4);
        BrushStroke stroke = new BrushStroke();
        stroke.changeVisibility();
        BrushStroke stroke2 = new BrushStroke();
        stroke2.setColor("someColor");
        BrushStroke stroke3 = new BrushStroke();
        stroke3.setColor("RED");

        sd2.addBasicShape(rect4);
        sd2.addBasicShape(rect5);
        sd2.addBasicShape(circle3);
        sd2.addBasicShape(circle4);
        sd2.addBasicShape(rect6);
        sd2.addBasicShape(triangleAd);
        sd2.addBasicShape(diamondAd);
        sd2.addBasicShape(diamond2Ad);
        sd2.addBasicShape(diamond3Ad);
        sd2.addBasicShape(triangle2Ad);
        sd2.addBasicShape(diamond4Ad);
        sd2.addBasicShape(stroke);
        sd2.addBasicShape(stroke2);
        sd2.addBasicShape(stroke3);


        sd2.draw();
        sd2.grow();
        sd2.showVisibility();
    }
}
