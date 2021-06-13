package Practice;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Exam [] exams = new Exam[3];
		int current = 0;
		
		int menu;
		boolean keepLoop = true;
		
		while(keepLoop) {
			menu = inputMenu();
			
			switch (menu) {
			case 1:
				inputList(exams, current);
				break;
			case 2:
				printList(exams, current);
				break;
			
			case 3:
				System.out.println("종료합니다");
				break;

			default:
				break;
			}
		}
	}
	
	private static void printList(Exam[] exams, int size) {
		System.out.println("-- 성적 출력 --");
		
		for(int i=0;i<size;i++) {
		Exam exam = exams[i];
		
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math; 
		
		int total = kor + eng + math;
		double avg = (double)total / 3.0;
		 
		System.out.println("국어 : "+exam.kor);
		System.out.println("영어 : "+exam.eng);
		System.out.println("수학 : "+exam.math);
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		}
	}

	private static void inputList(Exam[] exams, int current) {
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math;
		System.out.println("성적을 입력하세요");
		
		do {
			System.out.println("국어 : ");
			kor = sc.nextInt();
			
			if(kor < 0 || 100 < kor) {
				System.out.println("0~100 범위의 수를 입력하세요");
			}			
		} while(kor < 0 || 100 < kor);

		do {
			System.out.println("영어 : ");
			eng = sc.nextInt();
			
			if(eng < 0 || 100 < eng) {
				System.out.println("0~100 범위의 수를 입력하세요");
			}			
		} while(eng < 0 || 100 < eng);

		do {
			System.out.println("수학 : ");
			math = sc.nextInt();
			
			if(math < 0 || 100 < math) {
				System.out.println("0~100 범위의 수를 입력하세요");
			}			
		} while(math < 0 || 100 < math);
		
		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
		exams[current] = exam;
		current++;
		
		
	}

	static int inputMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 종료");
		System.out.println("선택 : ");
		
		int menu = sc.nextInt();
		
		return menu;
		
	}

}
