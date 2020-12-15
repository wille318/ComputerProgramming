package org.java_code.array;

public class Array1_1 {
	public static void main(String[] args) {
		
//		배열 선언 방법 : 데이터 타입[] 배열명 = {데이터} 
		int [] array1 = {1,2,3,4}; //아래 for문으로 데이터 크기를 설정해 주지 않아도됨.
		
//		for (int i=0;i<4;++i) {
//			array1[i] = i+1;
//		}
		
			for (int i=0;i<4;++i) {
			System.out.println(array1[i]); 
		}
	}
}
