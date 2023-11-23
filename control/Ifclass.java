package control;
// check  number is even or odd
import java.util.Scanner;
public class Ifclass {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
			int number = scan.nextInt();
			if (number % 2 == 0) {
				//  if-condition is true then this block will get executed 
				System.out.println(number + " is an even number");
			} else {
				// if-condition is false then this block will get executed 
				System.out.println(number + " is an odd number");
			}
		}
	
}
