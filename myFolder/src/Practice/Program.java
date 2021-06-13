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
				System.out.println("�����մϴ�");
				break;

			default:
				break;
			}
		}
	}
	
	private static void printList(Exam[] exams, int size) {
		System.out.println("-- ���� ��� --");
		
		for(int i=0;i<size;i++) {
		Exam exam = exams[i];
		
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
	}

	private static void inputList(Exam[] exams, int current) {
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
		
		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
		exams[current] = exam;
		current++;
		
		
	}

	static int inputMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� ���");
		System.out.println("3. ����");
		System.out.println("���� : ");
		
		int menu = sc.nextInt();
		
		return menu;
		
	}

}
