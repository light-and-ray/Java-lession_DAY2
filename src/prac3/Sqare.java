package prac3;

public class Sqare extends Rect {
    public Sqare(double a, Color color) {
        super(a, a, color);
    }

   @Override
    public String toString() {
        return getColor() + " sqare: a = " + getA()
                +"\naera is " + getAera() + "\nperimetre is " + getPerimetre();
    }
}
