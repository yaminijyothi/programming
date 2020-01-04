import java.util.Scanner;
public class windchill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			        Scanner sc= new Scanner(System.in);			
			        double windchill,windspeed,temp;
			        System.out.println("Enter the wind speed: ");
			          windspeed = sc.nextDouble();
		            
		            System.out.println("Enter the temperature(fahrenheit):");
			          temp= sc.nextDouble();	
			          if(temp>50)
			        	  
			          {
			        	  System.out.println("the formula is not valid if temoperature greater than 50");
			        	  return;
			          }
			          
			        windchill = 35.74 + 0.6215*temp + (0.4275 * temp-35.75) * Math.pow(windSpeed,0.16);
			        
			          System.out.println("the windchill is: " +windchill);
			        
			    }
		
			}

		      