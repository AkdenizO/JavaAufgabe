package Tag14.Nachmittagsaufgabe;

public abstract class Form {
    private double laenge;
    private double breite;

    private double radius;

    private String name;

    public Form(double laenge, double breite, double radius, String name){
        this.breite = breite;
        this.laenge = laenge;
        this.radius = radius;
        this.name = name;
    }

    public double getLaenge(){
        return laenge;
    }

    public double getBreite(){
        return breite;
    }

    public double getRadius(){
        return radius;
    }

    public void setLaenge(double laenge){
        this.breite = breite;
    }

    public void setBreite(double breite){
        this.breite = breite;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }
    public abstract double berechneForm();


}
