package myFolder;

public class MyClass1 {

	public static void main(String[] args) {
		
		byte a = 127;
	//	System.out.println(a);
		
		char c = 'a'; // 0061 16������ ������ �޸𸮿� ����
		//System.out.println(c);
		
		
		// ���� ����
		double d = 1; // 1.0 ���� �ڵ�����ȯ
		double dd = 9/2; 
		System.out.println(dd); // 4.0
		
		double ddd = 9/2.0; // ����� ����ȯ, �Ǽ��� ������ �ϰ� ������ �ڿ� .0�� ���̱�
		System.out.println(ddd); // 4.5
		
		int i = 9/2;
		System.out.println(i); // 4
		
		int y = (int)(9/2.0); 
		// �� ��Ȳ���� ��ȣ�� ���� �� �������� y�� 9 ������ 2 �켱������ �ϰ�, int ���������� ��ȯ����.
		System.out.println(y); // 4
		
		int h = (int)(9%2);
		h = (100 > 90)? 100 : 90; // ���׿����� �� �� �Ͻ�, ù ��° ���� ����.
		//System.out.println(h); // 100
		
		// ���׿�����
		int num1 = 100;
		int num2 = 50;		
		int num3 = 30;
		i = ((num1 < num2)? num1 : num2);
		//System.out.println(i);
		i = ((i < num3)? i : num3);
		System.out.println(i); // 30
		
		// ������ ���� Ǯ��
		
		
		
		
		
		int ii = (int)100.0; // �Ǽ� 100.0�� int�� ������ �� �ִ� 32bit�� �����ؼ� ���� �� �� �ֵ��� ����� ����� ����ȯ
		//System.out.println(ii);
		
		int iii = (int)100000000000000000000.0; // ���⼱ int�� �ڱⰡ ��Ÿ�� �� �ִ� �ִ��� ���ڸ� ��Ÿ��
		//System.out.println(iii);	
		
		char u = 100;
		iii = 100;
		//System.out.println((char)iii);
		
		char k = 'g';
		char r = 128; // �� ��?!??!?
		//System.out.println(r);
		
		boolean q = false;
		boolean w = true;
		
	}

}
