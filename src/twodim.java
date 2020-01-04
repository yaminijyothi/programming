import java.util.Scanner;
public class twodim 
{
   public static void main(String args[])
   {
	   // initialize here.
       int m,n,i,j;
       int arr[][] = new int[10][10];
       Scanner sc = new Scanner(System.in);
	   
       // enter row and column for array.
       System.out.print("enter size of row[10] : ");
         m = sc.nextInt();
       System.out.print("Enter size of column[10) : ");
       n = sc.nextInt();
	   
       // enter array elements.
       System.out.println("Enter " +(m*n)+ " Array Elements : ");
       for(i=0; i<m; i++)
       {
           for(j=0; j<n; j++)
           {
               arr[i][j] = sc.nextInt();
           }
       }
	   
       //  2D array 
       System.out.print("The Array is :\n");
       for(i=0; i<m; i++)
       {
           for(j=0; j<n; j++)
           {
               System.out.print(arr[i][j]+ "  ");
           }
           System.out.println();
       }
   }
}
