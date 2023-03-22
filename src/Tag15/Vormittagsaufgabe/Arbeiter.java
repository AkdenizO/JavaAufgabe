package Tag15.Vormittagsaufgabe;

public class Arbeiter extends Mitarbeiter {

    private double stundenlohn;
    private int arbeitsstunden;

    public Arbeiter(String name, String wohnort, double stundenlohn, int arbeitsstunden) {
        super(name, wohnort);
        setStundenlohn(stundenlohn);
        setArbeitsstunden(arbeitsstunden);

    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public int getArbeitsstunden() {
        return arbeitsstunden;
    }

    public void setStundenlohn(double stundenlohn) {
        if (stundenlohn >= MINDESTLOHN ){
            this.stundenlohn = stundenlohn;
        }else {
            this.stundenlohn = MINDESTLOHN;
        }
    }

    public void setArbeitsstunden(int arbeitsstunden) {
        this.arbeitsstunden = arbeitsstunden;
    }


    @Override
    public double monatsverdient() {
        return stundenlohn * arbeitsstunden;
    }
}
