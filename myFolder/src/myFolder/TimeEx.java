package myFolder;

import java.util.Scanner;

public class TimeEx {

	public static void main(String[] args) {
		// �Է°� : ��		3600
		// ��°� : �� �� ��	1�ð� 0�� 0��
		// �ʸ� �Է��ϸ� ��� ��� �������� ���� �� �ֵ��� 
		// ����� �̸� �Է��س��� ��  = test case

		Scanner sc = new Scanner(System.in);	
		System.out.println("�ú��ʷ� ��� �� �� ������ �Է��ϼ���");
		int time = sc.nextInt();
		System.out.println("����ڰ� �Է��� �� : " + time);
		
		// �Էµ� �ʴ��� / 3600 = ��(��)
		// �Էµ� �ʴ��� % 3600 (�ð��� ����ϰ� ���� ������ ��) / 60 = ��  ---> % �����
		// �Էµ� �ʴ��� % 3600 % 60 = �� 
		
		int hour = time / 3600;
		int min = (time % 3600) /60;
		int sec = (time % 3600) %60;
		
		
		System.out.println(hour +"��" + min +"�� " + sec + "��");
		
	}

}
