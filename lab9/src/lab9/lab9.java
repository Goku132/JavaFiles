package lab9;
import java.util.Scanner;

public class lab9 {
	public static void main(String args[]){ 

	String  s = "";
	Scanner aga = new Scanner(System.in);
	System.out.println("Enter a string");
	s = aga.nextLine();
	
	for (int i = 0; i < s.length(); i++) {
	    System.out.println(s.charAt(i));
	}
	
	
}
}
