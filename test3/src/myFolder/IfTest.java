package myFolder;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̸� �Է��ϼ���.");
		int age = sc.nextInt();
		
		if (age >= 19) { System.out.println("19�� ���� �����մϴ�."); }
		else if (age >= 15) {System.out.println("15�� ���� �����մϴ�.");}
		else if (age >= 12) {System.out.println("12�� ���� �����մϴ�.");}
		else {System.out.println("���� �Ұ��մϴ�.");}
		
		sc.close();
		System.out.println("���� ����");

		}

	}
