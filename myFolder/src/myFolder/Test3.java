
package myFolder;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 4�� : �ְ����� �л� �̸� ��� ���� (�𸣰ھ��Ф�)

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		int stuNum = 0;
		String[] name = null;
		int[] scores = null;

		while (run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. �л��� | 2. �л� �����Է� | 3. �л� �̸��� �������� | 4. �м� | 5. ����");
			System.out.println("--------------------------------------------------------");

			System.out.println("���� > ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("�л� �� > ");
				stuNum = sc.nextInt();
				name = new String[stuNum];
				scores = new int[stuNum];

			} else if (menu == 2) {

				for (int i = 0; i < name.length; i++) {
					System.out.println("�̸� > ");
					name[i] = sc.next();

					System.out.println("���� > ");
					scores[i] = sc.nextInt();
				}

			} else if (menu == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("�̸� : " + name[i] + " ���� : " + scores[i]);
				}

			} else if (menu == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				int maxIdx = 0;

				for (int i = 0; i < stuNum; i++) {
					sum += scores[i];

					if (scores[i] > max) {
						max = scores[i];
						maxIdx = i;
					}
				}

//				for(int i=0; i<scores.length; i++) {
//					max = (max < scores[i]) ? scores[i] : max;
//					sum += scores[i];
//				}

				avg = (double) sum / stuNum;
				System.out.println("�ְ� ���� : " + max + " �̸� : " + name[maxIdx]);
				System.out.println("��� ���� : " + avg);

			} else {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}