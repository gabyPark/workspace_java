package myFolder;

import java.util.Scanner;

public class MoneyUnitEx {

	public static void main(String[] args) {
		
		// �Է°� : 67540 ��
		// ����� : 5���� 1��, 1���� 1��, 5õ�� 1��, 1õ�� 2��, 500�� 1��, 50�� 0��, 10�� 4��

		Scanner sc = new Scanner(System.in);
		System.out.println("�� �ݾ��� �Է��ϼ���.");
		int mon = sc.nextInt();
		System.out.println("����ڰ� �Է��� �ݾ� : " + mon);
		
		int m500 = (mon / 50000); // 67540/50000 ---> 1��
		int m100 = ((mon % 50000) / 10000); // 17540/10000 ---> 1��
		int m50 = ((mon % 10000) / 5000);
		int m10 = ((mon % 5000) / 1000);
		int m5 = ((mon % 1000) / 500);
		int m1 = ((mon % 500) / 100);
		int m05 = ((mon % 100) / 50);
		int m01 = ((mon % 50) / 10);
		
		
		// ��������
//		int m500 = mon / 50000;
//		mon = mon % 50000; // 17540
//		int m100 = mon / 10000; // ������ ���� 1��
//		mon = mon % 10000; // 7540
//		int m50 = mon / 5000; // 1��
//		mon = mon % 5000; // 2540
//		int m10 = mon / 1000; // 2��
//		mon = mon % 1000; // 540
//		int m5 = mon / 500; // 1��  
//		mon = mon % 500;
//		int m1 = mon / 100; // 0��
//		mon = mon % 100;
//		int m05 = mon / 50; // 0��
//		mon = mon % 50; // 40
//		int m01 = mon / 10; // 4��

		
		System.out.println("5������ : "+ m500);
		System.out.println("1������ : "+ m100);
		System.out.println("5õ���� : "+ m50);
		System.out.println("1õ���� : "+ m10);
		System.out.println("5��� : "+m5);
		System.out.println("1��� : "+m1);
		System.out.println("50�� : "+m05);
		System.out.println("10�� : "+m01);
		
		sc.close();
	}

}
