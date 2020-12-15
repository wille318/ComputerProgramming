package homework;

public class Week6_Homework_갠톡1 {

	public static void main(String[] args) {
//		아래 거꾸로 된 구구단 표를 2차원 배열에 저장하고 인쇄하여 보여주시오.
//		• 값을 넣는 부분과 출력하는 부분으로 나누어 이중for문을 사용하시오.
//		• 포맷팅을 이용해서 보기 좋게 왼쪽정렬하여 출력할 것 
		
		System.out.println("60190295 김예빈 ");
		System.out.println("-------------- ");
		
		int [][] array = new int[9][9]; 
		for(int m=0; m<9; ++m) {
			for(int n=0; n<9;++n) {
				array[m][n] = (9-n)*(m+1);

				System.out.printf("%4d", array[m][n]);
			}
		System.out.println();
		}
	}
}
