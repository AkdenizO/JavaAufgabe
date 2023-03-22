package Tag16;

public class Obst
        implements Comparable<Obst> {
    private String name;
    private double gewicht;

    public Obst(String name, double gewicht) {
        this.name = name;
        this.gewicht = gewicht;
    }

    public String getName() {
        return name;
    }

    public double getGewicht() {
        return gewicht;
    }
    @Override
    public int compareTo(Obst other) {
        if (this.gewicht < other.gewicht) {
            return -1;
        } else if (this.gewicht > other.gewicht) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return name + " (" + gewicht + "g)";
    }


}
