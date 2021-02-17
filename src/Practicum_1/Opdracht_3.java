package Practicum_1;
import java.util.Random;

public class Opdracht_3 {
    public static void main ( String[] arg ) {
        Random nummer = new Random();
        int getal;

        for (int counter = 1; counter <= 10; counter++) {
            getal = 1+ nummer.nextInt(10);
            System.out.println(getal);
        }
    }

}
