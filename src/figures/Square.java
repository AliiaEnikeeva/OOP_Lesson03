package figures;

public class Square extends Rectangle{
    private Double side;
    public Square(Double side) {
        super(side, side);
        this.side = side;
    }
    @Override
    public String toString() {
        return "Квадрат со стороной a = " + side;
    }

    @Override
    public String name() {
        return "Квадрат";
    }



}
