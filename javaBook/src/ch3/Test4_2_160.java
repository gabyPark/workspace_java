package ch3;

import java.util.Scanner;

public class Test4_2_160 {

	public static void main(String[] args) {

		// 161p 3��, 5��, 7�� Ǯ���
		
		// 3��
/*		int a = 0;
		int b = 0;
		
		while(a+b != 5) {
			a = (int)(Math.random() * 6)+1;
			b = (int)(Math.random() * 6)+1;
		}

		System.out.println("a"+a+"b"+b+" = "+(a+b));*/
		
		
		
		// 5��
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
				
		// 7��
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("----------");
			System.out.println("1.���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("----------");
			System.out.println("���� > ");
			
			int memnum = sc.nextInt();
			switch (memnum) {
			case 1:
				System.out.println("���ݾ� : ");
				int money = sc.nextInt();
				balance+=money; 
				break;
			case 2:
				System.out.println("��ݱ���Դϴ�");
				if (balance > 0 ) {
					System.out.println("��� �� �ݾ��� �Է��ϼ���");
					System.out.println("���� �ܰ� : "+balance);
					int back = sc.nextInt();
					balance-=back;
				} else {System.out.println("��� ������ �ݾ��� �����ϴ�");}
				break;
			case 3:
				System.out.println("�ܰ��"+balance+"�Դϴ�");
				break;
			case 4:
				System.out.println("�����մϴ�");
				run = false;
				break;
			default:
				System.out.println("1��~4�� �� �Է��ϼ���");
				break;
			}
			
		}
		System.out.println("���α׷� ����");
	}

}
