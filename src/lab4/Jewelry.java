package lab4;

public class Jewelry implements Priceable{ //ювилирные изделия
    protected double carats; //караты
    protected double quality; //качество золота

    Jewelry(double carats, double quality){
        this.carats = carats;
        this.quality = quality;
    }
    @Override
    public double getPrice() {
        return carats * quality * 10.;
    }
}
