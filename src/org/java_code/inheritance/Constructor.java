package org.java_code.inheritance;

class Person { 
	int age;
	String name;

	public String personInfo() {
		return "이름 : " + name + ", 나이 : "+ age; 
		}
}
public class Constructor{
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.personInfo()); 
	}
}