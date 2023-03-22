package Tag15.Vormittagsaufgabe;

public class Angestellter extends Mitarbeiter {

    private double gehalt;

    public Angestellter(String name, String wohnort, double gehalt) {
        super(name, wohnort);
        this.gehalt = gehalt;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public double monatsverdient() {
        return gehalt;
    }
}
