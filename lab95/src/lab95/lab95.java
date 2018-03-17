package lab95;
import java.util.Scanner;
//import;

public class lab95 {
	
	public static void main(String args[]){
		
		System.out.println("Enter a integer for the number of elements in the Array");
		Scanner aga = new Scanner(System.in);
		int s = aga.nextInt();
		double[] array = new double [s];
		
		for(int i = 0 ; i < array.length;i++){  //imputs for array
			System.out.println("Please enter a double");
			//Scanner agga = new Scanner(System.in);
			double ga = aga.nextDouble();
			array[i] = ga;
		}
		//end of first for loop	
		
		
		double highest = 0; //setting array to the higest and lowest
		double lowest = 10000;
		for(int i=0; i < array.length; i++)
		{
		
			if (array[i] > highest){
				highest = array[i];
			   }
			if(array[i] < lowest){
				lowest = array[i];
			  }

		}  //end of loop for higest and lowest.
		
		System.out.println("Highest number is: " +highest);
		System.out.println("Lowest number is: " +lowest);  
		
		
		}//end main 
	
} // end class

