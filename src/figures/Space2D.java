package figures;

import figures.base.NewMethods;
import figures.base.CurvedLen;
import figures.base.Figure;
import figures.base.Polygon;

import java.util.*;

class Space2D extends ArrayList<Figure> implements NewMethods {

    @Override
    public String getInformation(int index) {
        var item = this.get(index);
        StringBuilder s = new StringBuilder(index+". "+item.name()+" имеет площадь: "+item.getArea()+", ");
        if(item instanceof CurvedLen){
            s.append("длину окружности: ").append(((CurvedLen) item).getLen());
        }
        if(item instanceof Polygon){
            s.append("периметр: ").append(((Polygon) item).getPerimeter());
        }
        return s.toString();
    }

    @Override
    public void change(int index, Figure target) {
        this.set(index, target);
    }

    public void sortArea() {
        this.sort((o1, o2)->o1.getArea().compareTo(o2.getArea()));
    }




}