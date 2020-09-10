package prac3;

public abstract class Shape {
    private Color color;
    Shape(Color color){
        this.color = color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor(){
        return color;
    }

    public abstract double getPerimetre();
    public abstract double getAera();

    public abstract String toString();
}
