package Tag01;

public class GrossUndKleinWert {
    /*
    Definiere drei int-Variablen und initialisiere diese. Schreibe ein Programm,
    dass den größten und den kleinsten Wert ausgibt.
     */
    public static void main(String[] args) {
        int zahl1 = 42;
        int zahl2 = 137;
        int zahl3 = 73;

        if (zahl1 > zahl2){
            System.out.println("Größte Zahl: " + (zahl1 > zahl3 ? zahl1 : zahl3));
            System.out.println("Kleinste Zahl: " + (zahl2 < zahl3 ? zahl2 : zahl3));
        }else
            System.out.println("Größte Zahl: " + (zahl2 > zahl3 ? zahl2 : zahl3));
        System.out.println("Kleinste Zahl: " + (zahl1 < zahl3 ? zahl1 : zahl3));

        // lösung 2
        System.out.println("Größte Zahl: "+ Math.max(Math.max(zahl1, zahl2), zahl3));
        System.out.println("Kleinste Zahl: "+ Math.min(Math.min(zahl1, zahl2), zahl3));
    }








}
