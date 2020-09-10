package lab3;

public class TestDishes {
    public static void testCup(Cup cup){
        String mat = "default";
        switch (cup.getMaterial()){
            case glass -> mat = "стеклянная";
            case metall -> mat = "металлическая";
            case ceramic -> mat = "керамическая";
        }
        System.out.println("Это " + mat + " кружка " + (cup.getHasHand() ? "с ручкой" : "без ручки") );
    }
    public static void testPlate(Plate plate){
        String mat = "default";
        switch (plate.getMaterial()){
            case glass -> mat = "стеклянная";
            case metall -> mat = "металлическая";
            case ceramic -> mat = "керамическая";
        }
        System.out.println("Это " + mat + (plate.getIsDeep() ? " глубокая" : " неглубокая") + " тарелка" );
    }
    public static void main (String[] args){
        Cup cup1 = new Cup(Material.glass, true);
        Cup cup2 = new Cup(Material.metall, false);
        Plate p1 = new Plate(Material.metall, false);
        Plate p2 = new Plate(Material.ceramic, true);
        testCup(cup1);
        testCup(cup2);
        testPlate(p1);
        testPlate(p2);
    }
}
