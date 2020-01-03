import java.util.Scanner;

public class poweroftwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the power :");
			int n=sc.nextInt();
			int power=1;
		 System.out.println("Powers of 2 that are less than 2^"+n);
		          for(int i=0;i<=n;i++)
		            {
		                System.out.println("2^"+i+" = " + power);
		                power = power * 2;
		                
		            }
		        }
		}
	}


