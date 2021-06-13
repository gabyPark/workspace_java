package myFolder;

import java.util.Scanner;

public class TimeEx {

	public static void main(String[] args) {
		// 입력값 : 초		3600
		// 출력값 : 시 분 초	1시간 0분 0초
		// 초를 입력하면 몇시 몇분 몇초인지 나올 수 있도록 
		// 결과를 미리 입력해놓는 것  = test case

		Scanner sc = new Scanner(System.in);	
		System.out.println("시분초로 계산 할 초 단위를 입력하세요");
		int time = sc.nextInt();
		System.out.println("사용자가 입력한 값 : " + time);
		
		// 입력된 초단위 / 3600 = 시(몫)
		// 입력된 초단위 % 3600 (시간을 계산하고 남은 나머지 초) / 60 = 분  ---> % 연산법
		// 입력된 초단위 % 3600 % 60 = 초 
		
		int hour = time / 3600;
		int min = (time % 3600) /60;
		int sec = (time % 3600) %60;
		
		
		System.out.println(hour +"시" + min +"초 " + sec + "초");
		
	}

}
