import java.util.Scanner;
public class insertname {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur name:");
		String str=sc.nextLine();
		int l=str.length();
		if(l<3)
		{
			System.out.println("ur name must be minimum 3 characters");
			
		}
		else
			System.out.println("Hello "+str+" ,how are you?");
	
		
	}

}
