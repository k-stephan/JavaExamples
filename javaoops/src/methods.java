public class methods 
{
	 String firstname="MARS";
	 String lastname="k";
	 int age=24;
	 int x=100;
	 int y=250;
	
	void m1()
	{
		System.out.println("No Params & no Return");
	}
	

	void m2(String s)
	{
		System.out.println("Accept Params & no Return: Params Value=" + s);
	}
	
	String m3(String s)
		{
			System.out.println("Accept Params & Return: Params & Return Value=" + s);
			return s ;
		}
		
	String m4()
	{
		System.out.println("NO Params & Return: NO Params & Return Value");
		return firstname    ;
	}
	
	//polymorphism
	
	void poly1()
	{
		System.out.println(x+y);
	}
	
	void poly1(int x, int y )
	{
		System.out.println(x+y);
	}
	
	void poly1(int x, int y, int z )
	{
		System.out.println(x+y+z);
	}
	
	void poly1(int x, int y, String z )
	{
		System.out.println(z+"="+(x+y));
	}
	
	void poly1(int x, String z, int y )
	{
		System.out.println(z+"="+(x+y));
	}
	
}
