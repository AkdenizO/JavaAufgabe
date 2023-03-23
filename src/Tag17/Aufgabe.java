package Tag17;

public class Aufgabe {
    public static void main(String[] args) {
        String text = "Der Text, der konvertiert werden soll";

        System.out.println(konvertiere(text, c -> c + 1));
        System.out.println(konvertiere(text, c -> c - 32));

       /* Funktion f = new Funktion() {
            public char funk(char c){
                return (char) (c + 1);  // Integer - Berechnung
            }
        };*/
    }

    private static String  konvertiere(String text, Funktion f) {
        String ergebnis = "";
        for (int i = 0; i <text.length(); i++) {
            ergebnis += (char)f.funk(text.charAt(i));
        }
        return ergebnis;
    }
}
