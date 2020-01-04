import java.util.Scanner;
public class palindrome {

	 static boolean isPalindrome(String str)
	 {
       
       int l=str.length();
       int i=0,j=l-1;
       
       	 while (i < j) { 
		   if (str.charAt(i) != str.charAt(j)) 
            return false; 

        // Increment first pointer and 
        // decrement the other 
        i++; 
        j--; 
    } 

    // Given string is a palindrome 
    return true; 
} 

//main
public static void main(String[] args) 
{ 
	Scanner sc=new Scanner(System.in);
    System.out.println("enter a String:");
    String str=sc.nextLine();
    
    if (isPalindrome(str)) 
        System.out.print("Yes"); 
    else
        System.out.print("No"); 
} 

}
