package test;
import java.util.Scanner;
public class test {
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String [] [] name = new String [4][3];
		for (int i = 0; i < name.length; i++){
			System.out.println("Please enter a names");
			name[i][0] = scan.nextLine();
			System.out.println("Please enter a age");
			name[i][1] = scan.nextLine();
			System.out.println("Please enter an adress");
			name[i][2] = scan.nextLine();
		}
		for (int i = 0; i < name.length;i++){
			System.out.println("The name is " + name[i][0] + " they are " + name[i][1] + " old " + "They are from " + name[i][2] );
		}
		//System.out.println(name);
		
	}

}