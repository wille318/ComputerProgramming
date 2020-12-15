package finaltext;
import java.util.Scanner;

public class Human {
	Scanner sc = new Scanner(System.in);
	public Human() {
		String name = "noname";
		int age = 0;
		int weight = 0;
	}
	public Human(String string, int i, int j) {
		String name = string;
		int age = i;
		int weight = j;
	}
	
	private String name() {
		System.out.println("name : ");
		String name = sc.nextLine();
		return name;
	}
	private int age() {
		System.out.println("age : ");
		int age = sc.nextInt();
		return age;
		}
	private int weight() {
		System.out.println("weight : ");
		int weight = sc.nextInt();
		return weight;
	}
	public void show_info() {
		System.out.println("이름 : "+name() +  " 나이 : "+age() + "세 몸무게 : "+ weight()+"kg");

	}
	public String show_name() {
		return name();
	}
	
	public void gain_weight(int w) {
		int a = weight() ;
		a = a+w;
		System.out.println(name() + "의 몸무게가 "+a+"가 되었습니다. ");
		if (a>=100) {
			System.out.println("위험합니다.체중을 줄이세요.");
		}		
	}
	
	
	public static void main(String[] args) {
		Human h1 = new Human("홍길동", 20, 88); 
		Human h2 = new Human();
		h1.show_info();
		h2.show_info();
		h1.gain_weight(20);
	}

}
