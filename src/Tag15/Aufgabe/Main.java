package Tag15.Aufgabe;

public class Main {
    public static void main(String[] args) {
        Form[] formen = {
                new Recheckt(15, 25),
                new Quadrat(4),
                new Dreieck(3, 5, 4),
                new Kreis(5),
                new Kreisring(2, 4 )
        };

        for (Form form: formen) {
            System.out.println(form.getUmfang());
        }

    }
}
