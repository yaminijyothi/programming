 import java.util.Scanner;
 class primefactor
 {
	 public static void primefactor(int n)
	 {
		 
    while (n%2==0) 
    { 
        System.out.print(2 + " "); 
        n =n/2; 
    } 
    for (int i = 3; i <= Math.sqrt(n); i=i+2) 
    { 
        while(n%i==0) 
        { 
            System.out.print(i + " "); 
            n=n/i; 
        } 
    } 
    if (n>2) 
        System.out.print(n); 
} 

public static void main (String[] args) 
{ 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number:");
    int n=sc.nextInt();
    primefactor(n);
} 
} 
			
		



	