package myFolder;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		int even = sc.nextInt();		
		
		if (even % 2 == 0) {System.out.println("¦���Դϴ�");}
		else {System.out.println("Ȧ���Դϴ�."); }
		
		
		// 5�� ������� �ƴ���
		System.out.println("���ڸ� �Է��ϼ���.");
		int num5 = sc.nextInt();
		
		if (num5 % 5 == 0) {System.out.println("5�� ����Դϴ�.");}
		else  {System.out.println("5�� ����� �ƴմϴ�.");}
		
		}
		
	}
	
