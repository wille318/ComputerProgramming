package org.java_code.method_week8;
import java.util.Scanner;
public class Method5 {

	public static int[] sort(int x, int y, int z) {
		int small, middle, big;
//		가장 큰 수 
		if (x>y && x>z) big =x;
		else if(y>z) big = y;
		else big = z;
		
//		가장 작은 수
		if(x>y && z>y) small = y;
		else if(x>z) small = z;
		else small = x;
		
//		중간 수 
		if((x>y && y>z) || (z>y &&y>x)) middle = y;
		else if((y>x && x>z) || (z>x &&x>y)) middle = x;
		else middle = x;
		
		int bms[] = {small, middle, big};
		return bms;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("서로 다른 세 수를 입력하세요. ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int s[]= sort(a,b,c);
		System.out.println(s[0]+" "+s[1]+ " "+ s[2]);
	}
}
