package homework;

import java.util.Scanner;
import java.util.Arrays;

public class Week6_Homework_갠톡2_Re {

	public static void main(String[] args) {
		System.out.println("60190295 김예빈 ");
		System.out.println("-------------- ");
		// Scanner sc = new Scanner(System.in);
		
		// int count = 1; // 몇개의 단어를 입력받았는지 세는 부분
		// String[] dic = new String[count];

		// for (int i = 0; i < dic.length; i++) {
			
		// 	while (true) {		
		// 		System.out.println("단어를 입력하세요 : ");
		// 		dic[i] = sc.next();
		// 		if (dic[i].equals("end")) {break;}
		// 	}
		// 	Arrays.sort(dic);// 왜 ㅁ지막 변수만 갖고와?
		// 	System.out.println(Arrays.toString(dic));
		// }

		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];

		int count = -1;
		System.out.println("단어를 입력하세요 : ");

		for(int i=0; i<10;++i) {
			String n= sc.next();
			if (n.equals("end")) {
				break;
			} else {
				name[i]=n;
				++count;
			}
		}
		String firstWord = name [0];
		for (int j=1; j<=count ; ++j) {
			if (firstWord.compareTo(name[j] > 1 ){
				firstWord = name[j];
			})
			System.out.println("가장빠른 단어는 "+ firstWord + "입니다.")
		}
	}
}
