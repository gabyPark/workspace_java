package ch7_2;

public class Tire {

	// �ʵ�
	public int max;
	public int accu;
	public String loca;
	
	
	// ������
	public Tire(String loca, int max) {
		this.loca = loca;
		this.max = max;
		
	}
	
	// �޼ҵ�
	
	public boolean roll() {
		++accu;
		if(accu < max) {
			System.out.println(loca + "Ÿ�̾� ���� : "+
					(max - accu) + "ȸ");
			return true;
		} else {
			System.out.println("***"+loca+"Ÿ�̾� ��ũ ***");
			return false;
		}
	}
}
