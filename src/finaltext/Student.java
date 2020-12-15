package finaltext;

public class Student extends Human{
	public Student() {
		String name = "noname";
		int age = 0;
		int weight = 0;
		String std_no="60200000";
	}
	
	private String std_no() {
		System.out.println("name : ");
		String name = sc.nextLine();
		return name;
	}
	public void int study(int h) {
		System.out.println(name+"님이 "+ h +"시간동안 공부했습니다.";)
		
	}
	public static void main(String[] args) {
		Student s1 = new Student(“홍길동”, 20, 88, “60191234”); Student s2 = new Student();
		s1.show_info();
		s2.show_info();
		s1.study(3);
	}

}
