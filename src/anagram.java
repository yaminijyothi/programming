import java.util.Scanner;
public class anagram {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string1:");
		String str1=sc.nextLine();
		System.out.println("enter string2:");
		String str2=sc.nextLine();
		int l1=str1.length();
		int l2=str2.length();
		int i,j,found=0,not_found=0,len;
		if(l1==l2)
		{
			len=l1;
			for(i=0;i<len;i++)
			{
				found=0;
				for (j=0;j<len;j++)
				{
					if(str1.charAt(i)==str2.charAt(j))
					{
						  found = 1;
                          break;
					}
                }
            }
            if(found == 0)
            {
                not_found = 1;
                break;
            }
		
		if(not_found == 1)
        {
            System.out.print("Strings are not Anagram to Each Other..!!");
        }
        else
        {
            System.out.print("Strings are Anagram");
        }
		}
		
    else
      {
        System.out.print("Both Strings Must have the same number of Character to be an Anagram");
      }
	
	}
}


        				