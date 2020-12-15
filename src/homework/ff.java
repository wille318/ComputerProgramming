package homework;

import java.util.Arrays;
import java.util.Scanner;

public class ff {

	public static void main(String[] args) {
		System.out.println("60190295 김예빈 ");
		System.out.println("-------------- ");
		Scanner sc = new Scanner(System.in);
		
		int count = 1; // 몇개의 단어를 입력받았는지 세는 부분
		String[] dic = new String[count];

		for (int i = 0; i < dic.length; i++) {
			count += 1; // 단어가 하나씩 들어올 때다 배열의 크기가 1씩 증가하게 됨
			System.out.println("단어를 입력하세요 : ");
			dic[i] = sc.next();
		
			if (dic[i].equals("end")) { break; } // end가 들어오면 멈춤

			Arrays.sort(dic);// 왜 ㅁ지막 변수만 갖고와?
			System.out.println("가장 빠른 단어는 " + dic[0]);
		}


//			System.out.println("가장 빠른 단어는 " + dic[0]);

	}

}
