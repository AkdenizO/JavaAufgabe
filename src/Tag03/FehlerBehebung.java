import java.util.Scanner;

public class FehlerBehebung {

	public static void main(String[] args) {
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
        
        if(zahl2 > 0 && zahl1 > Integer.MAX_VALUE - zahl2) { 
			
			try {
				System.out.println("Überlauf bei Addition");
                System.out.print("Bitte 2. Zahl eingeben: ");
                eingabe2 = input.nextLine();
                zahl2 = Integer.parseInt(eingabe2);

            } catch (NumberFormatException nfe) {
                System.out.println("Fehlerhafte Eingabe!");
                zähler++;               
            }
		}else if(zahl2 < 0 && zahl1 < Integer.MIN_VALUE - zahl2) {
			System.out.println("Unterlauf bei Addition");
		}
		
        
        if(zahl2 < 0 && zahl1 < Integer.MIN_VALUE + zahl2) {
        	try {
        		System.out.println("Ueberlauf bei Subtraktion");
        		System.out.print("Bitte 2. Zahl nochmal eingeben: ");
        		eingabe2 = input.nextLine();
        		zahl2 = Integer.parseInt(eingabe2);
        	}catch(NumberFormatException nfe) {
        		System.out.println("Fehlerhate Eingabe!");
        		zähler++;
        	}
        }else if(zahl2 > 0 && zahl1 < Integer.MIN_VALUE + zahl2) {
			System.out.println("Unterlauf bei Subtraktion");
		}

        
        if(zahl1 < 0 ^ zahl2 < 0) {
			if(zahl2 != 0 && -Math.abs(zahl1) < Integer.MIN_VALUE / Math.abs(zahl2)) {
				try {
					System.out.println("Unterlauf bei Multiplikation");
					System.out.print("Bitte 2. Zahl nochmal eingeben: ");
	        		eingabe2 = input.nextLine();
	        		zahl2 = Integer.parseInt(eingabe2);
	        		
				}catch(NumberFormatException nfe){
					System.out.println("Fehlerhate Eingabe!");
	        		zähler++;
				}
				
			}
        }else if(zahl2 != 0 && Math.abs(zahl1) > Integer.MAX_VALUE / Math.abs(zahl2)
				|| zahl1 == Integer.MIN_VALUE && zahl2 == -1) {
        	try {
        		System.out.println("Überlauf bei Multiplikation");
        		System.out.print("Bitte 2. Zahl nochmal eingeben: ");
        		eingabe2 = input.nextLine();
        		zahl2 = Integer.parseInt(eingabe2);
        		
        	}catch(NumberFormatException nfe) {
        		System.out.println("Fehlerhafte Eingabe!");
        	}
			
		}
        
            


        System.out.println("\nSumme: " + (zahl1 + zahl2));
        System.out.println("Differenz: " + (zahl1 - zahl2));
        System.out.println("Produkt: " + (zahl1 * zahl2));
        
        if(zahl2 == 0) {
        	System.out.println("Die Zahl darf nicht durch 0 getrennt werden!");
        
        }else if(zahl1 == Integer.MIN_VALUE && zahl2 == -1) {
        	System.out.println("Ueberlauf bei Division");
        
        }else
        	System.out.println("Division: " + (zahl1 / zahl2));
        	
	
        
        
        
        

	}
	
	}


