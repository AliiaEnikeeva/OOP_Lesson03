package figures.base;

import figures.base.Figure;
import figures.base.Perimeter;

public abstract class Polygon extends Figure implements Perimeter {
    private Integer numberSides;
    private Double[] lenSides;

    public Polygon(Integer numberSides) {
        assert numberSides > 2;
        this.numberSides = numberSides;
        this.lenSides = new Double[numberSides];
    }
    public Polygon(Integer numberSides, Double[] lenSides) {
        this(numberSides);
        this.setLenSides(lenSides);
    }

    protected void setLenSides(Double[] lenSides){
        if (lenSides.length != numberSides) throw new AssertionError();
        this.lenSides = lenSides.clone();
    }

    protected Double[] getLenSides() {
        return lenSides;
    }

      @Override
    public Double getPerimeter() {
        Double res = 0.0;
        for (int i = 0; i < numberSides; i++) {
            res += lenSides[i];
        }
        return res;
    }

}
