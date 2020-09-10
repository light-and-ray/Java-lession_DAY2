package lab4;

public class Pancake implements Priceable{ //блинчики
    boolean hasFilling; //есть ли начинка

    Pancake(boolean hasFilling){
        this.hasFilling = hasFilling;
    }
    @Override
    public double getPrice() {
        return 0.5 + (hasFilling ? 0.3 : 0);
    }
}
