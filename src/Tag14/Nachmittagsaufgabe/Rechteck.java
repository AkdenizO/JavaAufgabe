package Tag14.Nachmittagsaufgabe;

public class Rechteck extends Form {


    public Rechteck(double laenge, double breite, String name){
        super(laenge, breite, laenge, name);

    }
    @Override
    public double berechneForm(){
        return (getLaenge() + getBreite()) * 2;

    }
}
