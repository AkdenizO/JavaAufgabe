package Tag12;

public class Quersumme {
    public static void main(String[] args) {
        int[] id = {6, 2, 5, 8, 4, 3, 1, 9, 7};

        int wert = 2;
        multiplikation(id, wert);
        System.out.println("Quersumme aller entstandenen Produkte: " + quersummen(id));

        System.out.println("addition: " + addition(id));
        System.out.println("addition von 2 und 3 = " + addition(quersummen(id),addition(id)));

    }

    /**
     * Multiplikation aller Ziffern an ungerader Stelle mit 2
     * @param id
     * @param wert
     */
    public static void multiplikation(int[] id, int wert) {
        int ergebnis = 0;
        for (int i = 0; i < id.length; i += 2) {
            ergebnis = id[i] * wert;
            System.out.println(id[i] + " * " + wert + "= " + ergebnis);
        }
    }

    public static int quersummen (int[] id){
        int ergebnis = 0;
        for (int i = 0; i < id.length; i += 2) {
            ergebnis += id[i] * 2;
            if (ergebnis / 10 >= 1 ){
               ergebnis = (ergebnis % 10) + 1;
            }


        }
        return ergebnis;

    }

    /**
     * Addition aller Ziffern an gerader Stelle
     * @param id
     * @return
     */
    public static int addition(int[] id) {
        int ergebnis = 0;
        for (int i = 1; i < id.length; i += 2) {
            ergebnis += id[i];

        }
        return ergebnis;
    }
    public static int addition (int wert1, int wert2){
        return wert1 + wert2;
    }
}
