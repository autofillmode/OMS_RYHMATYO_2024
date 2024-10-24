package OMS_RYHMATYO_2024;

public class ShapeDrawer extends Drawing <ShapeBasic> {
    ShapeDrawer()
    {}

    @Override
    void draw() {
        if (getBasicShapes().isEmpty())
        {
            System.out.println("Drawing is empty!");
        }
        for (int i = 0; i < getBasicShapes().size(); i++)
        {
            getBasicShapes().get(i).draw();
        }
    }

    void grow() {
        if (getBasicShapes().isEmpty())
        {
            System.out.println("Drawing is empty!");
        }
        for (int i = 0; i < getBasicShapes().size(); i++)
        {
            getBasicShapes().get(i).grow();
        }
    }

    void showVisibility()
    {
        if (getBasicShapes().isEmpty())
        {
            System.out.println("Drawing is empty!");
        }
        for (int i = 0; i < getBasicShapes().size(); i++)
        {
            System.out.printf("%d. shape is %s: %s\n",i+1,
                    getBasicShapes().get(i).isVisible()?"in the background":"visible",
                    getBasicShapes().get(i).printText());
        }
        System.out.printf("\nTotal number of shapes: %d",getBasicShapes().size());
    }
}
