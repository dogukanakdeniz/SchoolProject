package opdracht_1_3_tm_1_5;

public class Main {
    public static void main (String[] arg) {
        Student St1 =   new Student("Sylvester", 0);
        System.out.println( St1.getNaam());
        System.out.println("nummer: " + St1.getstudentNummer());
        St1.setstudentNummer(12345678);
        System.out.println( St1.toString() );
        System.out.println();

        Student St2 = new Student("Karel", 98765432);
        System.out.println( St2.getNaam() );
        System.out.println("nummer: " + St2.getstudentNummer());
        System.out.println( St2.toString() );
    }
}


