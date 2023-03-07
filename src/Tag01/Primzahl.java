package Tag01;

public class Primzahl {
    /*Prüfe, ob die Zahl in einer int-Variablen eine Primzahl ist.*/
    public static void main(String[] args) {


        int zahl = 3337;
        int count = 0;

        for (int i = 2; i <= zahl; i++) {
            if (zahl % i == 0) {
                count++;
            }

        }
        if (count > 2 | zahl == 1)
        {
            System.out.println(zahl + " ist keine Primzahl");
        }else
            System.out.println(zahl + " ist eine Primzahl");
    }
}