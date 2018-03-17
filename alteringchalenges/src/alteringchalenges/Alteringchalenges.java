package alteringchalenges;
import java.util.Scanner;
public class Alteringchalenges {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int count = 0 ; count < a; count++){
			char[] characters = sc.next().toCharArray();
			int altercount = 0;
			for(int i = 0; i < characters.length-1;i++){
				if(characters[i]==characters[i+1]){
					altercount++;
				}
			}
			System.out.println(altercount);
		}
		sc.close();
	}
}
