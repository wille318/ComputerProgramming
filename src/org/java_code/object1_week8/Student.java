package org.java_code.object1_week8;

public class Student {
	// 단순히 메소드만 열때는 static 을 설정하지 않아도 됨.
	int score_Kor;
	int score_Eng;

	int sum() {
		return score_Kor+score_Eng;
	}
}
