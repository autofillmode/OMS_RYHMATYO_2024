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

    }


}
