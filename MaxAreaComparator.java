package OOP.Part1.Shapes;

import java.util.Comparator;

public class MaxAreaComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        if (o1.getArea() - o2.getArea() > 0) {
            return 1;
        } else if (o1.getArea() - o2.getArea() == 0) {
            return 0;
        } else return -1;
    }
}
