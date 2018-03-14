import java.text.NumberFormat;
import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		NumberFormat commas = NumberFormat.getNumberInstance();

		System.out.println("Welcome to the Factorial Calculator App!  \n");
		System.out.print("Please enter an integer between 1 and 10:  ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long fact = 1;
		for( int i=0  ; i <= num ; i++)
		{
			fact*= (i + 1);
		}
		System.out.println("\n The factorial of " + num + " is " + commas.format(fact));

		sc.close();
		System.out.println("K Bye.");
	}

}
