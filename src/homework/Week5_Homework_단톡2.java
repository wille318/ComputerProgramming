package homework;

public class Week5_Homework_단톡2 {

	public static void main(String[] args) {
		System.out.println("60190295 김예빈 ");
		System.out.println("-------------- ");
		
//		아래와 같이 출력하시오.
//		1 2 3 4 5
//		6 7 8 9 10
//		11 12 13 14 15 
//		16 17 18 19 20 
//		21 22 23 24 25
		
	      for (int i=1;i<22;i+=5) {
	          for (int j=i;j<i+5;j++) {
	             System.out.print(j+" ");
	          }
	          System.out.println("\n");
	          }
	}

}
