package myFolder;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean run = true;

		System.out.println("주사위 게임 : 주사위를 3번 굴려서 같은 수가 나올때 까지 무한 반복하는 게임이다. 게임 종료는 exit 글자 입력");

		while (run) {
			int dice = (int) ((Math.random() * 6) + 1);
			int dice2 = (int) ((Math.random() * 6) + 1);
			int dice3 = (int) ((Math.random() * 6) + 1);
			
			System.out.println("첫번째 주사위를 굴리세요. Enter키를 누르면 주사위 숫자가 표시됩니다.");
			sc.nextLine();
			System.out.println("첫번째 주사위 값 : " + dice);

			System.out.println("두번째 주사위를 굴리세요. Enter키를 누르면 주사위 숫자가 표시됩니다.");
			sc.nextLine();
			System.out.println("두번째 주사위 값 : " + dice2);

			System.out.println("세번째 주사위를 굴리세요. Enter키를 누르면 주사위 숫자가 표시됩니다.");
			sc.nextLine();
			System.out.println("세번째 주사위 값 : " + dice3);

			if ((dice == dice2) && (dice2 == dice3)) {
				System.out.println("빙고!");
				System.out.println("게임 종료를 원하시면 exit, 계속하시려면 엔터키를 누르세요.");
				String exit = sc.nextLine();
				
				if (exit.equals("exit")) {
					run = false;}

			} else {
				System.out.println("게임 종료를 원하시면 exit, 계속하시려면 엔터키를 누르세요.");
				String exit = sc.nextLine();

				if (exit.equals("exit")) {
					run = false;
				}
			}
		}
		System.out.println("프로그램 종료");

	}
}
