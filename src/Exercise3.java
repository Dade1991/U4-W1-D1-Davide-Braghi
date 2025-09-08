import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scannerTool = new Scanner(System.in);


        System.out.println("_____ Exercise 3.1");

        System.out.println("Inserisci la base del rettangolo:");
        double rectangleBase = Double.parseDouble(scannerTool.nextLine());
        System.out.println("Inserisci l'altezza del rettangolo:");
        double rectangleHeight = Double.parseDouble(scannerTool.nextLine());


        double rectanglePerimeter = (2 * (rectangleBase + rectangleHeight));

        System.out.println("Il perimetro del rettangolo è: " + rectanglePerimeter);


        System.out.println("_____ Exercise 3.2");

        System.out.println("Inserisci un numero per verficare che sia pari (0) o dispari (1)");
        int inputNumber = Integer.parseInt(scannerTool.nextLine());

        int evenOrOddResult = (inputNumber % 2);

        System.out.println("Risultato Even or Odd: " + evenOrOddResult);


        System.out.println("_____ Exercise 3.3");

        System.out.println("Inserisci la base del triangolo:");
        double triangleBase = Double.parseDouble(scannerTool.nextLine());
        System.out.println("Inserisci l'altezza del triangolo:");
        double triangleHeight = Double.parseDouble(scannerTool.nextLine());

        final int areaConst = 2;

        double triangleArea = ((triangleBase * triangleHeight) / areaConst);

        System.out.println("L'area del triangolo è: " + triangleArea);

        scannerTool.close();
    }
}