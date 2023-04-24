package figures;

import figures.base.CurvedLen;
import figures.base.Figure;

public class Circle extends Figure implements CurvedLen {
    public Circle(Double radius) {
        if (radius > 0.0)
            this.radius = radius;
        else
            System.out.println("Нулевой радиус");
    }

    private Double radius;

    @Override
    public Double getLen() {

        return 2.0 * Math.PI * radius;
    }

    @Override
    public Double getArea() {

        return Math.PI * Math.pow(radius, 2.0);
    }

    @Override
    public String name() {
        return "Круг";
    }

    @Override
    public String toString() {
        return "Круг с радиусом= "+ radius;
    }
}
