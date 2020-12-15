package org.java_code.inheritance;

public class Human {
	int age;
	void breath() {
		System.out.println("휴");	
	}
	public Human() { //생성자 + 인자값이 없으므로 기본생성자임. 
		age =1;
	}
	public int Show_age() {
		return this.age;
	}
	public Human(int age) {
		this.age=age;
	}
	public static void main (String[] args) {
		Human h= new Human();
		h.age=1; //이렇게 해주면 값을 넣어 초기화 시켜주지 않아도됨 
		Human h2 = new Human(20);
	}


}
