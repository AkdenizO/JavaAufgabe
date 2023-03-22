package Tag14.Nachmittagsaufgabe;

public class Kreis extends Form{


   public Kreis(double radius, String name){
       super(radius, radius, radius, name);
   }

   @Override
   public double berechneForm(){
       return Math.round(getRadius() * 2 * Math.PI *100) /100.0;

   }


}
