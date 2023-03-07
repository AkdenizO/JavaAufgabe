import java.util.Scanner;

public class ArrayVergroessen {

	public static void main(String[] args) {
		/*Schreibe ein Programm, das Ganzzahlen in ein Array einliest.
		Starte mit einer Arraygröße von 2 Elementen und vergrößere das Array bei Bedarf.
		Die Eingabe soll enden, wenn der Nutzer die 0 eingibt (Die 0 soll nicht im Array gespeichert werden).

		Berechne dann die Summe sowie den Durchschnitt aller Arrayelemente und gib diese Werte an der Konsole aus.

		Entferne dann den Wert aus dem Array, der am meisten vom Mittelwert abweicht, und
		gib das Array mit den verbliebenen Werten aus.

		Beispieldialog des Programms:

		Zahlen eingeben: 1
		2
		33
		4
		0
		Summe = 40
		Durchschnitt = 10
		Größte Abweichung = 23
		Array-Werte: 1 2 4*/

		   int summe = 0;
	        int durchschnitt = 0;
	        int abweichung = 0;
	        int max = 0;

	        int indexMax = 0;

	        Scanner input = new Scanner(System.in);

	        int[] arr = new int[2];

	        for (int i = 0; i < arr.length; i++) {

	            System.out.print("Bitte eine Zahl eingeben: ");
	            String str = input.nextLine();
	            int zahl = Integer.parseInt(str);

	            if (zahl == 0){
	                break;
	            }
	            arr[i] = zahl;

	            if (i == arr.length -1){
	                int[] temp = new int[arr.length + 1];

	                for (int j = 0; j <arr.length; j++) {
	                    temp[j] = arr[j];

	                }
	                arr = temp;
	            }
	        }

	        for (int i = 0; i < arr.length; i++) {
	            summe += arr[i];

	        }

	        
	        

	        for (int i = 0; i <arr.length; i++) {

	            max = Math.max(arr[i], max); // ich lese hier die Werte vom Array,
	                                        // dann speichere ich den größten Wert in max.
	                                        // am Ende habe ich den größten Wert


	        }
	        
	        


	        for (int i = 0; i <arr.length; i++) { // ich finde hier Index vom Max-Wert.
	            if (arr[i] == max){
	                indexMax = i;
	                //System.out.println("index von max: " + i);
	            }

	        }
	        
	        for (int i = indexMax; i < arr.length -1; i++) { // ich verschiebe hier den Index 
	        													//für die Entfernung vom Max-Wert 
	            arr[i] = arr[i+1];

	        }
	        
	        int[] newArr = new int[arr.length -2]; 		// hier definiere ich neues Array 
	        for (int i = 0; i < newArr.length ; i++) {  //-1 für den größen Wert und -1 für den 0
	            newArr[i] = arr[i];
	        }
	        
	        arr = newArr;

	        System.out.println("Summe = " + summe);
	        
	        durchschnitt = summe / (arr.length +1);
	        System.out.println("Durchschnitt = " + durchschnitt);
	        
	        abweichung = (max - durchschnitt);
	        System.out.println("Größte Abweichung = " + abweichung);

	        System.out.print("Array-Werte: ");
	        for (int i = 0; i < arr.length ; i++) {
	            System.out.print(arr[i] + " ");

	        }

	}

}
