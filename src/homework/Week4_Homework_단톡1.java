package homework;

//	#1.
//	난수를 만들어 0이상 100 미만의 정수로 바꾼 뒤 90 이상이면 A, 80 이상이면 B, 70 이상이면 C, 70 미만이면 F를 출력하시오.

public class Week4_Homework_단톡1 {

	public static void main(String[] args) {
		System.out.println("60190295 김예빈 ");
		System.out.println("-------------- ");
		
		
		int a = (int)(Math.random()*100)+1;
		System.out.println(a);
		
		if (a >= 90) {
			System.out.println("A");
		}
		else if(a >= 80){
			System.out.println("B");

		}
		else if(a >= 70){
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}

	}
}
