package lab02;
import java.util.Scanner;
public class FormatOutSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Takes keyboard input and labels the keyboard variable as sc
	Scanner sc = new Scanner(System.in);	
		
	int num = 0;
	int result = 0;
	int count = 0;
	
//count starts at zero, as long as it is less than 5 add 1 to the current int value of count
	for (count = 4; count < 5; count++)
		
		System.out.println("Please Enter a Number: \n\t(less than 46341)");
		num = sc.nextInt();
	
//if the value of the user input int value in num is less than 46431 than do this arthimetic else the number is to large for 
//an int variable
		if (num < 46341) {
			result = num * num;
			System.out.println("The resulting square root is: \t\t" + result);
		}
		else {
			System.err.println("Your number is to large");
		}
				
		sc.close();
		
		
	}

}
