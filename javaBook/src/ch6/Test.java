package ch6;

public class Test {

	public static void main(String[] args) {
		
		
		System.out.println(StaticTest.from1to10);
		

		// ��ü ����
		Patient p = new Patient();
		// p �� Patient ũ�� ��ŭ �Ҵ�� �޸� �ּҰ��� ������.
		// ��ü ���� p, p1�� �ν��Ͻ�
		
		p.body = "�Ӹ�";
		p.name = "�����";
		p.no = "123";
		
		Patient p1 = new Patient();
		p1.body ="��";
		p.name = "�ڰ���";
		p.no = "124";		
		
		System.out.println(p.body+p.name+p.no);
	}

}
