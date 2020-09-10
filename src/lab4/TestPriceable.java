package lab4;

public class TestPriceable {
    private static void printPrice(String outName, Priceable priceable){
        System.out.println("Цена " + outName + ": $" + priceable.getPrice());
    }
    public static void main(String[] args){
        Priceable yacht = new Yacht(1002000, true);
        Priceable car = new Car(4699, false);
        Priceable pancake = new Pancake(true);
        Priceable jewelry = new Jewelry(10, 2);

        printPrice("яхты б/у", yacht);
        printPrice("нового автомобиля", car);
        printPrice("блинчика с начинкой", pancake);
        printPrice("юведирного украшения весом 10 карат, 2-го качества", jewelry);
    }
}
