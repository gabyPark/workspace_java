package Practice;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
		
		Exam exam = new Exam();
		
		input(exam);
		print(exam);
	}

	private static void print(Exam exam) {
		System.out.println("-- ���� ��� --");
		
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		
		int total = kor + eng + math;
		double avg = (double)total / 3.0;
		 
		System.out.println("���� : "+exam.kor);
		System.out.println("���� : "+exam.eng);
		System.out.println("���� : "+exam.math);
		System.out.println("���� : "+total);
		System.out.println("��� : "+avg);
	}

	private static void input(Exam exam) {
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math;
		System.out.println("������ �Է��ϼ���");
		
		do {
			System.out.println("���� : ");
			kor = sc.nextInt();
			
			if(kor < 0 || 100 < kor) {
				System.out.println("0~100 ������ ���� �Է��ϼ���");
			}			
		} while(kor < 0 || 100 < kor);

		do {
			System.out.println("���� : ");
			eng = sc.nextInt();
			
			if(eng < 0 || 100 < eng) {
				System.out.println("0~100 ������ ���� �Է��ϼ���");
			}			
		} while(eng < 0 || 100 < eng);

		do {
			System.out.println("���� : ");
			math = sc.nextInt();
			
			if(math < 0 || 100 < math) {
				System.out.println("0~100 ������ ���� �Է��ϼ���");
			}			
		} while(math < 0 || 100 < math);
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
				}
}