package finaltext;

public class no5 {

	public static void main(String[] args) {
		for(int m=0; m<5; m++) {
			for(int n=0; n<5; n++) {
				if (m==1) {System.out.print(m+n+1+ " ");}
				else if(m==2) {
					System.out.print(5-m+ " ");
					if (n=5) System.out.print " ");

				}
				
			
				else if(m==3) System.out.print(5-m+ " ");
				else if(m==4) System.out.print(m+n+1+ " ");
				else System.out.print(m+n+1+ " ");
			}
			System.out.println("");
		}
	}

}
