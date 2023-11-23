package interview;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String arg[])
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter length:");
		int len=scan.nextInt();
		
		System.out.println("enter the number1: ");
		int num1=scan.nextInt();
		
		System.out.println("enter the number2: ");
		int num2=scan.nextInt();
		int num3;
		
	    for(int i=1;i<=len;i++)
	    {
	    	System.out.println(num1);
	    	num3=num1+num2;
	    	num1=num2;
	    	num2=num3;
	    	
	    }
	}

}
