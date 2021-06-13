package ch7_1;

public class CellPhone {

	// 필드
	String model;
	String color;
	
	// 생성자
	
	
	// 메소드
	void powerOn() {System.out.println("전원 ON");}
	void powerOff() {System.out.println("전원 OFF");}
	void bell() {System.out.println("전화벨이 울립니다.");}
	void sendVoice(String message) {System.out.println("나 : "+message);}
	void receiveVoce(String message) {System.out.println("상대 : "+message);}
	void hangUp() {System.out.println("전화를 끊습니다.");}
}
