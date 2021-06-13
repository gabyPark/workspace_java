
package myFolder;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 4번 : 최고점수 학생 이름 출력 오류 (모르겠어요ㅠㅠ)

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		int stuNum = 0;
		String[] name = null;
		int[] scores = null;

		while (run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 학생 정보입력 | 3. 학생 이름과 점수보기 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------------");

			System.out.println("선택 > ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("학생 수 > ");
				stuNum = sc.nextInt();
				name = new String[stuNum];
				scores = new int[stuNum];

			} else if (menu == 2) {

				for (int i = 0; i < name.length; i++) {
					System.out.println("이름 > ");
					name[i] = sc.next();

					System.out.println("점수 > ");
					scores[i] = sc.nextInt();
				}

			} else if (menu == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("이름 : " + name[i] + " 점수 : " + scores[i]);
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
				System.out.println("최고 점수 : " + max + " 이름 : " + name[maxIdx]);
				System.out.println("평균 점수 : " + avg);

			} else {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}