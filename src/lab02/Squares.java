package lab02;
import java.util.Scanner;
public class Squares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);	
		
	int num = 0;
	int result = 0;
	int count = 0;
	
	
	for (count = 0; count < 5; count++)
		
		System.out.println("Please Enter a Number: ");
		num = sc.nextInt();
	

		if (num < 46341) {
			result = num * num;
			System.out.println("The resulting square root is: " + result);
		}
		else {
			System.err.println("Your number is to large");
		}
				
		sc.close();
		
		
	}

}
