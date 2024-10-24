package OMS_RYHMATYO_2024;

public class AdapterMain {
    AdapterMain()
    {}

    public static void main(String[] Args)
    {
        //        ShapeDrawer sd = new ShapeDrawer();
        //        Rectangle rect = new Rectangle();
        //        rect.changeVisibility();
        //        Rectangle rect2 = new Rectangle();
        //        Circle circle = new Circle();
        //        Circle circle2 = new Circle();
        //        circle2.changeVisibility();
        //        Rectangle rect3 = new Rectangle();
        //        sd.addBasicShape(rect);
        //        sd.addBasicShape(rect2);
        //        sd.addBasicShape(circle);
        //        sd.addBasicShape(circle2);
        //        sd.addBasicShape(rect3);
        //
        //        sd.draw();
        //        sd.grow();
        //        sd.showVisibility();

        ShapeDrawer sd = new ShapeDrawer();
        Rectangle rect = new Rectangle();
        Rectangle rect2 = new Rectangle();
        rect2.changeVisibility();
        Circle circle = new Circle();
        Circle circle2 = new Circle();
        circle2.changeVisibility();
        Rectangle rect3 = new Rectangle();
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

        sd.addBasicShape(rect);
        sd.addBasicShape(rect2);
        sd.addBasicShape(circle);
        sd.addBasicShape(circle2);
        sd.addBasicShape(rect3);
        sd.addBasicShape(triangleAd);
        sd.addBasicShape(diamondAd);
        sd.addBasicShape(diamond2Ad);
        sd.addBasicShape(diamond3Ad);
        sd.addBasicShape(triangle2Ad);
        sd.addBasicShape(diamond4Ad);
        sd.addBasicShape(stroke);
        sd.addBasicShape(stroke2);
        sd.addBasicShape(stroke3);


        sd.draw();
        sd.grow();
        sd.showVisibility();
    }
}
