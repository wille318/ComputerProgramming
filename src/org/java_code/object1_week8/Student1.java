package org.java_code.object1_week8;

public class Student1 {

	String name, student_no;
	int credits;
	
	void register() {
		this.credits += 3;
		if (this.credits <= 18) System.out.println("수강신청 완료");
		else {
			credits -= 3;
			System.out.println("학점 초과");
		}
	}
	void withdraw() {
		this.credits -= 3;
		if(this.credits>0) System.out.println("수강철회 완료");
		else {
			credits +=3;
			System.out.println("철회할 과목 없음");
		}
	}
	
	void show_info() {
		System.out.println(this.name+" "+this.student_no);
		System.out.println(this.credits+"학점 신청 중");
	}
	
	public Student1(String name, String no) {
		this.name =name;
		this.student_no = no;
	}
	public static void main(String[] args) {
		Student1 s = new Student1("Lee", "60190295");
//		s.name = "Lee";
//		s.student_no = "601903232";
		s.register();
		s.show_info();
		s.register();
		s.show_info();
		s.register();
		s.show_info();
		s.register();
		s.show_info();
		s.register();
		s.show_info();
		s.register();
		s.show_info();
		
	}

}
