/*
package Tag09.Nachmittagsaufgebe;

import java.util.Scanner;

public class Konto_Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Konto-Objekte erstellen
        Konto konto1 = new Konto("Max Mustermann", "DE1234567890", 1000.0);
        Konto konto2 = new Konto("Anna Schmidt", "DE0987654321", 500.0);
        Konto konto3 = new Konto("John Doe", "DE5555555555", 2000.0);

        // Menü ausgeben und Benutzereingabe lesen
        char choice;
        do {
            System.out.println("Einzahlen (E), Auszahlen (A), Zinsen berechnen (Z), Programmende (X): ");
            choice = input.next().charAt(0);
            switch (choice) {
                case 'E':
                    einzahlen(input);
                    break;
                case 'A':
                    auszahlen(input);
                    break;
                case 'Z':
                    zinsenBerechnen(input);
                    break;
                case 'X':
                    System.out.println("Programm beendet.");
                    break;
                default:
                    System.out.println("Ungültige Eingabe!");
                    break;
            }
        } while (choice != 'X');

        input.close();
    }

    private static void einzahlen(Scanner input) {
        System.out.print("Konto-Nummer: ");
        String kontonummer = input.next();
        System.out.print("Betrag: ");
        double betrag = input.nextDouble();

        Konto konto = findKonto(kontonummer);
        if (konto != null) {
            konto.einzahlen(betrag);
            System.out.println("Einzahlung erfolgreich.");
            System.out.println(konto);
        } else {
            System.out.println("Konto nicht gefunden.");
        }
    }

    private static void auszahlen(Scanner input) {
        System.out.print("Konto-Nummer: ");
        String kontonummer = input.next();
        System.out.print("Betrag: ");
        double betrag = input.nextDouble();

        Konto konto = findKonto(kontonummer);
        if (konto != null) {
            if (konto.auszahlen(betrag) <= konto.getKontoStand(15)) {
                System.out.println("Auszahlung erfolgreich.");
                System.out.println(konto);
            } else {
                System.out.println("Nicht genug Guthaben.");
            }
        } else {
            System.out.println("Konto nicht gefunden.");
        }
    }

    private static void zinsenBerechnen(Scanner input) {
        System.out.print("Konto-Nummer: ");
        String kontonummer = input.next();

        Konto konto = findKonto(kontonummer);
        if (konto != null) {
            konto.zinsenBerechnen();
            System.out.println("Zinsen berechnet.");
            System.out.println(konto);
        } else {
            System.out.println("Konto nicht gefunden.");
        }
    }

    private static Konto findKonto(String kontonummer) {
        Konto[] konten = {konto1, konto2, konto3};
        for (Konto konto : konten) {
            if (konto.getKontonummer().equals(kontonummer)) {
                return konto;
            }
        }
        return null;

        }

    }

*/
