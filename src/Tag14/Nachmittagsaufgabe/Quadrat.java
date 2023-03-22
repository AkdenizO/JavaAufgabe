package Tag14.Nachmittagsaufgabe;

public class Quadrat extends Rechteck {

    public Quadrat (double laenge, String name){
        super(laenge, laenge, name);

    }
    @Override
    public double berechneForm(){
        return getLaenge() * 4;
    }




}

