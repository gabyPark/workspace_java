package Practice;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
		
		Exam exam = new Exam();
		
		input(exam);
		print(exam);
	}

	private static void print(Exam exam) {
		System.out.println("-- 성적 출력 --");
		
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

	private static void input(Exam exam) {
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
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
				}
}