package homework;

public class Week3_Homework_re {

	public static void main(String[] args) {
//		정수형 변수에 0부터 9사이의 임의의 수를 할당하고 싶다. 
//		정수형 변수 a를 선언하고 Math.random() 함수와 형변환을 활용하여 a에 0부터 9 사이의 값이 할당되도록 해보자.
//		(힌트: 0부터 1미만의 수가 0부터 10미만의 수가 되려면 곱하기 10을 주면 될 터)
		System.out.println("60190295 김예빈 ");
		System.out.println("-------------- ");
		System.out.println(" 3주차 과제 (개인톡)_RE ");
		
//		제출했던 과제 
//		double b = Math.random();  --> 정수형 변수가 아닌 실수형 변수. double 이 아닌 int로 선언해주어야함. 
//		System.out.println(b); 

		int b = (int)(Math.random()*10);  
		// Math.random()은 실수형이므로 앞에 (int)를 붙여 형을 바꾸어주어야함(명시형 변환). + 괄호를 안써주면 0만 주구장창나옴.
		System.out.println(b);

	}

}
