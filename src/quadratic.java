import java.util.Scanner;
public class quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a:");
		float a=sc.nextInt();
		System.out.println("enter the value of b:");
		float b=sc.nextInt();
		System.out.println("enter the value of c:");
		float c=sc.nextInt();
		float root1,root2;
		float result;
		result=b*b-4*a*c;
		if(result>0)
		{
			root1=(float)(-b+(Math.sqrt(result)))/(2*a);
			root2=(float)(-b-(Math.sqrt(result)))/(2*a);
			System.out.println("root1="+root1+",root2="+root2);
		}
			else if(result== 0) {
	            root1 = root2 = -b / (2 * a);
	            System.out.format("root1 = root2 = %.2f;", root1);
	        }
	        // If roots are not real
	        else {
	            double realPart = -b / (2 *a);
	            double imaginaryPart = Math.sqrt(-result) / (2 * a);
	            System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
	        }
	    
}
}
			
		