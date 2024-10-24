package OMS_RYHMATYO_2024;

public class ShapeAdapter extends Visibility implements ShapeBasic {

    private ShapeSpecial shapeSpecial;

    public ShapeAdapter(ShapeSpecial shapeSpecial) {
        this.shapeSpecial = shapeSpecial;
    }
    @Override
    public void draw() {
        shapeSpecial.drawShape();
    }

    @Override
    public void grow() {

        System.out.printf("%s, cannot grow\n", this.shapeSpecial.getClass().getSimpleName());
    }

    @Override
    public String printText() {
        return this instanceof ShapeSpecial ? "This shape is not supported":this.shapeSpecial.getClass().getSimpleName();
    }
}
