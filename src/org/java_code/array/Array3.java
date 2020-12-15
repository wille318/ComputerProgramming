package org.java_code.array;

public class Array3 {

	public static void main(String[] args) {
		int a, b, c;
		a = 1;
		b = 1;
		
		int [] array = new int[30];
		
		for (int i=0; i < array.length; ++i) {
			if(i==0) {
				array[i] = a ;
			}
			else if (i==1) {
				array[i] = b ;
			}
			else {
				c = a + b ;
				array[i] = c;
				a = b;
				b = c;
			}
				System.out.print(array[i] + " "); 
		}
	}
}

// 교수님 풀이 
//	int[] array = new int[30];
//	array[0] = 1;
//	array[1] = 1;
//	
//	for (int i=2;i<array.length;++i)
//		array[i] = array[i-1] + array[i-2];
//	for (int i=0;i<30;i++)
//		System.out.print(array[i] + " "); 
