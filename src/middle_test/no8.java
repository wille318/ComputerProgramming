package middle_test;

public class no8 {

	public static void main(String[] args) {
//		10-1번  

		for(int i=0; i<5; ++i) {
			for(int j=0;j<5;++j) {
				if(i<=j&&i>=j) { //일단 i=j로 놓고 계산 후, 식 바꾸면 가능 
					System.out.print(i+1);
				}
				else if (i<=(4-j) && i>=(4-j)) {
					System.out.print(i+1);

				}
				else{
					System.out.print(" *  ");
				}
			} 
			System.out.println(); //줄바꾸기 
	      }
	}

}
