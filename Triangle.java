package OOP.Part1.Shapes;

public class Triangle implements Shape {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

    }

    public static double getMaximumX(double x1, double x2, double x3) {
        double[] array = new double[]{x1, x2, x3};
        double maxX = array[0];
        for (double e : array) {
            if (e > maxX) {
                maxX = e;
            }
        }
        return maxX;

    }

    public static double getMinimumX(double x1, double x2, double x3) {
        double[] array = new double[]{x1, x2, x3};
        double minX = array[0];
        for (double e : array) {
            if (e < minX) {
                minX = e;
            }
        }
        return minX;
    }

    public static double getMaximumY(double y1, double y2, double y3) {
        double[] array = new double[]{y1, y2, y3};
        double maxY = array[0];
        for (double e : array) {
            if (e > maxY) {
                maxY = e;
            }
        }
        return maxY;

    }


    public static double getMinimumY(double y1, double y2, double y3) {
        double[] array = new double[]{y1, y2, y3};
        double minY = array[0];
        for (double e : array) {
            if (e < minY) {
                minY = e;
            }
        }
        return minY;
    }

    @Override
    public double getWidth() {
        return getMaximumX(x1, x2, x3) - getMinimumX(x1, x2, x3);
    }

    @Override
    public double getHeight() {
        return getMaximumY(y1, y2, y3) - getMinimumY(y1, y2, y3);
    }

    @Override
    public double getArea() {
        return 0.5 * ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3));
    }

    @Override
    public double getPerimeter() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)) + Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2)) + Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[x1=" + x1 + ",y1=" + y1 + ",x2=" + x2 + ",y2=" + y2 + ",x3=" + x3 + ",y3=" + y3 + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = prime * hash + Double.hashCode(x1);
        hash = prime * hash + Double.hashCode(y1);
        hash = prime * hash + Double.hashCode(x2);
        hash = prime * hash + Double.hashCode(y2);
        hash = prime * hash + Double.hashCode(x3);
        hash = prime * hash + Double.hashCode(y3);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Triangle t = (Triangle) o;
        return x1 == t.x1 && y1 == t.y1 && x2 == t.x2 && y2 == t.y2 && x3 == t.x3 && y3 == t.y3;
    }
}
