package homework;

public class KC extends Chicken { //교촌키친 	
	Chicken ck = new Chicken();
	public KC() { 
		ck.nearby = 300;
		ck.number = "02-2748-5837";
	}//기본 생성자 

	public void KC () { //추가생성자 
		System.out.println(ck.nearby + "//" +ck.number);
	}
	
	public void main() {
		System.out.println("허니콤보가 제일 잘나가요~");
	}
	public void pack() {
		System.out.println("종이 포장지에 배달갑니다.");
	}
}
