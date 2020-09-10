package prac3;

public class Rect extends Shape{
    protected double a;
    private  double b;

    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }

    public Rect(double a, double b, Color color){
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimetre() {
        return a*2 + b*2;
    }

    @Override
    public double getAera() {
        return a*b;
    }

    @Override
    public String toString() {
        return getColor() + " rect: a = " + getA() + ", b = " + getB()
                +"\naera is " + getAera() + "\nperimetre is " + getPerimetre();
    }
}
