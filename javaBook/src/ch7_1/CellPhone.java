package ch7_1;

public class CellPhone {

	// �ʵ�
	String model;
	String color;
	
	// ������
	
	
	// �޼ҵ�
	void powerOn() {System.out.println("���� ON");}
	void powerOff() {System.out.println("���� OFF");}
	void bell() {System.out.println("��ȭ���� �︳�ϴ�.");}
	void sendVoice(String message) {System.out.println("�� : "+message);}
	void receiveVoce(String message) {System.out.println("��� : "+message);}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�.");}
}
