package figures;

import figures.base.Polygon;

public class Triangle extends Polygon {
    private Double sideA;
    private Double sideB;
    private Double sideC;


    public Triangle(Double sideA, Double sideB, Double sideC) {
        super(3, new Double[]{sideA, sideB, sideC});
        if ((sideA <= 0.0 || sideB <= 0.0 || sideC <= 0.0) || !(sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA))
            System.out.println("Неправильные стороны!");
    }

    /*Double[] lenSides = new Double[]{sideA, sideB, sideC};
        super.setLenSides(lenSides);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;*/

    public Triangle(Integer numberSides, Double[] lenSides, Double sideA, Double sideB, Double sideC) {
        super(numberSides, lenSides);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public Double getArea() {
        Double p = super.getPerimeter() / 2;
        // Формула Герона
        return Math.sqrt(p * (p - getLenSides()[0]) * (p - getLenSides()[1]) * (p - getLenSides()[2]));
    }

    @Override
    public String toString() {
        return "Треугольник с a= "+ sideA +"; b= "+ sideB +"; c= "+ sideC;
    }
    @Override
    public String name() {
        return "Треугольник";
    }
}
