package org.java_code.array;

public class Array4 {

	public static void main(String[] args) {
//		2차원 배열 : 데이터 타입[][] 배열명 = new 데이터 타입[행 크기][열 크기]
		
//		int [][] array2 = new int[3][4]; //3행 4열의 배열 
//		array2[0][0] = 1;
//		....
		
//		혹은 
		
		int [][] array2 = {{1,2,3,4}, {2,4,6,8},{3,6,9,12}};
		
		for(int i=0; i<3; ++i) {
			for(int j=0;j<4;++j) {
				System.out.print(array2[i][j]);
			}
		System.out.println();
		}
		
		System.out.println("--------------------------");
//		배열을 배정하지 않고, 넣기 
		int [][] array3 = new int[3][4]; 
		for(int m=0; m<3; ++m) {
			for(int n=0; n<4;++n) {
				array3[m][n] = (n+1)*(m+1);


				System.out.print(array3[m][n]);
			}
		System.out.println();
		}
	}

}
