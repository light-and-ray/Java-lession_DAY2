package lab4;

public class Yacht implements Priceable {
    double marketPrice;
    boolean isSecond_Hand;

    Yacht(double marketPrice, boolean isSecond_Hand){
        this.marketPrice = marketPrice;
        this.isSecond_Hand = isSecond_Hand;
    }
    @Override
    public double getPrice() {
        return marketPrice * (isSecond_Hand ? 0.6 : 1.);
    }
}
