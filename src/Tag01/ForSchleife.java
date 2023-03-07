package Tag01;

public class ForSchleife {
    /*Schreibe ein Programm, dass alle Teiler einer Zahl ausgibt.
    Initialisiere dazu eine int-Variable und berechne
    in einer for-Schleife alle Teiler dieser Zahl.*/
    public static void main(String[] args) {

        int zahl = 120;

        for (int i = 1; i <= zahl; i++) {
            if (zahl % i == 0){
                System.out.print(i+", ");
            }

        }
    }
}
