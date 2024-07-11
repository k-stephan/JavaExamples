import java.util.Scanner;

public class removespace {

	public static void main(String[] args)
	{
		//method1() ;
		//method2() ;
		  method3() ;
	}
	
	public static  void method1() 
	{
		// Method1 
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter String:");
				String input=sc.nextLine();
				String withoutspaces=input.replaceAll("\\s+","");
				System.out.println(withoutspaces);
				//sc.close();
		
	}

	
	public static  void method2() 
	{
		// Method2 
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter String:");
				String input=sc.nextLine();
				String withoutspaces="";
				char [] str=input.toCharArray();
				for (int i=0;i<str.length;i++) 
				{
				
					if (str[i]!=' ') 
					{
						withoutspaces = withoutspaces + str[i];
					}
						
				}
				
				System.out.println("Input String : "+input);
		         
		        System.out.println("Input String Without Spaces : "+withoutspaces);
		         
		        //sc.close();
		
	}
	
	
	public static  void method3() 
	{
		// Method3--finding duplicate char
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter String:");
				String input=sc.nextLine();
				String withoutduplicate="";
				char [] str=input.toCharArray();
				for (int i=0;i<str.length;i++) 
				{
					System.out.println(str);
					for (int j=0;j<str.length;j++) 
					{
						System.out.println(withoutduplicate);
						if (str[j]==str[i]) 
						{
							System.out.println("First:"+str[i] + "Second:"+str[j]);
							withoutduplicate = withoutduplicate + str[j];

							System.out.println();
						}
					}
						
				}
				
				//System.out.println("Input String : "+input);
		         
		        //System.out.println("Input String Without Spaces : "+withoutduplicate);
		         
		       // sc.close();
		
	}
	
}

