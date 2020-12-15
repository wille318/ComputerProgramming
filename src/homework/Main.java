package homework;

public class Main {

	public static void main(String[] args) {
		System.out.println("60190295 김예빈 ");
		
//		치킨 상속받는 교촌치킨 객체 생성  
		System.out.println("------[ 교촌치킨 ]------");
		KC kc = new KC();
//		Chicken ck = new Chicken();

//		kc.nearby = 300;
//		kc.number = "02-2748-5837";
		kc.KC();
		kc.taste();
		kc.fried();
		kc.main();
		kc.pack();
		System.out.println();
		
// #################################################
//		치킨 상속받는 푸라닭 객체 생성  
		System.out.println("------[ 푸라닭 ]------");
		PD PD = new PD();
		
		PD.pd();
		PD.taste();
		PD.fried();
		PD.QnA();
		PD.bestchicken();
		System.out.println();

// #################################################
//		치킨 상속받는 BBQ 객체 생성  
		System.out.println("------[ BBQ ]------");
		BBQ BBQ = new BBQ();

		BBQ.bbq();
		BBQ.taste();
		BBQ.fried();
		BBQ.model();
		BBQ.sale();
		System.out.println();

	}

}
