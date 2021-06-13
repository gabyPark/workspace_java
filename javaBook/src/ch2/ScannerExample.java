package ch2;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		String inputData;

		while (true) {
			inputData = sc.nextLine();
			System.out.println("입력된 문자열 : " + inputData);
			if (inputData.contentEquals("q")) {
				break;

			}
		}

		System.out.println("종료");
	}

}
