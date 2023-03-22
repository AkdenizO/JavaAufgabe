package Tag09.Nachmittagsaufgebe;

public class Konto {

    private String kontoInhaber;

    private String kontoNummer;

    private double kontoStand;



    private static String bic;
    private static double zinsSatz;

    public Konto(String inhabe, String nummer, double stand){
        this.kontoInhaber = inhabe;
        this.kontoNummer = nummer;
        this.kontoStand = stand;
    }

    public String getKontoInhabe(){
        return kontoInhaber;
    }

    public void setKontoInhabe(String kontoInhaber){
       this.kontoInhaber = kontoInhaber;
    }

    public String getKontoNummer() {
        return kontoNummer;
    }

    public void setKontoNummer(String kontoNummer) {
        this.kontoNummer = kontoNummer;
    }

    public double getKontoStand(double kontoStand) {
        return kontoStand;
    }


    public void einzahlen(double betrag) {
        this.kontoStand += betrag;
    }

    public void auszahlen(double betrag) {
        if (betrag <= kontoStand) {
            this.kontoStand -= betrag;
        } else {
            System.out.println("Fehler: Nicht genug Guthaben.");
        }
    }
    public double zinsenBerechnen() {
        return kontoStand * (zinsSatz / 100);
    }

    public static void aendereZinssatz(double neuerZinssatz) {
        zinsSatz = neuerZinssatz;
    }

    public static String getBic() {
        return bic;
    }

    public static void setBic(String bic) {
        Konto.bic = bic;
    }

}
