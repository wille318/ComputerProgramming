package middle_test;

public class no4 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*9+1) ; 
		int b = (int)(Math.random()*9+1) ; 
		int c = (int)(Math.random()*9+1) ; 
		int min =0;
		int max = 0 ;
		int i =2 ;
		while(i<=a && i<=b && i<=c){  //두 수가 2보다 클때, (1이면 최대공약수가 1임)
			if(a%i==0 && b%i==0&& c%i==0) min=i; i++;  
			}
//		System.out.println(a); 
//		System.out.println(b); 
//		System.out.println(c); 
//		
		max=a*b*c/min;
		
		System.out.println(max); 

	}

}
