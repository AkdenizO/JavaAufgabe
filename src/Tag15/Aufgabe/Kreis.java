package Tag15.Aufgabe;

public class Kreis extends Form{

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Kreis(double radius){
        this.radius = radius;
    }

    public double getUmfang(){
        return Math.round(2 * radius * Math.PI * 100)/100.0;
    }
}
