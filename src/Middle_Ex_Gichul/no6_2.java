package Middle_Ex_Gichul;

public class no6_2 {

	public static void main(String[] args) {
		System.out.println("60190295 김예빈");
		System.out.println("------------------");
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if(i==j||i==4-j) {
					System.out.print("   ");
				}
				else System.out.print(" * ");
			}
			System.out.println();
		}
		
	}

}
