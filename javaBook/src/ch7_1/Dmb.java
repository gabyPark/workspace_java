package ch7_1;

public class Dmb extends CellPhone {

	
	// �ʵ�
	int channel;
	
	
	// ������
	Dmb(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	// �޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� : "+channel+"���� �մϴ�");
	}
	void changeChDmb(int channel) {
		this.channel = channel;
		System.out.println(channel+"������ �ٲߴϴ�");
	}
	void turnOffDmb() {
		System.out.println("DMB ���� OFF");
	}
}
