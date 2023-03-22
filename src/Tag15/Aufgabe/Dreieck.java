package Tag15.Aufgabe;

public class Dreieck extends Form{
    private double seiteA;
    private double seiteB;
    private double seiteC;

    public Dreieck(double seiteA, double seiteB, double seiteC){
        this.seiteA = seiteA;
        this.seiteB = seiteB;
        this.seiteC = seiteC;
    }

    public double getSeiteA() {
        return seiteA;
    }

    public double getSeiteB() {
        return seiteB;
    }

    public double getSeiteC() {
        return seiteC;
    }

    public void setSeiteA(double seiteA) {
        this.seiteA = seiteA;
    }

    public void setSeiteB(double seiteB) {
        this.seiteB = seiteB;
    }

    public void setSeiteC(double seiteC) {
        this.seiteC = seiteC;
    }

    @Override
    public double getUmfang(){
        return seiteA + seiteB +seiteC;
    }
}
