package org.java_code.array;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		String arSubject[] = {"국어","영어", "수학", "과학"};
		int score[] = {100, 80, 90, 95};

		Scanner scn = new Scanner(System.in); 
		String name ;
		
		while (true) {
			System.out.print("과목을 입력하세요. : "); 
			name = scn.nextLine(); 
			
			for(int i=0; i < arSubject.length ; ++i){
				if (arSubject[i].equals(name)) 
					System.out.println(arSubject[i] + "의 점수는 " + score[i] +"입니다.");	
				}
			if (name.equals("그만")) break ;	
		}
	}
}
