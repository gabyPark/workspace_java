package test2;

public class Example3 {

	public static void main(String[] args) {
		
		System.out.println("�ڹ� ������");
		
		// <�ڹٿ��� ����ϴ� ������ Ÿ��> 
		// 1. �⺻ �������� : ���� (int long short byte), �Ǽ� (double float) , ���� ('A' '��' 'a' �ο��ȣ �ϳ� + ���� �ϳ� = char), �� (true false�� ���� boolean)
		// 2. ���� �������� : ���ڿ� (String "������" "��" ""...)
		
		// ���� ������ ���� ����� ��, ���� ������ �����ϰ� �ѹ��� ����(�̸� �ߺ� �Ұ�)
		int add;
		add = 1+2; // == �� ���ٴ� �ǹ�, = �� ������ �ǹ̰� �ִ� ���Կ�����
		System.out.println(add);
		add = 4; // ���������� ������ �ڵ带 �ν���
		System.out.println(add);
		
		double add2;
		add2 = 1.2;
		System.out.println(add2);
		// int ������ x.0 ��  �Ұ���������, double 0�� 0.0���� �νİ��� (�ڵ�����ȯ)
		
		char c = 'a';
		System.out.println(c);
		c = 'b';
		System.out.println(c);
		
		boolean b;
		b = true;
		b = false;
		
		String name = "�ڰ���";
		System.out.println(name);
		

	}

}
