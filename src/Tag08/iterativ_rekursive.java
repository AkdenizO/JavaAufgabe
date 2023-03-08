package Tag08;

public class iterativ_rekursive {
    /*Schreibe eine Methode swap(int[] zahlen), die ein übergebenes Array invertiert
    (d.h. die Reihenfolge der Elemente im Array umdreht) und das umgedrehte Array zurückgibt.
    Schreibe eine iterative und eine rekursive Variante sowie ein Programm, um die Methoden zu testen.*/
    public static void main(String[] args) {

        int[] zahlen = {1, 2, 3, 4, 5};
        swap(zahlen);

        for (int wert: zahlen) {
            System.out.print(wert + " ");
        }

    }
    public static int[] swap(int[] zahlen) {

        int zahl = 0;

        // der erste Wert geht an das Ende und der letze Wert geht an die erste Reihe.
        // daher muss i auf die Hälfte der Zahl steigen.
        for (int i = zahlen.length-1, j = 0; i >= zahlen.length/2; i--, j++) { //  (zahlen.length/2)+1 =
            zahl = zahlen[j]; // ich speichere hier den Wert von index j (erste, zweite, dritte...)
            zahlen[j] = zahlen[i]; // die letze Zahl geht die erste Reihe
            zahlen[i] = zahl; // die erste Zahl geht die letzte Reihe

        }
        return zahlen;
    }
}
