package Tag09;

public class Static2 {
    /*
    1-  Erzeuge eine neue Klasse Mwst und lagere die mwst-Methoden in diese Klasse aus.
    Schreibe dann die Klasse Static2 so um, das die mwst-Methoden aus der Klasse Mwst aufgerufen werden.

    2- Definiere die mwst-Methoden aus der Klasse Mwst als Instanzenmethoden und ändere Static2 entsprechend.
    */
    public static void main(String[] args) {


        System.out.println(Mwst.mwst(100));
        System.out.println(Mwst.mwst(100, 'H'));
        System.out.println(Mwst.mwst(100, 19));

    }
}
