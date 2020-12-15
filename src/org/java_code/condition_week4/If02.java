package org.java_code.condition_week4;

public class If02 {
	public static void main(String[] args) {
//	난수를 만들어 0이상 100 미만의 정수로 바꾼 뒤 70 이상이 면 상 40 이상이면 중 40 미만이면 하를 출력하시오.
		int n = (int)(Math.random()*100);
		System.out.println(n);

		if(n>=70){
			System.out.println("상");
		}
		else if(n>=40){
			System.out.println("중");
		}		
		else{
			System.out.println("하");
		}
		
		
	}
}
