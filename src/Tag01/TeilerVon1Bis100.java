package Tag01;

public class TeilerVon1Bis100 {
    /*Gebe die Teiler aller Zahlen von 1 bis 100 aus.
    * Beispielausgabe:
...
14: 1  2  7  14
15: 1  3  5  15
16: 1  2  4  8  16
...*/
    public static void main(String[] args) {

        int zahl = 100;

        for (int i = 1; i <= zahl ; i++) {
            System.out.print(i + ": ");
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0){

                    System.out.print(j + " ");
                }


            }
            System.out.println(" ");
        }
    }
}
