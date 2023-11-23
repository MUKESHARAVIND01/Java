package oops;


class dhoni
{
	public void play()
	{
		System.out.println("he is cricket an indian cricket player");
	
	}
}
class field extends dhoni
{
	public void play()
	{
		System.out.println("he plays wicketkeper");
	}
}
class batting extends dhoni
{
	public void play()
	{
		System.out.println("he plays finisher role");
	}
}
public class polymorphism {

	public static void main(String[] args) {
		
		dhoni d;
		d=new field();
		d.play();
		d=new batting();
		d.play();
		d=new dhoni();
		d.play();
		
		
		
		

	}

}
