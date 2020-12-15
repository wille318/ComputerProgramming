package org.java_code.loop_week5;

public class For10_week6 {

	public static void main(String[] args) {

		for(int i=0; i<5; ++i) {
			for(int j=0;j<5;++j) {
				if(i<=j) { //일단 i=j로 놓고 계산 후, 식 바꾸면 가능 
					System.out.print(" * ");
				}
				else{
					System.out.print("   ");
				}
			} 
			System.out.println(); //줄바꾸기 
		}
	}

}
