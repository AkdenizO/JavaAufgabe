package Tag14.Nachmittagsaufgabe;

public class Dreieck extends Kreis{

    private double linkeSeite;
    private double rechteSeite;

    public Dreieck(double linkeSeite, double rechteSeite, double radius, String name){
        super(radius, name);
        this.linkeSeite = linkeSeite;
        this.rechteSeite = rechteSeite;
    }

    public double getLinkeSeite(){
        return linkeSeite;
    }
    public double getRechteSeite(){
        return rechteSeite;
    }
    public void setLinkeSeite(double linkeSeite){
        this.linkeSeite = linkeSeite;
    }
    public void setRechteSeite(double rechteSeite){
        this.rechteSeite = rechteSeite;
    }

    @Override
    public double berechneForm(){
       return getRechteSeite() + getLinkeSeite() + (getRadius()*2); // 2
    }
}
