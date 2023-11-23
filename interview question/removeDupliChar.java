package interview;

public class removeDupliChar {

	public static void main(String[] args) {
		String a="aravindaraf";
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			char currentchar=a.charAt(i);
			boolean isunique=true;
			for(int j=0;j<i;j++)
			{
				if(currentchar==a.charAt(j))
				{
					isunique=false;
					break;
				}
			}
			if(isunique)
			{
				System.out.println(currentchar);
				count++;
			}
		}
		System.out.println(count);

	}

}
