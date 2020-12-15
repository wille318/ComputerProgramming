package org.java_code.inheritance;

public class Student extends Human {
	String name ;
	String std_no;
	
	void study() {
		System.out.println("열공");
	
	}
	
	public Student() {
		super(); // 부모 클래스의 호출이 필요하다면 가장 먼저 불러내야함. 
		this.name = "noname";
	}
	
	public Student(int age, String name, String std_no) {
		super.age = age;
		this.name = name;
		this.std_no = std_no;
	}
	
	public Student(String std_no) {
		this();
		this.std_no = std_no;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(24, "Park", "60202134");
		Student s3 = new Student("60202134");

	}

}
