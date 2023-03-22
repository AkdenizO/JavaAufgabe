package Tag15.Aufgabe;

public class Kreisring extends Kreis {

    private double innenRadius;

    public Kreisring(double innenRadius, double radius){
        super(radius);
        this.innenRadius = innenRadius;

    }
    public double getInnenRadius(){
        return innenRadius;
    }
    public void setInnenRadius(double innenRadius){
        this.innenRadius = innenRadius;
    }


    public double geUmfang(){
        return (innenRadius + getRadius()) * Math.PI * 2;
    }



}
