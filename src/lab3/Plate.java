package lab3;

public class Plate extends Dish {
    private boolean isDeep;
    Plate(Material mat, boolean isDeep) {
        material = mat;
        this.isDeep = isDeep;
    }

    public boolean getIsDeep(){
        return isDeep;
    }

    @Override
    public Material getMaterial() {
        return material;
    }
}
