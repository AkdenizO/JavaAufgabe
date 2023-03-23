package Tag19.Vormittagsaufgabe;

import java.util.Scanner;

public class Primzahl {
    public static void main(String[] args) {

        primzahl(scanner());

    }
    public static int[] zahlen(int zahl){
        int[] zahlen = new int[zahl];
        for (int i = 1, j = 0; i <= zahl; i++, j++) {
            zahlen[j] = i;
        }
        return zahlen;
    }
    public static void primzahl(int zahl) {
        int zaehler = 0;
        int wievielePrimezahl = 0;

        for (int i = 0; i < zahlen(zahl).length; i++) {
            zaehler = 0;
            for (int j = 1; j <= zahlen(zahl)[i]; j++) {
                if (zahlen(zahl)[i] % j == 0) {
                    zaehler++;
                }
            }
            if (zaehler == 2) {
                wievielePrimezahl++;
            }
        }
        System.out.println("Anzahl der Primzahl: " + wievielePrimezahl);

    }
    public static int scanner(){
        boolean istFehler = false;
        Scanner input = new Scanner(System.in);
        int zahl = 0;

        do {
            istFehler = false;
            try {
                System.out.print("bitte eine Zahl eingeben: ");
                String str = input.nextLine();
                zahl = Integer.parseInt(str);
            } catch (NumberFormatException nfe) {
                System.out.println("fehlerhafte Zahl!");
                istFehler = true;
            }
        }while (istFehler == true);

        return zahl;

    }
}
