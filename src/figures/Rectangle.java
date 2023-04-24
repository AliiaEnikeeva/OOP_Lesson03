package figures;

import figures.base.Polygon;

public class Rectangle extends Polygon {
    private Double width;
    private Double height;

    public Rectangle(Double width, Double height) {
        super(4, new Double[]{width, height, width, height});

        if (width <= 0.0 || height <= 0.0 || width == height)
            System.out.println("Это не прямоугольник или стороны неверны!"); ;

    }

    public Rectangle(Double width) {
        super(4, new Double[]{width, width, width, width});
        if (width <= 0.0)
            System.out.println("Стороны неверны!"); ;
    }

    @Override
    public Double getArea() {
        return getLenSides()[0] * getLenSides()[1];
    }

    @Override
    public String toString() {
        return "Прямоугольник с шириной = "+ width+"; высотой = "+ height;
    }

    @Override
    public String name() {
        return "Прямоугольник";
    }
}

