import java.awt.*;

public class Arrays {
    public static void main(String[] args) {

        int[] i = {1,3,4};
        String[] requests;
        Point[] points;
        Point[] markup = {new Point(1,2), new Point(1,5), new Point(2, 5)};
        String[] titles = {"Pan", "Pani", "Panstwo"};


        int[] temps = new int[99];
        temps[0] = 1;
        temps[2] = 2;

        System.out.println(temps[2]);
        System.out.println(temps.length);
    }

}
