package ch7_1;

public class DmbEx {

	public static void main(String[] args) {

		// Dmb ��ü ����
		Dmb dmb = new Dmb("�ڹ���","����",10);

		// CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("�� : "+dmb.model);
		System.out.println("����: "+dmb.color);
		
		// Dmb Ŭ������ �ʵ�
		System.out.println("ä�� : "+dmb.channel);
		
		// CellPhone Ŭ�������� ��ӹ��� �޼ҵ� ȣ��
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("��������");
		dmb.receiveVoce("�ȳ��ϼ���");
		dmb.sendVoice("�� �ȳ��ϼ���.");
		dmb.hangUp();
		
		// Dmb Ŭ������ �޼ҵ� ȣ��
		dmb.turnOnDmb();
		dmb.changeChDmb(12);
		dmb.turnOffDmb();
	}

}
