package Tag14.Nachmittagsaufgabe;

public class Kreisring extends Kreis{

    private double iRadius;



    public Kreisring(double radius,double iRadius, String name){
        super(radius, name);
        this.iRadius = iRadius;

    }

    public double getiRadius(){
        return iRadius;
    }
    public void setiRadius(double iRadius){
        this.iRadius = iRadius;
    }

    @Override
    public double berechneForm(){
        return (getRadius() * 2 * Math.PI) + (getiRadius() * 2 * Math.PI);
    }
}
