package homework;
// Week8_Homework_단톡 

public class phone {
	String number;
	boolean battery_is_full;
	
	void Show_phone_number() {
		System.out.println("폰 번호는 " + number + "입니다.");
	}
	
	void recharge (){
		if(battery_is_full == true) {
			System.out.println("이미 배터리가 충전되어 있습니다.");
		}
		else {
			System.out.println("충전 중 입니다.");
			battery_is_full = true;
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("60190295 김예빈 ");
		System.out.println("-------------- ");
		
		
		phone phone1 = new phone();
		phone1.number = "010-1234-5678";
		phone1.battery_is_full = false;

		phone1.Show_phone_number();
		phone1.recharge();
		phone1.recharge();
	}

}
