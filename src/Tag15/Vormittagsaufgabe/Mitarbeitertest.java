package Tag15.Vormittagsaufgabe;

public class Mitarbeitertest {
    public static void main(String[] args) {
        Mitarbeiter[] arr = {
                new Angestellter("", "Hannover", 3500),
                new Angestellter("Hans Müller", "Papenburg", 3350),
                new Arbeiter("", "Braunschweig", 5, 120),
                new Arbeiter("Emil", "Hannover", 5, 130),
        };

        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i].getName() + " verdient pro Monat: " + arr[i].monatsverdient());
        }
    }
}
