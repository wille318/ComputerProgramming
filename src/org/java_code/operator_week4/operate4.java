package org.java_code.operator_week4;

public class operate4 {
	public static void main(String[] args) {
		String a = "aaa";
		String b = a;
		String c = new String("aaa");
		
		System.out.println("a"+a);
		System.out.println("b"+b);
		System.out.println("c"+c);

		System.out.println(a == b);
		System.out.println(a == c); //값은 같으나 다른 주소에 저장되기 때
		System.out.println(a.equals(c)); // .equals()를 사용하면 같은 값만을 비


		
	}
}
