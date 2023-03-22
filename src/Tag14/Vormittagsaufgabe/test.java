package Tag14.Vormittagsaufgabe;

import Tag14.Vormittagsaufgabe.Arbeiter;
import Tag14.Vormittagsaufgabe.StundenArbeiter;

public class test {
    public static void main(String[] args) {

        Arbeiter arbeiter = new Arbeiter();
        arbeiter.name = "Hans Müller";
        arbeiter.stundenLohn = 20.0;


        System.out.println(arbeiter.name + " bekommt pro Woche: " + Arbeiter.berechneLohn(arbeiter.stundenLohn) + "€");

        StundenArbeiter stundenArbeiter = new StundenArbeiter();
        stundenArbeiter.name = "Der arme Lukas";
        stundenArbeiter.stundenLohn = 15.0;
        stundenArbeiter.stundenAnzahl = 40;

        System.out.println(stundenArbeiter.name + " bekommt pro Woche: "
                + StundenArbeiter.berechneLohn(stundenArbeiter.stundenLohn, stundenArbeiter.stundenAnzahl));





    }
}
