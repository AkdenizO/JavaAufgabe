package Tag14.Vormittagsaufgabe;

import java.sql.Array;

public class Arbeiter {

    String name;
    double stundenLohn;

    public static double berechneLohn(double stundenLohn){
        return stundenLohn * 40;
    }
}

