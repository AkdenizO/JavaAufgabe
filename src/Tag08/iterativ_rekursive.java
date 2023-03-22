package Tag08;

public class iterativ_rekursive {
    /*Schreibe eine Methode swap(int[] zahlen), die ein übergebenes Array invertiert
    (d.h. die Reihenfolge der Elemente im Array umdreht) und das umgedrehte Array zurückgibt.
    Schreibe eine iterative und eine rekursive Variante sowie ein Programm, um die Methoden zu testen.*/
    public static void main(String[] args) {

        int[] zahlen = {1, 2, 3, 4, 5};

        swap(zahlen);
        System.out.print("Iterative: ");
        for (int wert: zahlen) {
            System.out.print(wert + " ");
        }
        System.out.println();

//        int[] array = {6, 7, 8, 9, 10};
        swapRekursive(zahlen, 0);
        System.out.print("Rekursive: ");
        for (int wert2: zahlen) {
            System.out.print(wert2 + " ");
        }
    }
    public static int[] swap(int[] zahlen) {
        // der erste Wert geht an das Ende und der letze Wert geht an die erste Reihe.
        // daher muss i auf die Hälfte der Zahl steigen.
        for (int i = zahlen.length-1, j = 0; i >= zahlen.length/2; i--, j++) {
            int zahl = zahlen[j]; // ich hole und spreichere hier den Wert von index j (erste, zweite, dritte...)
            zahlen[j] = zahlen[i]; // die letze Zahl geht die erste Reihe
            zahlen[i] = zahl; // die erste Zahl geht in die letzte Reihe
        }

        return zahlen;
    }
    // i = LetzteIndex... j = ErsteIndex, ZweiteIndex...
    public static int[] swapRekursive(int[] zahlen, int j){
        if (j <= zahlen.length / 2) {
            int i = zahlen.length - j - 1;      // Index (erste, zweite, dritte...)
            int zahl = zahlen[j];               // ich hole hier die Werte vom Zahlen
            zahlen[j] = zahlen[i];
            zahlen[i] = zahl;

            swapRekursive(zahlen, j +1);
        }
        return zahlen;

    }
}
