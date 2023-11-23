package interview;

import java.util.Scanner;

// given string conver into opposite case like upper to lower
public class toggleCase {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enetr string : ");
		String a=scan.nextLine();
		String b="";
		
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);  
			// find uppercase and convert to lower 
			if(Character.isUpperCase(ch)==true)   
			{
				b=b+Character.toLowerCase(ch);
			}
			// find lower and convert to uper
			else if(Character.isLowerCase(ch)==true)
				b=b+Character.toUpperCase(ch);
			// if comes some digit or number 
			else
				b=b+ch;
		}
		
		
	System.out.println(b);
		
	}

}
