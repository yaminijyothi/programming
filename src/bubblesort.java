
public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {50,40,30,20,10},i,j,temp,n=5;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(a[i]>a[j+1])
				{
					temp=a[i];
					a[i]=a[j+1];
					a[j+1]=temp;
	  
		     	}
	     	}
		}
		for(i=0;i<n;i++)
			System.out.println(a[i]);

	}

}
