package oops;

public class overloading {
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}

	public static void main(String[] args) {
		overloading o=new overloading();
		o.add(2,2);
		o.add(2,2,0);
	}

}
