package lab3;

public class Cup extends Dish{
    private boolean hasHand;
    public Cup(Material mat, boolean hasHand) {
        material = mat;
        this.hasHand = hasHand;
    }

    public boolean getHasHand(){
        return hasHand;
    }

    @Override
    public Material getMaterial() {
        return material;
    }
}
