import java.util.Random;

public class random {
	
	public static void main (String args[]) {
		String nam = new  String ("This is a String");
		int num = 34;
		int store = 0;
		
		Random ran =  new Random();
		for (int i = 1 ; i <= 10; i++){
			store = ran.nextInt(101-1)+1;
			System.out.println(store + " " + one(store));
			//System.out.println(one(store));
		}
			//System.out.println(ran.nextInt());		
	}
	
	
	//<access specifier> <return type> <name> (<type> <name>){}
	public static int add(int a, int b)
	{
		int c = a+b;
		return c;
	}
	
	public static float dou(float a, float b)
	{
		
		return a+b;
	}
	
	public static int one(int a){
	int count = 0;	
	while (a!=1) {	
		if (a % 2 == 0) {
			a = a/2;
		}
		else{
			a = a*3+ 1 ;
		}
		count++;
		
	}
	return count;
	}	
}