package ch3;

import java.util.Scanner;

public class Test3_2_8 {

	public static void main(String[] args) {

//		int lengthTop = 5;
//		int lengthBottom = 10;
//		int height = 7;
		
		// double�� �� �̻� �׳� 2�� �����°� �ƴ϶� 2.0���� ���ִ°� ����
		
//		double area = ((lengthTop + lengthBottom)*height/2.0);
//		System.out.println(area);
		
		
		// 3-2, 11�� ����
		// Scanner ���̺귯�� next(), nextInt(), nextLine()
		// Integer ���̺귯�� wrapper class  parseInt -> ���ڸ� ������ �ٲ��ִ� ��
		// String ���̺귯�� equals() -> �ΰ��� ���ڸ� ���ؼ� ������ true, �ٸ��� false
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID : ");
		String name = sc.nextLine();
		
		System.out.println("PW : ");
		String strPw = sc.nextLine();
		int password = Integer.parseInt(strPw);
		
//		System.out.println(name + " "+password);
		
		if(name.equals("java")){
			if(password == 12345) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("Ʋ�� �н������Դϴ�");
			}
		} else {
			System.out.println("��ȸ���Դϴ�");
		}
		
		
		

	}

}
