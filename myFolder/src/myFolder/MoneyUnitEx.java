package myFolder;

import java.util.Scanner;

public class MoneyUnitEx {

	public static void main(String[] args) {
		
		// 입력값 : 67540 원
		// 결과값 : 5만원 1장, 1만원 1장, 5천원 1장, 1천원 2장, 500원 1개, 50원 0개, 10원 4개

		Scanner sc = new Scanner(System.in);
		System.out.println("총 금액을 입력하세요.");
		int mon = sc.nextInt();
		System.out.println("사용자가 입력한 금액 : " + mon);
		
		int m500 = (mon / 50000); // 67540/50000 ---> 1장
		int m100 = ((mon % 50000) / 10000); // 17540/10000 ---> 1장
		int m50 = ((mon % 10000) / 5000);
		int m10 = ((mon % 5000) / 1000);
		int m5 = ((mon % 1000) / 500);
		int m1 = ((mon % 500) / 100);
		int m05 = ((mon % 100) / 50);
		int m01 = ((mon % 50) / 10);
		
		
		// 수업내용
//		int m500 = mon / 50000;
//		mon = mon % 50000; // 17540
//		int m100 = mon / 10000; // 만원의 개수 1장
//		mon = mon % 10000; // 7540
//		int m50 = mon / 5000; // 1장
//		mon = mon % 5000; // 2540
//		int m10 = mon / 1000; // 2장
//		mon = mon % 1000; // 540
//		int m5 = mon / 500; // 1개  
//		mon = mon % 500;
//		int m1 = mon / 100; // 0개
//		mon = mon % 100;
//		int m05 = mon / 50; // 0개
//		mon = mon % 50; // 40
//		int m01 = mon / 10; // 4개

		
		System.out.println("5만원권 : "+ m500);
		System.out.println("1만원권 : "+ m100);
		System.out.println("5천원권 : "+ m50);
		System.out.println("1천원권 : "+ m10);
		System.out.println("5백원 : "+m5);
		System.out.println("1백원 : "+m1);
		System.out.println("50원 : "+m05);
		System.out.println("10원 : "+m01);
		
		sc.close();
	}

}
