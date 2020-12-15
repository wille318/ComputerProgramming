package org.java_code.array;

public class Array1 {

	public static void main(String[] args) {
		
//		배열 선언 방법 : 데이터 타입[] 배열명 = new 데이터 타입[배열 크기] 
		int [] array1  = new int[4];
		
//		array1[0] = 1 ;
//		array1[1] = 2 ;
//		array1[2] = 3 ;
//		array1[3] = 4 ;
		
//		윗문장 깔끔하게 for문으로  
		for (int i=0;i<4;++i) {
			array1[i] = i+1;
		}
		
//		System.out.println(array1[0]);
//		System.out.println(array1[1]);
//		System.out.println(array1[2]);
//		System.out.println(array1[3]);
		
//		윗문장 깔끔하게 for문으로  
		for (int i=0;i<4;++i) {
			System.out.println(array1[i]); 
		}

	}

}
