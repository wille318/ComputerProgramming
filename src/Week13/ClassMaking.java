package Week13;

public class ClassMaking {
	private String StudentNo;
	private String Name;
	private boolean registered;
	
	public void showInfo() {
		System.out.println("학번" + this.StudentNo+"이름" + this.Name+ "등록여부"+this.registered);
	}
	
	public void register() {
		if(registered)System.out.println("이미 등록되어 있습니다.");
		else {
			this.registered=true;
			System.out.println("등록되었습니다.");
		}
	}
	
	public void leave() {
		if(!registered)System.out.println("이미 휴학중입니다.");
		else {
			this.registered=false;
			System.out.println("휴학처리되었습니다.");
		}
	}
	public ClassMaking() { //기본생성
		this.registered = true;
	}
	
	public ClassMaking(String StudentNo, String Name) {
		this.StudentNo = StudentNo;
		this.Name = Name;
		this.registered = true; // = this();
	}
	
	public static void main(String[] args) {	
		ClassMaking s1 = new ClassMaking();
		ClassMaking s2 = new ClassMaking("601901234", "John");
		s1.Name = "Choi";
		s2.leave();
		s2.showInfo();
	}

}
