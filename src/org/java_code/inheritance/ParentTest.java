package org.java_code.inheritance;

class Parent {
	int data = 100;
	public void print() {
		System.out.println("부모 클래스");
	}
}
class Child extends Parent { 
	int data = 200;		
	public void print() {
		int data = 300;
		super.print();
		System.out.println("자식 클래스"); 
		System.out.println("data : "+data); //제일 가까운 data가 호출됨 
		System.out.println("this.data : "+this.data); 
		System.out.println("super.data : "+super.data);
	}
}
public class ParentTest {
	public static void main(String[] args) {
		new Child().print();
	}
} 
