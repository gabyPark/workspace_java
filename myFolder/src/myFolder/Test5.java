package myFolder;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean run = true;

		System.out.println("�ֻ��� ���� : �ֻ����� 3�� ������ ���� ���� ���ö� ���� ���� �ݺ��ϴ� �����̴�. ���� ����� exit ���� �Է�");

		while (run) {
			int dice = (int) ((Math.random() * 6) + 1);
			int dice2 = (int) ((Math.random() * 6) + 1);
			int dice3 = (int) ((Math.random() * 6) + 1);
			
			System.out.println("ù��° �ֻ����� ��������. EnterŰ�� ������ �ֻ��� ���ڰ� ǥ�õ˴ϴ�.");
			sc.nextLine();
			System.out.println("ù��° �ֻ��� �� : " + dice);

			System.out.println("�ι�° �ֻ����� ��������. EnterŰ�� ������ �ֻ��� ���ڰ� ǥ�õ˴ϴ�.");
			sc.nextLine();
			System.out.println("�ι�° �ֻ��� �� : " + dice2);

			System.out.println("����° �ֻ����� ��������. EnterŰ�� ������ �ֻ��� ���ڰ� ǥ�õ˴ϴ�.");
			sc.nextLine();
			System.out.println("����° �ֻ��� �� : " + dice3);

			if ((dice == dice2) && (dice2 == dice3)) {
				System.out.println("����!");
				System.out.println("���� ���Ḧ ���Ͻø� exit, ����Ͻ÷��� ����Ű�� ��������.");
				String exit = sc.nextLine();
				
				if (exit.equals("exit")) {
					run = false;}

			} else {
				System.out.println("���� ���Ḧ ���Ͻø� exit, ����Ͻ÷��� ����Ű�� ��������.");
				String exit = sc.nextLine();

				if (exit.equals("exit")) {
					run = false;
				}
			}
		}
		System.out.println("���α׷� ����");

	}
}
