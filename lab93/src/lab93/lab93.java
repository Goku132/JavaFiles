package lab93;
import java.util.Scanner;


public class lab93 {
	public static void main(String args[]){
		
		String  s = "";
		Scanner aga = new Scanner(System.in);
		System.out.println("Enter a string");
		s = aga.nextLine();
		int y = s.length()-1;
		boolean same = true;
		
		for (int i = 0; i < s.length(); i++) {
		    if(s.charAt(i) != s.charAt(y)){
		    	same = false;
		    	
		    }
		    y--;
		}
		  if(same == true){
			System.out.println(s +" "+ "This is a palindrome");
		
		}
		else {
			System.out.println(s + "This is not a palindrome");
		}
		    
		}
		
}

