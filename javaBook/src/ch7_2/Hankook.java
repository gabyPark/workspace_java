package ch7_2;

public class Hankook extends Tire{
	
	// �ʵ�
	
	// ������
	public Hankook(String loca, int max) {
		super(loca, max);
	}
	
	
	// �޼ҵ�
	@Override
	public boolean roll() {
		++accu;
		if(accu < max) {
			System.out.println(loca + "Hankook Ÿ�̾� ���� : "+ (max - accu)+"ȸ");
			return true;
		} else {
			System.out.println("***"+loca+"Hankook Ÿ�̾� ��ũ ***");
			return false;
		}
	}

}
