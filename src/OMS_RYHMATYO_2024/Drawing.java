package OMS_RYHMATYO_2024;

import java.util.ArrayList;
import java.util.List;

public abstract class Drawing <T> {
    private List<T> shapes;

    Drawing()
    {
        this.shapes = new ArrayList<>();
    }

    void addBasicShape(T shape)
    {
        if (shape != null)
            shapes.add(shape);
    }

    List<T> getBasicShapes()
    {
        return this.shapes;
    }

    void draw()
    {}

}
