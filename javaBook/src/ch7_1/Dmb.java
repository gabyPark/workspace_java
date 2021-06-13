package ch7_1;

public class Dmb extends CellPhone {

	
	// 필드
	int channel;
	
	
	// 생성자
	Dmb(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널 : "+channel+"번을 켭니다");
	}
	void changeChDmb(int channel) {
		this.channel = channel;
		System.out.println(channel+"번으로 바꿉니다");
	}
	void turnOffDmb() {
		System.out.println("DMB 전원 OFF");
	}
}
