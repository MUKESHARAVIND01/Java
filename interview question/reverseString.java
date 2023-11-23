package interview;
import java.util.Scanner;
public class reverseString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enetr string : ");
		String a=scan.nextLine();
		String b="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println("reverse string value: "+b);
		
		if(a.equals(b))
		{
			System.out.println(a + " is plaindrome");
		}
		else
			System.out.println(a + " is not a plaindrome");

	}

}
