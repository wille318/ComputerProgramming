package homework;

public class Week2_Homework {

	public static void main(String[] args) {
		// 학번 이
		System.out.println("60190295 김예빈");
		System.out.println("------------------");
		
		// 숫자 제곱 : Math.pow(밑, 지수)
		double a=2, b=3, c=4, x=5, y;
		
		y = a * (Math.pow(x, 2)) + b * x + c;  
		//(Math.pow(밑, 지수)) = 제곱함
		// 자바에서는 5^2같은 식이 통하지 않
		
		System.out.println("y 값은 " + y);
		
//		[ 교수님 풀이 ] 
//		int a=2, b=3, c=4;
//		int x=5, y;
//		y=a*x*x+b*x+c;
//		System.out.println("y 값은 " + y);

		
	}

}
