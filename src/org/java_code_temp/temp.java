package org.java_code_temp;

public class temp {
	static void test() {
		int i = 0; //i값이 지역 변수로 선언되어 아래의 i에 영향을 미치지 않음.  
	}
	
	
	public static void main(String[] args) {
		for (int i=0;i<10; ++i) {
			test();
			System.out.println(i);
		}
	}
//	#############################################################
	
//	staitc int i = 100;
//	
//	static void test() {
//		 i = 0;  
//	}	
//	public static void main(String[] args) {
//		for (int i=0;i<10; ++i) {
//			test();
//			System.out.println(i);
//		}
//	} //결과 0 : 전역변수로 i가 선언됨. i = 100 -> 0 -> 0
	
//	#############################################################
	
//	staitc int i = 100;
//	
//	static void test() {
//		int i = 0;  // 새로 i를 선언하여, 지역변수로써 사용됨 
//	}	
//	public static void main(String[] args) {
//		for (int i=0;i<10; ++i) {
//			test();
//			System.out.println(i);
//		}
//	} //결과 100 : 전역변수보다 지역변수가 우선적으로 적용됨. 

}
