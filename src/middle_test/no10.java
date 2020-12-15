package middle_test;

public class no10 {

	public static void main(String[] args) {
//		10-2 
		for(int i=0; i<5; ++i) {
			for(int j=0;j<5;++j) {
				if(i!=j) { //일단 i=j로 놓고 계산 후, 식 바꾸면 가능 
					System.out.printf(-1+ " ");
				}
				else{
					System.out.printf(" "+1+" ");
				}
			} 
			System.out.println(); //줄바꾸기 
	      }
	}

}
