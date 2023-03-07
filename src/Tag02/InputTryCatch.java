import java.util.Scanner;

public class InputTryCatch {
	public static void main(String[] args) {
        /*Schreibe ein Programm, dass 2 Zahlen von der Tastatur einliest.
        Bei Falscheingabe soll eine Fehlermeldung ausgegeben werden und
        die Eingabeaufforderung erneut erscheinen.
        Das Programm soll im Anschluss die Summe, die Differenz, das Produkt und
        den Quotient der beiden Zahlen ausgeben.

        Beispielhafter Dialog des Programms:

        Bitte 1. Zahl eingeben: 12w
        Fehlerhafte Eingabe!
        Bitte 1. Zahl eingeben: 123
        Bitte 2. Zahl eingeben: q
        Fehlerhafte Eingabe!
        Bitte 2. Zahl eingeben: 1
        Summe:     124
        Differenz: 122
        Produkt:   123
        Quotient:  123
        Aufgabe 1b:

        Erweitere das Programm dahingehend, dass ein möglicher Überlauf abgefangen wird.
        Es soll dann erneut nach der Eingabe der 2. Zahl gefragt werden.*/
		System.out.println(Integer.MAX_VALUE);

        Scanner input = new Scanner(System.in);

        int zähler = 0;
        int zahl1 = 0;
        int zahl2 = 0;
        String eingabe2 = "";

        do { //
            zähler = 0;  // zähler muss hier noch mal 0 sein. Sonst bekomme ich unendliche Schleife,
                            // wenn es einmal falsch eingegeben wirt.
            try {
                System.out.print("Bitte 1. Zahl eingeben: ");
                String eingabe1 = input.nextLine();
                zahl1 = Integer.parseInt(eingabe1);

            } catch (NumberFormatException nfe) {
                System.out.println("Fehlerhafte Eingabe!");
                zähler++;               // wenn fehler auftiritt, erhöht zähler
            }

        }while (zähler > 0); // erstmal muss Eigabe-Prozess ausführen, dann überprüfen, ob zähler > 0 ist.
                            // solange ein fehler auftritt, läuft die Schleife.

        do {
            zähler = 0; // zähler muss hier noch mal 0 sein.
            try {
                System.out.print("Bitte 2. Zahl eingeben: ");
                eingabe2 = input.nextLine();
                zahl2 = Integer.parseInt(eingabe2);

            } catch (NumberFormatException nfe) {
                System.out.println("Fehlerhafte Eingabe!");
                zähler++;
            }

        }while (zähler > 0);


            
            
            while((zahl2 > 0 && zahl1 > Integer.MAX_VALUE - zahl2)
            		||(zahl2 < 0 && zahl1 < Integer.MIN_VALUE - zahl2)) { 
    			
                try {
                	System.out.println("Ueberlauf ode Unterlauf bei Addition");
                	System.out.print("Bitte 2. Zahl eingeben: ");
	                eingabe2 = input.nextLine();
	                zahl2 = Integer.parseInt(eingabe2);
                	

                } catch (NumberFormatException nfe) {
                    System.out.println("Fehlerhafte Eingabe!");
                    zähler++;
                }
                
        
	}
            while(((zahl1 < 0 ^ zahl2 < 0)&&(zahl2 != 0 && -Math.abs(zahl1) < Integer.MIN_VALUE / Math.abs(zahl2))) || (zahl2 != 0 && zahl1 > Integer.MAX_VALUE / zahl2 || zahl1 == Integer.MIN_VALUE && zahl2 == -1)){ 
    			
                try {
                	System.out.println("Überlauf oder Unterlauf bei multiplikation");
                	System.out.print("Bitte 2. Zahl eingeben: ");
                    eingabe2 = input.nextLine();
                    zahl2 = Integer.parseInt(eingabe2);
                	

                } catch (NumberFormatException nfe) {
                	
                    System.out.println("Fehlerhafte Eingabe!");
                    zähler++;
                }
            }
            
            while((zahl2 < 0 && zahl1 > Integer.MAX_VALUE + zahl2)
            		||(zahl2 > 0 && zahl1 < Integer.MIN_VALUE + zahl2)) { 
    			
                try {
                	System.out.println("Ueberlauf oder Unterlauf bei subtraktion");
                	System.out.print("Bitte 2. Zahl eingeben: ");
                    eingabe2 = input.nextLine();
                    zahl2 = Integer.parseInt(eingabe2);
                	

                } catch (NumberFormatException nfe) {
                	
                    System.out.println("Fehlerhafte Eingabe!");
                    zähler++;
                }
            }
            

        System.out.println("\nSumme: " + (zahl1 + zahl2));
        System.out.println("Differenz: " + (zahl1 - zahl2));
        System.out.println("Produkt: " + (zahl1 * zahl2));
        
        if(zahl2 == 0 ){
        	System.out.println("Die Zahl darf nicht durch 0 getrennt werden!");
        }else if(zahl1 == Integer.MIN_VALUE && zahl2 == -1) { // Multiplikation fangt schon -2147483648/-1.
        														// abe wurde hier nochmal geprüft. 
        	System.out.println("Überlauf bei divizion"); 
        }else {
        	System.out.println("Divizion: " + (zahl1 / zahl2) );
        }
        
	}
	

}
