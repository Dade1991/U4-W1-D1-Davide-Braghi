import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner scannerTool = new Scanner(System.in);


        System.out.println("_____ Exercise 2.1");

        System.out.println("Inserisci la prima parola:");
        String str1 = scannerTool.nextLine();
        System.out.println("Inserisci la seconda parola:");
        String str2 = scannerTool.nextLine();
        System.out.println("Inserisci la terza parola:");
        String str3 = scannerTool.nextLine();

        System.out.println(str1 + " " + str2 + " " + str3);

        String concatStr = (str1 + " " + str2 + " " + str3);

        System.out.println(new StringBuilder(concatStr).reverse().toString());

        scannerTool.close();
    }
}