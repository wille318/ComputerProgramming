package org.java_code.eclipse_week2;

public class DataType {

	public static void main(String[] args) {
		double a = 3.5, b=5.8;
		
		System.out.println("합은"+ (a+b));
		System.out.println("차는 " + (a-b));
		System.out.println("곱은"+ (a*b));
		System.out.println("나눈 몫은"+ (a/b));

/*		이렇게 했더니 에러남. () 수식은 앞에서부터 계산되므로 괄호로 잘 정의 해주어야.
		System.out.println("합은"+ a+b);
		System.out.println("차는 " + a-b);
		System.out.println("곱은"+ a*b);
		System.out.println("나눈 몫은"+ a/b);
*/
		
	}

}
