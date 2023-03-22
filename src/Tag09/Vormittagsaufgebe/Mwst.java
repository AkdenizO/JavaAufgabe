package Tag09.Vormittagsaufgebe;

public class Mwst {


    public static double mwst(double wert,double prozent) {
        double brutto = wert / 100 * prozent + wert;
        return brutto;
    }
    public static double mwst(double wert) {
        return mwst(wert,19);
    }
    public static double mwst(double wert,char schluessel) {
        if (schluessel == 'V')
            return mwst(wert,19);
        else if (schluessel == 'H')
            return mwst(wert,7);
        else
            return mwst(wert);
    }
}
