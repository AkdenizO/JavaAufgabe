package Tag14.Nachmittagsaufgabe;

public class Main {
    public static void main(String[] args) {
        double groessteZahl = 0.0;


        Form[] arr = new Form[10];

                arr[0] = new Rechteck(11, 5, "Rechteck1");
                arr[1] = new Rechteck(6, 3, "Rechteck2");
                arr[2] = new Quadrat(9, "Quadrat1");
                arr[3] = new Quadrat(16, "Quadrat2");
                arr[4] = new Dreieck(9, 6, 3, "Dreieck1");
                arr[5] = new Dreieck(5, 7, 2, "Dreieck2");
                arr[6] = new Kreis(8, "Kreis1");
                arr[7] = new Kreis(11, "Kreis2");
                arr[8] = new Kreisring(11, 6, "Kreisring1");
                arr[9] = new Kreisring(8, 4, "Kreisring2");

        for (int i = 0; i < arr.length; i++) {
            groessteZahl = Math.max(arr[i].berechneForm(), groessteZahl);
            System.out.println("Umfang von " + arr[i].getName() + " beträgt: " + arr[i].berechneForm() );

        }
        for (int i = 0; i <arr.length; i++) {
            if (groessteZahl == arr[i].berechneForm()){
                System.out.println("Das groesste Umfang ist "+ arr[i].getName() + " = " + groessteZahl);
            }
        }






    }
}
