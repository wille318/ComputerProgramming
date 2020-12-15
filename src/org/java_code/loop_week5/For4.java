package org.java_code.loop_week5;

public class For4 {

	public static void main(String[] args) {
		for(int i = 0;i<10; ++i) {
			if(i == 4) break;
			System.out.println(i);
		}
		
		for(int i = 0;i<10; ++i) {
			if(i == 4) continue; //i=4인 상태로 for문을 시행하라 (4는 i에 끼지 못)
			System.out.println(i);
		}
	}

}
