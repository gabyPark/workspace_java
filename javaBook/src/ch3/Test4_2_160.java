package ch3;

import java.util.Scanner;

public class Test4_2_160 {

	public static void main(String[] args) {

		// 161p 3번, 5번, 7번 풀어보기
		
		// 3번
/*		int a = 0;
		int b = 0;
		
		while(a+b != 5) {
			a = (int)(Math.random() * 6)+1;
			b = (int)(Math.random() * 6)+1;
		}

		System.out.println("a"+a+"b"+b+" = "+(a+b));*/
		
		
		
		// 5번
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
				
		// 7번
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("----------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------");
			System.out.println("선택 > ");
			
			int memnum = sc.nextInt();
			switch (memnum) {
			case 1:
				System.out.println("예금액 : ");
				int money = sc.nextInt();
				balance+=money; 
				break;
			case 2:
				System.out.println("출금기능입니다");
				if (balance > 0 ) {
					System.out.println("출금 할 금액을 입력하세요");
					System.out.println("현재 잔고 : "+balance);
					int back = sc.nextInt();
					balance-=back;
				} else {System.out.println("출금 가능한 금액이 없습니다");}
				break;
			case 3:
				System.out.println("잔고는"+balance+"입니다");
				break;
			case 4:
				System.out.println("종료합니다");
				run = false;
				break;
			default:
				System.out.println("1번~4번 중 입력하세요");
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}

}
