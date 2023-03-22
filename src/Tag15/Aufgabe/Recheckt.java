package Tag15.Aufgabe;

public class Recheckt extends Form{
    private double laenge;
    private double breite;



    public Recheckt(double laenge, double breite){
        this.laenge = laenge;
        this.breite = breite;
    }

    /*************************************
     * Getter-----Setter
     *******************************************/

    public double getLaenge(){
        return laenge;
    }
    public double getBreite(){
        return breite;
    }

    public void setLaenge(double laenge){
      this.laenge = laenge;
    }
    public void setBreite(double breite){
      this.breite = breite;
    }


    @Override
    public double getUmfang() {
        return (laenge + breite) * 2;
    }
}

