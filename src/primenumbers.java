
public class primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lwr=1,upr=1000,i,count=0;
				for(lwr=1;lwr<=upr;lwr++)
				{
					for(i=1;i<=lwr;i++)
					{
						if(lwr%i==0)
							++count;
					}
				
				if(count==2)
					System.out.println(lwr);
				}

	}

}
