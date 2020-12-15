package homework;

public class BBQ extends Chicken { //BBQ치킨 
	Chicken ck = new Chicken();
	public BBQ() { 
		ck.nearby = 153;
		ck.number = "02-9948-1033";
	}//기본 생성자 

	public void bbq() { //추가생성자 
		System.out.println(ck.nearby + "//" +ck.number);
	}
	
	public void model() {
		System.out.println("이번에 황광희 모델로 광고 찍었습니다. 네 맞아요 네고왕");
	}
	public void sale() {
		System.out.println("저희 저저번주까지 5천원 세일 했는데...");
	}
}