package Tag14.Vormittagsaufgabe;

import Tag14.Vormittagsaufgabe.Arbeiter;

public class StundenArbeiter extends Arbeiter {
    int stundenAnzahl;

    public static double berechneLohn(double stundenLohn, int stundenAnzahl){
        if (stundenAnzahl <= 40){
            return stundenLohn * stundenAnzahl;

        }else
            return (stundenLohn * 40) + (stundenLohn * (stundenAnzahl - 40)*1.5);
    }

}
