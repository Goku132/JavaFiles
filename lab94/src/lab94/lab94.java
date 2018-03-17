package lab94;
import java.util.Random;

public class lab94 {
	public static void main(String args[]){
		int[] array = new int[10];
		
		for(int i = 0; i < array.length; i++){
				array[i] = ((int) (Math.random()*1000)+1);
				System.out.println(array[i]);
			
		}
		int avg = (array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9])/10;
		System.out.println(avg);
		
	}
	

}
