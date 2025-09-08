import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("************************************ TIPI PRIMITIVI *******************************************");

		boolean b = true;
		// b = 10;
		b = false;

		byte numeroInteroMoltoPiccolo = 12;
		short numeroInteroPiccolo = 10000;
		int numeroIntero = 1000000;
		long numeroInteroMoltoGrande = 546465464;

		// numeroInteroMoltoGrande = numeroInteroMoltoPiccolo; // CASTING IMPLICITO. Java effettua una conversione per noi in automatico, lo può
		// fare perché i 2 formati sono compatibili (contenuto piccolo sta nella scatola grande)

		numeroInteroMoltoPiccolo = (byte) numeroInteroMoltoGrande; // CASTING ESPLICITO. In questo caso è lo sviluppatore a prendersi la responsabilità
		// di voler fare una conversione "forzata". Questa tecnica in alcuni casi sarà molto utile però in generale può portare a diversi problemi,
		// pertanto va utilizzata con molta cautela!

		System.out.println(numeroInteroMoltoPiccolo);
		System.out.println(numeroInteroPiccolo);
		System.out.println(numeroIntero);
		System.out.println(numeroInteroMoltoGrande);

		// float numeroDecimale = 2.3f;
		double altroNumDecimale = 2.3;
		// Entrambi sono tipi di dato decimali, però i processori moderni sono più efficienti nel fare i calcoli double, pertanto andremo ad utilizzare
		// sempre i DOUBLE

		char carattereSingolo = 'B'; // con gli apici singoli sono CHAR, con apici doppi sono STRING

		String testo = "Hello World";
		System.out.println(testo);
		System.out.println(testo.toUpperCase());
		System.out.println(testo.length());
		System.out.println(testo.charAt(0));

		System.out.println("************************************ ARRAYS *******************************************");
		String[] stagioni = new String[4];
		stagioni[0] = "Primavera";
		stagioni[1] = "Estate";
		stagioni[2] = "Autunno";
		stagioni[3] = "Inverno";
		// stagioni[4] = "Ulteriore stagione che in realtà non esiste"; <-- ArrayIndexOutOfBoundsException

		String[] stagioni2 = {"Primavera", "Estate", "Autunno", "Inverno"};
		// stagioni2[4] = "Ulteriore stagione che in realtà non esiste"; <-- ArrayIndexOutOfBoundsException

		System.out.println("************************************ METHODS *******************************************");
		int result = sum(4, 5);
		System.out.println(result);

		printSum(4, 5);


		System.out.println("************************************ SCANNER *******************************************");
		Scanner scanner = new Scanner(System.in); // Sto creando un oggetto di tipo Scanner, esso mi servirà per richiedere degli input all'utente

		System.out.println("Ciao dammi il tuo nome");
		String name = scanner.nextLine();

		System.out.println("Ciao, " + name + " ora dammi il primo numero intero");
		int num1 = Integer.parseInt(scanner.nextLine()); // Nonostante io stia cercando di leggere un numero intero, è consigliabile usare il nextLine
		// un po' dappertutto. int num1 = scanner.nextInt() è l'alternativa comoda per leggere direttamente interi però in situazioni più complesse
		// un mix di nextInt con nextLine, nextDouble,... può portare a problemi

		System.out.println("Ciao, " + name + " ora dammi il secondo numero intero");
		int num2 = Integer.parseInt(scanner.nextLine());

		System.out.println("La somma dei numeri inseriti è: " + sum(num1, num2));

		scanner.close(); // Anche se non servirebbe per programmi semplici come questo, sarebbe sempre bene chiudere lo scanner quando non lo si
		// utilizza più


	}

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

	public static void printSum(int num1, int num2) {
		System.out.println("La somma dei due numeri è: " + (sum(num1, num2)));
	}
}