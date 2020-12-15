package homework;

import java.util.Scanner;

public class Week5_Homework_보너스개인톡 {

	public static void main(String[] args) {
//		두 수를 입력받아서 최소공배수와 최대공약수를 구하시오.
//		두 수를 입력하시오: 30 20 최소공배수: 60 최대공약수: 10
		
		Scanner scn = new Scanner(System.in); 
		int num1, num2, max=0, min=0, i=2; 
		System.out.print("두 수 입력하시오. : "); 
		num1 = scn.nextInt(); 
		num2 = scn.nextInt(); 
		
		while(i<=num1 && i<=num2){  //두 수가 2보다 클때, (1이면 최대공약수가 1임)
			if(num1%i==0 && num2%i==0) min=i; i++;  
			}
//		첫번째 while()안에 문장 해석 : 2에서 시작해서 num1, num2 중 작은 수 전까지 i는 커질꺼다~
//		if문 : 만약 두 수가 2로 나누어 떨어지면~으로 시작
//		2가 나눠떨어지네? 다음은 i++ 해가면서 3, 4, 5 .... 
//		break같은게 없으니까 num1 또는 num2중 작은 값까지 진행(while()조건 때문)
//		결국 마지막에 남는 min 값은 num1, num2 중 작은값보다 같거나 작은, 둘다 나누어떨어지는 값. 즉,최대공약수
	
		max=num1*num2/min; //최소 공배수 구하는 식 (AB=LG)
		
		System.out.println("최소공배수 : "+max); 
		System.out.println("최대공약수 : "+min); 

		
	}

}
