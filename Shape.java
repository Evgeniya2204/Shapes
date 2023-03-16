package OOP.Part1.Shapes;

import java.util.Arrays;
import java.util.Comparator;

public interface Shape {

    double ZERO = 0.0;

    public double getWidth();

    public double getHeight();

    public double getArea();

    public double getPerimeter();

}

class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(15.0);//создаем новые обьекты класса круг, указываем значения полей
        Circle circle2 = new Circle(8.0);
        Rectangle rectangle1 = new Rectangle(14.0, 20.0);
        Rectangle rectangle2 = new Rectangle(8.0, 6.0);
        Square square1 = new Square(17.0);
        Square square2 = new Square(10.0);
        Triangle triangle1 = new Triangle(8.0, 12.0, 5.0, 7.0, 14.0, 11.0);
        Triangle triangle2 = new Triangle(3.0, 1.0, 7.0, 10.0, 6.0, 4.0);

        Shape[] array = new Shape[8];//массив объектов

        array[0] = triangle2;
        array[1] = circle1;
        array[2] = rectangle1;
        array[3] = square1;
        array[4] = triangle1;
        array[5] = circle2;
        array[6] = rectangle2;
        array[7] = square2;


        Comparator areaComparator = new MaxAreaComparator();
        Arrays.sort(array, areaComparator);
        double maxArea = array[array.length - 1].getArea();
        System.out.println("Максимальная площадь фигур равна " + maxArea);
        System.out.println("Фигура с максимальной площадью: " + array[array.length-1].toString());
        System.out.println(circle1.equals(circle2));

        Comparator perimeterComparator = new MaxPerimeterComparator();
        Arrays.sort(array, perimeterComparator);
        double secondPerimeter = array[array.length - 2].getPerimeter();
        System.out.println("Второй по величине периметр равен " + secondPerimeter);
        System.out.println("Фигура со вторым по величине периметром: " + array[array.length-2].toString());

    }
}

