import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scannerTool = new Scanner(System.in);


        System.out.println("_____ Exercise 1.1");

        System.out.println("Ciao, inserisci il primo numero:");
        int num1 = Integer.parseInt(scannerTool.nextLine());
        System.out.println("Ciao, inserisci il secondo numero:");
        int num2 = Integer.parseInt(scannerTool.nextLine());

        System.out.println("La moltiplicazione dei due numeri è: " + (num1 * num2));


        System.out.println("_____ Exercise 1.2");

        System.out.println("Inserisci una parola/frase testuale:");
        String yourStr = scannerTool.nextLine();
        System.out.println("Inserisci un numero:");
        int yourNum = Integer.parseInt(scannerTool.nextLine());

        System.out.println("La concatenazione risulta: " + yourStr + " " + yourNum);


        System.out.println("_____ Exercise 1.3");

        String[] arrayOfStr = {"Primo", "Secondo", "Terzo", "Quarto", "Quinto"};

        System.out.println("Inserisci una stringa nuova al Terzo posto:");
        String newStringThird = scannerTool.nextLine();

        String[] newArrayOfStr = new String[6];

        newArrayOfStr[0] = arrayOfStr[0];
        newArrayOfStr[1] = arrayOfStr[1];
        newArrayOfStr[2] = newStringThird;
        newArrayOfStr[3] = arrayOfStr[2];
        newArrayOfStr[4] = arrayOfStr[3];
        newArrayOfStr[5] = arrayOfStr[4];
        scannerTool.close();

        System.out.println("Ecco il nuovo array di 6 elementi: " + newArrayOfStr);

        scannerTool.close();
    }
}