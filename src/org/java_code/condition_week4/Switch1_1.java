package org.java_code.condition_week4;

public class Switch1_1 {

	public static void main(String[] args) {
		String fruit = "사과";
		
		switch(fruit) {
		case "사과": 
			System.out.println("맛나");
			break;				
		case "딸기": 
			System.out.println("맛나");
			break;
		case "귤": 
			System.out.println("보통");
			break;				
		case "오랜지": 
			System.out.println("보통");
			break;
		default :
			System.out.println("별로");
			
 // 값의 범위로 주어지는 경우는 switch를 쓰기 어려움 
//	카테고리는 오히려 switch가 쉬움
			
// 코드 줄이기
//			String fruit = "사과";
//			
//			switch(fruit) {
//			case "사과": 
//			case "딸기": 
//				System.out.println("맛나");
//				break;
//			case "귤": 
//			case "오랜지": 
//				System.out.println("보통");
//				break;
//			default :
//				System.out.println("별로");
		}
	}
}
