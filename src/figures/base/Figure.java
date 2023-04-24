package figures.base;

public abstract class Figure {
    public abstract Double getArea();
    public abstract String name();

    @Override
    public String toString() {
        return "Это "+ name() +"имеет площадь: "+ getArea();
    }
}
