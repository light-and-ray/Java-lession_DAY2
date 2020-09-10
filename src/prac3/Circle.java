package prac3;

public class Circle extends Shape {
    private double radius;
    Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getPerimetre() {
        return 3.14159 * 2 * radius;
    }

    @Override
    public double getAera() {
        return 3.14159 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return getColor() + " circle: radius = " + getRadius()
                +"\naera is " + getAera() + "\nperimetre is " + getPerimetre();
    }
}
