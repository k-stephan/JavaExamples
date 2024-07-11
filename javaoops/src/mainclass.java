
public class mainclass
{
	

	public static void main(String[] args) 
	{
		methods  m=new methods();
		m.m1();
		m.m2("Steve");
		m.m3("STEFF");
		
		
		String ss = m.m4();
		System.out.println(ss);
		
		//polymorphism Tests
		
		m.poly1();
		m.poly1(125,250);
		m.poly1(1, 2, 3);
		m.poly1(11,22, "SUM");
		m.poly1(13, "ADD", 12);
		
		//encapsulation Tests
		
		encapsulationtest en= new encapsulationtest();
		en.setX(45);
		en.setY(55);
		System.out.println("Get X value:" +en.getX());
		en.add();
		en.name();

		
	}

}
