import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Inserire due numeri: ");
    int num1 = in.nextInt(); // lettura primo intero
    int num2 = in.nextInt(); // lettura secondo intero
    for (int i=0; i<num1; i++) { // ciclo che definisce le righe (a partire dal primo intero)
        for (int j=0; j<num2; j++) { // ciclo che definisce le colonne (a partire dal secondo intero)
            System.out.print("*"); // stampa di asterisco
        }
        System.out.println(""); // stampa dell simbolo di a capo alla fine della riga
    }

    }
}
