package ch7_2;

public class Kumho extends Tire {
	
	// �ʵ�
	
	// ������
	public Kumho(String loca, int max) {
		super(loca, max);
	}
	
	// �޼ҵ�
	@Override
	public boolean roll() {
		++accu;
		if(accu < max) {
			System.out.println(loca+"Kumho Ÿ�̾� ���� : "+(max-accu)+"ȸ");
			return true;
		} else {
			System.out.println("***"+loca+"Kumho Ÿ�̾� ��ũ***");
			return false;
		}
	}

}
