package myFolder;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		
		if (age >= 19) { System.out.println("19세 관람 가능합니다."); }
		else if (age >= 15) {System.out.println("15세 관람 가능합니다.");}
		else if (age >= 12) {System.out.println("12세 관람 가능합니다.");}
		else {System.out.println("관람 불가합니다.");}
		
		sc.close();
		System.out.println("메인 종료");

		}

	}
