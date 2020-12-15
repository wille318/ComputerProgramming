package homework;

import java.util.Scanner;

public class amongus {

//	9주차 단톡과제 1 
//	자신의 반려동물 혹은 게임의 캐릭터를 클래스로 만들어보시오.
//	• 반려동물을 클래스로 만들 경우 동물의 종류는 자유롭게 정의할 것
//	• 게임 캐릭터를 클래스로 만들 경우에도 게임의 종류나 캐릭터는 자유롭게 정할 수 있음
//	• 멤버변수는 세 가지 이상 정의할 것
//	• 메소드도 세 가지 이상 정의할 것 
//	• 적절한 주석을 반드시 삽입할 것
//	• 자신이 만든 클래스에 대한 짤막한 설명을 쓸 것

//	만들 게임 : 어몽어스 (방장 조건 변경)
//	맴버 변수 : (1) 킬쿨 타임 : 10초 미만 불가, 최대 45초 
//			  (2) 임포스터 수 : 최소 1명, 최대 3명 
//			  (3) 미션 개수 : 최소 1개, 최대 6개 
//			  (4) 임포스터 여부 : 죽이겠냐는 질문에 yes 시 임포스터로 하겠음. 
			  
	Scanner sc = new Scanner(System.in);
	String name = "CCTV 관리자" ; 
// ------9주차-------- 
//	double killcool = 10; // 킬쿨 타임 : 0.25초 단위로 증감하여 double 사용 
//	int imposter_no = 2; //임포스터 수 : 기본 2명으로 설정 
//	int mission = 3; //미션 개수 : 기본 3개로 시작 
//	boolean imposter = false; //임포스터 여부 : 기본 크루원 
// ------9주차-------- 

// ------10주차-------- 
	double killcool ; // 킬쿨 타임 : 0.25초 단위로 증감하여 double 사용 
	int imposter_no; //임포스터 수 : 기본 2명으로 설정 
	int mission ; //미션 개수 : 기본 3개로 시작 
	boolean imposter; //임포스터 여부 : 기본 크루원 
	
	amongus(){
		this.killcool = 10; // 킬쿨 타임 : 0.25초 단위로 증감하여 double 사용 
		this.imposter_no = 2; //임포스터 수 : 기본 2명으로 설정 
		this.mission = 3; //미션 개수 : 기본 3개로 시작 
		this.imposter = false ; //임포스터 여부 : 기본 크루원 
	}
// ------10주차-------- 
	void killcool() {
		if (killcool<10) System.out.println("10초 미만으로 킬쿨을 줄일 수 없습니다.");
		else if (killcool > 45) System.out.println("45초 초과로 킬쿨을 늘릴 수 없습니다.");
		else {
			System.out.println("킬쿨을 늘리시겠습니까? (Yes) / 줄이시겠습니까? (No)");
			String yn = sc.next();
			
			if (yn.equals("Yes")) {
				if (killcool+0.25 > 45) System.out.println("45초 초과로 킬쿨을 늘릴 수 없습니다.");
				else {
					killcool += 0.25;
					System.out.println("(현재 킬쿨은 "+ killcool + "초 입니다.)");
				}
			}
			else if (yn.equals("No")) {
				if (killcool - 0.25 < 10) System.out.println("10초 미만으로 킬쿨을 줄일 수 없습니다.");
				else {
					killcool -= 0.25;
					System.out.println("(현재 킬쿨은 "+ killcool + "초 입니다.)");
				}
			}
			else System.out.println("잘못 입력하셨습니다. ");
		}
	}

	void imposter_no() {
		if (imposter_no<1) System.out.println("임포스터는 1명 이상이어야합니다.");
		else if (imposter_no > 3) System.out.println("임포스터를 더 늘린다면 게임이 재미없습니다.");
		else {
			System.out.println("임포스터를 늘리시겠습니까? (Yes) / 줄이시겠습니까? (No)");
			String yn = sc.next();
			
			if (yn.equals("Yes")) {
				if (imposter_no+1 > 3) System.out.println("임포스터를 더 늘린다면 게임이 재미없습니다.");
				else {
					imposter_no += 1;
					System.out.println("(현재 임포스터 수는 "+ imposter_no + "명 입니다.)");
				}
			}
			else if (yn.equals("No")) {
				if (imposter_no -1 <10) System.out.println("임포스터는 1명 이상이어야합니다.");
				else {
					imposter_no -= 1;
					System.out.println("(현재 임포스터 수는 "+ imposter_no + "명 입니다.)");
				}
			}
			else System.out.println("잘못 입력하셨습니다. ");
		}
	}
	
	void mission() {
		if (mission<1) System.out.println("미션은 1개 이상이어야합니다.");
		else if (mission > 6) System.out.println("미션을 더 늘린다면 크루원의 원성을 살 수 있습니다.");
		else {
			System.out.println("미션을 늘리시겠습니까? (Yes) / 줄이시겠습니까? (No)");
			String yn = sc.next();
			
			if (yn.equals("Yes")) {
				if (mission+1 > 6) System.out.println("미션을 더 늘린다면 크루원의 원성을 살 수 있습니다.");
				else {
					mission += 1;
					System.out.println("(현재 미션 개수는 "+ mission + "개 입니다.)");
				}
			}
			else if (yn.equals("No")) {
				if (mission -1 <1) System.out.println("미션은 1개 이상이어야합니다.");	
				else {
					mission -= 1;
					System.out.println("(현재 미션 개수는 "+ mission + "개 입니다.)");
				}
			}
			else System.out.println("잘못 입력하셨습니다. ");
		}
	}
	
	void imposter (){
		System.out.println("죽이시겠습니까?(Yes/No) ");
		String yn = sc.next();
		if (yn .equals("Yes")) {
			imposter = true;
		}
		
		if(imposter == true) {
			System.out.println(name + "는 임포스터입니다.");
			if (imposter_no == 0) System.out.println("크루원 승리"); 
			//크루원이 임포스터를 모두 색출하면 시민승리
			else System.out.println("임포스터가" + (imposter_no - 1) + "명 남았습니다."); 
			//승리가 뜨지 않으면 남은 임포스터 수를 알려줌 
		}
		else {
			System.out.println(name + "는 임포스터가 아닙니다.");
			if (imposter_no == (10 - imposter_no)) System.out.println("임포스터 승리"); 
			//시민 수 == 임포스터 수 가 되면 임포스터가 승리
			else System.out.println("임포스터가 " + (imposter_no - 1) + "명 남았습니다.");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("60190295 김예빈 ");
		System.out.println("-------------- ");
		
		amongus a = new amongus();

//		amongus player1 = new amongus();
		a.killcool();
		a.imposter_no();
		a.imposter_no();
		a.mission();
		a.mission();
		a.mission();
		a.mission();
		a.imposter();
	}

}
