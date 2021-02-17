package opdracht_3_2;

public class TariefFabriek {
    public static void main(String[] arg) {
        BelastingTarieven BT = new BelastingTarieven();
        BT.produceerBelastingTarieven();

        try {
            BT.produceerBelastingTarieven();
        } catch (ArithmeticException e) {
            System.out.println("mislukt");
        }
    }
}