package homework;

//	9주차 단톡 2번 
//	상속 관계에 있는 상위클래스와 하위클래스를 구현하시오.
//	• 클래스 선택은 임의로 할 수 있음
//	• 상위클래스 1개와 하위클C래스 2개를 구현할 것
//	• 28-29페이지 코드와 같은 형태로 main 메서드까지 구현할 것


public class Chicken { 
	public double nearby; // 얼마 거리가 떨어져있는지 
	public String number; // 주문 전화번호  
	
//	메소드는 어디에서나 호출할 수 있도록
	public void taste() { //맛있나?
		System.out.println("JMT 맛없을 수가 없다.");
	}
	public void fried() { //프라이드치킨이 있나? 
		System.out.println("후라이드 치킨, 주문 가능합니다.");
	}
}

