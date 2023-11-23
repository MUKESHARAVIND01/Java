package interview;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num");
		int num=scan.nextInt();
		
	    int rev=0,temp=num,rem=0;
	    
	    while(temp>0)
	    {
	    	rem=temp%10;
	    	rev=(rev*10)+rem;
	    	temp/=10;
	    }
	    
	    System.out.println("reverse number is: "+rev);
	    if(num==rev)
	    {
	    	System.out.println(num +" is palindrome");
	    }
	    else
	    	System.out.println(num +" is not a palindrome");
	}

}
