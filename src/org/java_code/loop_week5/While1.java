package org.java_code.loop_week5;

public class While1 {

	public static void main(String[] args) {
		int i =0;
//		while(i<1000) {
//			i++; //1개씩 증가시켜 999개 프린
//			System.out.println("Hello");
//		}
		
		while( i<100) {
			System.out.println("Hell "+i);
			i++; //0부터99까지, i++은 종료 조건임. 쓰지 않는 다면 무한 루프에 빠짐  
		}
		
//		while(i<=100) {
//			System.out.println("Hell "+i);
//			++i; //1부터100까지 
//		}
	}

}
