package homework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections ;

public class Week6_Homework_갠톡2 {

	public static void main(String[] args) {
//		단어를 입력받아서 단어들 중 사전순으로 가장 빠른 단어를 출력하시오.
//		•“end”를 입력하면 끝남

		System.out.println("60190295 김예빈 ");
		System.out.println("-------------- ");

		Scanner sc = new Scanner(System.in);
//		int count = 0; // 몇개의 단어를 입력받았는지 세는 부분
		String add;
		ArrayList<String> list = new ArrayList<String>();
		
//		String[] dic = new String[count];
		
		while (true) {
			System.out.println("단어를 입력하세요 : ");
			add = sc.next();
			if (add.equals("end")) { break; } // end가 들어오면 멈춤
			list.add(add);
//			list.add(count, add);
			Collections.sort(list);
//			count += 1; // 단어가 하나씩 들어올 때다 배열의 크기가 1씩 증가하게 됨
			
		}
		System.out.println("가장 빠른 단어는 " + list.get(0));
	}
}
