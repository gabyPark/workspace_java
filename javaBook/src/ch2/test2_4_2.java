package ch2; 

import java.util.Scanner;

public class test2_4_2 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("ù��° �� : ");
	String strNum1 = sc.nextLine();
	
	System.out.println("�ι�° �� : ");
	String strNum2 = sc.nextLine();
	
	int num1 = Integer.parseInt(strNum1);
	int num2 = Integer.parseInt(strNum2);

	int result = num1 + num2;
	System.out.println("���� ��� : "+result);
	
//	System.out.println("�̸��� �Է��ϼ���");
//	String name = sc.nextLine();
//	
//	System.out.println("�ֹι�ȣ �� 6�ڸ��� �Է��ϼ���");
//	System.out.println("��ȭ��ȣ�� �Է��ϼ���");
	
	}

}
