package org.java_code.loop_week5;

public class for9_week6 {

	public static void main(String[] args) {
		for(int i=0; i<5;++i) { //행 
			for(int j=i; j<5; ++j) { //열 
				System.out.print(j+1); //열이 바뀔 때마다 달라지는 값 -> j와 연관 
			}
			System.out.println("\n");
		}
	}

}
