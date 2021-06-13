package ch7_1;

public class DmbEx {

	public static void main(String[] args) {

		// Dmb 객체 생성
		Dmb dmb = new Dmb("자바폰","검정",10);

		// CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델 : "+dmb.model);
		System.out.println("색상: "+dmb.color);
		
		// Dmb 클래스의 필드
		System.out.println("채널 : "+dmb.channel);
		
		// CellPhone 클래스에서 상속받은 메소드 호출
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoce("안녕하세요");
		dmb.sendVoice("네 안녕하세요.");
		dmb.hangUp();
		
		// Dmb 클래스의 메소드 호출
		dmb.turnOnDmb();
		dmb.changeChDmb(12);
		dmb.turnOffDmb();
	}

}
