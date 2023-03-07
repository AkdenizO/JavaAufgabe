package Tag01;

public class Primzahl2 {
    /*Prüfe, für welche int-Zahl n (n < 50) die folgende Formel eine Primzahl liefert.

    Formel:
    n * n - n + 41*/
    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i < 50 ; i++) {
            int zahl = i * i - i + 41;
            for (int j = 1; j <= zahl; j++) {
                if (zahl % j == 0){
                    count++;
                }
                if (count == 2){
                    System.out.println(i);
                }
            }
        }















    }
}