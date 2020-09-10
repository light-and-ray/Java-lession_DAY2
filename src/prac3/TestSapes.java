package prac3;

public class TestSapes {
    public static void main (String[] args) {
       Sqare sq1 = new Sqare(5, Color.black);
       Sqare sq2 = new Sqare(2, Color.yellow);
       Sqare sq3 = new Sqare(4, Color.green);

       Rect re1 = new Rect(2,6, Color.violet);
       Rect re2 = new Rect(4,5, Color.blue);

       Circle ci1 = new Circle(7, Color.red);
       Circle ci2 = new Circle(2, Color.black);

       System.out.println(sq1 + "\n");
       System.out.println(sq2 + "\n");
       System.out.println(sq3 + "\n");

       System.out.println(re1 + "\n");
       System.out.println(re2 + "\n");

       System.out.println(ci1 + "\n");
       System.out.println(ci2 + "\n");
    }
}
