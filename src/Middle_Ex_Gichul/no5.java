package Middle_Ex_Gichul;

public class no5 {

	public static void main(String[] args) {
		System.out.println("60190295 김예빈");
		System.out.println("------------------");

		int [][] array = {{100, 80, 85}, {90,70,65}, {60,55,50},{85,70,90}, {55,35,80}};
		double[] av = new double[5]; 
		int [] full = new int [5] ;
		
			for (int j=0; j<5; j++) {
				for(int i=0; i<3; i++){
					av[j] = (array[j][0] + array[j][1] + array[j][2])/3;
					full[j] = array[j][0] + array[j][1] + array[j][2];
				}
					System.out.printf("%7s", array[j][0] + "  ");
					System.out.printf("%7s", array[j][1] + "  ");
					System.out.printf("%7s", array[j][2] + "    ");
					System.out.print (av[j]);
					System.out.print (full[j]);
					System.out.println(); 
		 }
	}
}

