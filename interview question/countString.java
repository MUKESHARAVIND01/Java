package interview;

public class countString {

	public static void main(String[] args) {
		String a="Mueksh aravind";
		int vowel=0,con=0,space=0;
		
		//a=a.toLowerCase().replaceAll(" ","");    // remove space 
		a=a.toLowerCase();
		System.out.println(a);
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(Character.isLetter(ch)==true)
			{
				if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o'||ch=='u')
				{
					vowel++;
			
				}
				else 
					con++;
			}
			if(Character.isWhitespace(ch)==true)   // same as "isDigit()' have in java
			{
				space++;
			}
			
			
			
		}
		System.out.println("vowels are: "+vowel);
		System.out.println("const are: "+con);
		System.out.println("space are: "+space);
	}

}
