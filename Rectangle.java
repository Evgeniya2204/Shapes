package OOP.Part1.Shapes;

public class Rectangle implements Shape {
    private double sideLength1;
    private double sideLength2;

    public Rectangle(double sideLength1, double sideLength2) {
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
    }

    @Override
    public double getWidth() {
        return sideLength1;
    }

    @Override
    public double getHeight() {
        return sideLength2;
    }

    @Override
    public double getArea() {
        return sideLength1 * sideLength2;
    }

    @Override
    public double getPerimeter() {
        return sideLength1 * 2 + sideLength2 * 2;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[sideLength1=" + sideLength1 + ", sideLength2=" + sideLength2 + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int hash = 1;
        hash = hash * prime + Double.hashCode(sideLength1);
        hash = hash * prime + Double.hashCode(sideLength2);
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
        Rectangle r = (Rectangle) o;
        return sideLength1 == r.sideLength1 && sideLength2 == r.sideLength2;
    }
}
