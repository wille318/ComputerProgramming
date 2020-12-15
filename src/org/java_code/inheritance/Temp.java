package org.java_code.inheritance;

public class Temp {
	int a;
	Temp(){
		a = 5;
	}
	int func(int a) { 
		return a; //this.a로 넣으면 5가 나옴. this는 전체 class에 있는 맴버변수를 호출함. 
	}
	
	public static void main(String[] args) {
		Temp t = new Temp();
		System.out.println(t.func(3)); //맴버변수 a와 func 변수 a가 같아 어떤 부분이 프린트되는지 확실하지 않음. 
		System.out.println(t.a); //func 변수 안의 a
	}

}
