package Tag16;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Comparable<Obst>[] obstArray = new Obst[4];
        obstArray[0] = new Apfel("Elstar", 200);
        obstArray[1] = new Birne("Williams Christ", 150);
        obstArray[2] = new Apfel("Gala", 180);
        obstArray[3] = new Birne("Conference", 120);


        Arrays.sort(obstArray);

        for (Comparable<Obst> obst: obstArray){
            System.out.println(obst);
        }
    }
}
