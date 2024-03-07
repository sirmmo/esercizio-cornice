import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Inserire due numeri: ");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    for (int i=0; i<num1; i++) {
        for (int j=0; j<num2; j++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    }
}