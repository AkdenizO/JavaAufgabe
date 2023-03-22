package Tag18.Vormittagsaufgabe;

public class ZweidimensionalesArray {
    public static void main(String[] args) {
       int[][] zweiArr = {{-15, -2, -20}, {3, 5, 4}, {9, 99, 199, 250}, {300, -78, -300}};
       int[] maxima = zeilenMaxima(zweiArr);
        for (int ausgabe: maxima) {
            System.out.print(ausgabe + " ");
        }

    }
    public static int[] zeilenMaxima(int[][] a){
        int[] maxima = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            maxima[i] = Integer.MIN_VALUE;
            for (int j = 0; j <a[i].length; j++) {
                maxima[i] = Math.max(maxima[i], a[i][j]);
            }
        }
        return maxima;
    }

}
