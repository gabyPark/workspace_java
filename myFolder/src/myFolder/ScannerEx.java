package myFolder;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("������ �Է��ϰ� Enter Ű�� ��������");
		
		//int input1 = sc.nextInt(); // ����ڰ� int ���� �Է��ϰ� �Ѵ�.
		//System.out.println(input1);
		
		//System.out.println("�ܾ �Է��ϰ� Enter Ű�� ��������");
		//String input2 = sc.nextLine();
		//System.out.println(input2);
		
		// ��ĳ�ʷ� ����ڰ� �Է��� ���� �� ���� ����(num1, num2)�� ������ �� ���� ���� ���� ���϶�.
		// �Է��� �ޱ� ����, ������ �Է��ؾ� �� �� ��ɾ ������ �϶�.
		
//		System.out.println("������ �Է��ϰ� Enter Ű�� ��������");
//		int num1 = sc.nextInt();
//		System.out.println("������ �Է��ϰ� Enter Ű�� ��������");
//		int num2 = sc.nextInt();
//		int i = (num1 + num2);
//		System.out.println(i);
		

		String a = sc.nextLine();
		int age = sc.nextInt();
		System.out.println(10 + a + age);
		
		System.out.println("�̸���" + a);
		System.out.println("���̴�" + age);
		
	}

}
