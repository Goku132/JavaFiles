package problem12;


public class Problem12 {
	private static int result;
	
	public static void main(String[] args){
		int counter = 0; 
		for(int i = 1; counter <= 500; i++ ){
			if( i % 2 == 0){
				counter = count(i / 2) * count(i + 1);
			}
			else{
				counter = count(i) * count((i+1)/2);
			}
			if(counter > 500){
				result = i;
			}
				
		}
		System.out.println(result*(result + 1)/2);
	}
	public static int count(int n){
		int result = 0; 
		for(int i = 1; i * i <= n; i++){
			if(n % i == 0){
				result += 2; 
				if(n /i == i)
					result --;
			}
		}
		return result;
	}
}