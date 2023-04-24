package figures.view;
import figures.Commander;
import figures.Circle;
import figures.Rectangle;
import figures.Square;
import figures.Triangle;
import figures.base.Figure;
import figures.base.Polygon;

import java.util.ArrayList;
import java.util.Scanner;

    /*
Класс Интерфесы
   ПереметрМногоуголника <getPerimeter>
   ДлинаКривойФигуры <посчитатьДлинуФигуру>
Абстарктные классы
   Фигура [] < getArea>
   Многоуголник-> Фигура | ПереметрМногоуголника | [ Integer Кол-во_сторон, Array Длины_сторон]
Классы
   Треугольник->Многоуголник [Double сторона1, Double сторона2, Double сторона3] <> // проверять правилность
   Квадрат->Прямоугольник [Double сторона]
   Прямоугольник->Многоуголник [Double ширина, Double высота]
   Круг->Фигура | ДлинаКривойФигуры |[Double радиус]
    */
    /*public class Program {
    public static void main(String[] args) {
        ArrayList<Figure> figDB = new ArrayList<>();
        figDB.add(new Triangle(3.0, 4.0, 5.0));
        figDB.add(new Square(Math.random() * 100));
        figDB.add(new Rectangle(Math.random() * 100, Math.random() * 100));
        figDB.add(new Circle(Math.random() * 100));

        Scanner scan = new Scanner(System.in);
        System.out.println("1.Добавить новую фигуру\n" +
                "    2.Посчитать периметр у всех фигур\n" +
                "    3.Посчитать площадь у всех фигур\n" +
                "    4.Посчитать длины окружностей у всех фигур");
        int ex = scan.nextInt();
        switch (ex) {
            case 1:
                System.out.println("1.Треугольник\n" +
                        "2.Квадрат\n" +
                        "3.Прямоугольник\n" +
                        "4.Круг");
                int type = scan.nextInt();
                switch (type) {
                    case 1:
                        figDB.add(new Triangle(3.0, 4.0, 5.0));
                        break;
                    case 2:
                        figDB.add(new Square(Math.random() * 100));
                        break;
                    case 3:
                        figDB.add(new Rectangle(Math.random() * 100, Math.random() * 100));
                        break;
                    case 4:
                        figDB.add(new Circle(Math.random() * 100));
                        break;
                }
                break;
            case 2:
                for (Figure fig : figDB) {
                    if (fig instanceof Polygon)
                        System.out.println("Периметр " + fig.getClass().getSimpleName() + " = " + ((Polygon) fig).getPerimeter());
                }
                break;
            case 3:
                for (Figure fig : figDB) {
                    System.out.println("Площадь " + fig.getClass().getSimpleName() + " = " + fig.getArea());
                }
                break;
            case 4:
                for (Figure fig : figDB) {
                    if (fig instanceof Circle)
                        System.out.println("Длина окружности = " + ((Circle) fig).getLen());
                }
                break;

        }


    }
}*/

    public class Program {
        public static void main(String[] args) {
            Commander commander = new Commander();
            commander.start();
        }
    }