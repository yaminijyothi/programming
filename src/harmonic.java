import java.util.Scanner;
public class harmonic {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	float n=sc.nextInt();
	float sum=0;
	for(int i=1;i<=n;i++)
	{
		sum=sum+(float)1/i;
	     if(i==1)
	    	 System.out.print("1+");
	     else if(i==n)
	    	 System.out.print("1/"+i);
	    	 else
	    		 System.out.print("1/"+i+"+");
	}
	System.out.println("="+sum);
	}
}

