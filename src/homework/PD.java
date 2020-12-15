package homework;

public class PD extends Chicken { //푸라닭 
	Chicken ck = new Chicken();
	public PD() { 
		ck.nearby = 250;
		ck.number = "02-9448-7337";
	}//기본 생성자 

	public void pd() { //추가생성자 
		System.out.println(ck.nearby + "//" +ck.number);
	}
	
	public void QnA() {
		System.out.println("에이 저희 명품 따라만든거 아니에요~");
	}
	public void bestchicken() {
		System.out.println("고추마요 잘나가요 ^^");
	}
}

