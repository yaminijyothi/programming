import java.util.Scanner;
public class sumofthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter size of the array");
         int n=sc.nextInt();
         int i,j,k,count=0;
         System.out.println("enter  the "+n+ "elements");
         int a[]=new int[n];
         for(i=0;i<n;i++)
         {
        	 a[i]=sc.nextInt();
         }
         for( i=0;i<n;i++)
         {
            for(j=i+1;j<n;j++)
            {
            	for(k=0;k<n;k++)
            	{
            		if(a[i]+a[j]+a[k]==0)
            			count++;
            	}
            	System.out.println(a[i]+""+a[j]+""+a[k]);
            }
         }
         System.out.println("triplets:"+count);
	}
}