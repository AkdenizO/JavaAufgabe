package Tag15.Vormittagsaufgabe;

public abstract class Mitarbeiter {

    private String name;
    private String wohnort;

    public static final double MINDESTLOHN = 12.50;

    public Mitarbeiter(String name, String wohnort) {
        this.name = name;
        this.wohnort = wohnort;
    }

    public String getName() {
        return name;
    }

    public String getWohnort() {
        return wohnort;
    }

    public void setName(String name) {
        if (name != null && !name.equals("")){
            this.name = name;
        }
        else {
            this.name = "No Name";
        }

    }

    public void setWohnort(String wohnort) {
        this.wohnort = wohnort;
    }

    public abstract double monatsverdient();
}
