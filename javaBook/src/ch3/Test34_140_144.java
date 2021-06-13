package ch3;

public class Test34_140_144 {

	public static void main(String[] args) {

	int num = (int) (Math.random() * 6) +1;
	
	if(num==1) {
		System.out.println("1번");
	} else if (num==2) {
		System.out.println("2번");
	} else if (num==3) {
		System.out.println("3번");
	} else if (num==4) {
		System.out.println("4번");
	} else if (num==5) {
		System.out.println("5번");
	} else  {
		System.out.println("6번");
	}
	
	
	///
	
	switch(num) {
	case 1 :
		System.out.println("1번");
		break;
	case 2 :
		System.out.println("2번");
		break;
	case 3 :
		System.out.println("3번");
		break;
	case 4:
		System.out.println("4번");
		break;
	case 5 :
		System.out.println("5번");
		break;
		
		default :
			System.out.println("6번");
			break;
	}
	
	
	///
	
	int time = (int) (Math.random() * 4) + 8;
	System.out.println("현재 시각 : "+time+"시");
	
	switch (time) {
	case 8:
		System.out.println("출근입니다");
		break;
	case 9:
		System.out.println("회의시간");
		break;
	case 10:
		System.out.println("업무 집중 시간");
		break;
	default:
		System.out.println("외근");
		break;
	}
	
	
	char grade = 'B';
	
	switch (grade) {
	case 'A':
	case 'a':
		System.out.println("우수 회원입니다");
		break;
	case 'B':
	case 'b':
		System.out.println("일반 회원입니다");
		break;

	default:
		System.out.println("손님입니다");
		break;
	}
	
	
	///
	
	
	String position = "과장";
	
	switch (position) {
	case "부장":
		System.out.println("700만원");
		break;
	case "과장":
		System.out.println("500만원");
		break;
	default:
		System.out.println("300만원");
		break;
	}
	
	
	}

}
