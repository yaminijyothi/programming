import java.util.Scanner;
public class tosscoin {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number how many times toss:");
		int n=sc.nextInt();

			int Count = 1;

			double result;

			while(Count <n)

			{

			result = Math.random();

			if(result <= .5)

			System.out.println("it is heads.");

			else

			System.out.println("it is tails.");

		  Count++;

			}

			 

			}

			}

			 