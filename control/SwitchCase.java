package control;
import java.util.Scanner;
public class SwitchCase {
	public static void main(String arg[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=scan.nextInt();
		switch(number)
		{
		case 1:
			System.out.println("one");
		    break;
		   
		case 2:
			System.out.println("two");
		    break;
		    	
		case 3:
			System.out.println("three");
		    break;
		    
		 default:
			 System.out.println("its also numbers");
		    	
		    
	
			
			
		}
	}

}
