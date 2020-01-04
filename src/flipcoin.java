import java.util.Scanner;
public class flipcoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
				flipcoin test = new flipcoin();
				int choice;	   
				System.out.println("Welcome to the coin flip game!");

				do
				{
					System.out.println("Enter '1' to Flip Coin OR Enter '0' to Quit: ");
					
					choice = sc.inputInteger();

					if (choice == 1)
					{
						flipcoin();
					}
					else if (choice > 1)
					{
						System.out.println("Invalid entry - please enter 1 or 0: ");
						choice = sc.inputInteger();
					}
				}
			while (choice != 0);
			}
		}

