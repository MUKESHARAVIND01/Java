package interview;
import java.util.Scanner;
public class SearchString {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  System.out.println("enter the String");
		  String input=scan.nextLine();
		  
		  System.out.println("enter the search charcter");
		  String searchStr=scan.next();
		  
		  boolean isfoundChar=false;
		  
		  for(int i=0;i<input.length();i++)
		  {
			  boolean match=true;
			  for(int j=0;j<searchStr.length();j++)
			  {
				  if(input.charAt(i+j)!=searchStr.charAt(j))
				  {
					  match=false;
					  break;
				  }
				  
			  }
			  if(match)
			  {
				  isfoundChar=true;
				  break;
			  }
		  }
		  System.out.println(isfoundChar);
		  
		  
		  
	}
}