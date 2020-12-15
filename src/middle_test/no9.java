package middle_test;
import java.util.Scanner ; 

public class no9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Double [][] hj = new Double [4][2];
		Double w = 0.0;

		for(int i=1; i<5; i++){
			for(int j=1; j<3; j++){
				System.out.print(i+ "학년 " +j+ "학기는? "); 
				hj[i-1][j-1] = scn.nextDouble();
				w += hj[i-1][j-1];
			}
		}
		w = w / 8;
		System.out.print("전체평점: "+w);
		
	}

}
