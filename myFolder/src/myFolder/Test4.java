package myFolder;

import java.util.Scanner;

public class Test4 {

	static Book[] books = new Book[10];
	static Scanner sc = new Scanner(System.in);
	static int insertCnt = 0;
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.���� ���� �Է� | 2. å �˻� | 3. ����");
			System.out.println("--------------------------------");
			System.out.println("�޴� ���� > ");
			int menuNo = sc.nextInt();
			
			switch (menuNo) {
			case 1:
				insertBook();
				break;
			case 2:
				searchingBook();
				break;
			case 3:
				run = false;
				break;

			}
		}
		
		sc.close();
		System.out.println("���α׷� ����");
	}
	
	static void insertBook() {
		if(insertCnt < books.length) {
			insertCnt++;
			sc.nextLine();
			System.out.println("������ �Է� : ");
			String title = sc.nextLine();
			System.out.println("���� �Է� : ");
			String author = sc.nextLine();
			System.out.println("���ǻ� �Է� : ");
			String publish = sc.nextLine();
			System.out.println("���� �Է� : ");
			int price = sc.nextInt();
			
			books[insertCnt-1] = new Book(title,author,publish,price);
			System.out.println("�Էµ�");
		
		} else {System.out.println("���̻� �Է��� �� �����ϴ�");}
	}
	
	
	static void searchingBook(){
		if(insertCnt > 0) {
			System.out.println("�˻��� å ������ �Է� : ");
			sc.nextLine();
			String searchinTitle = sc.nextLine();
			int i;
			for(i=0;i<insertCnt;i++) {
				if(searchinTitle.equalsIgnoreCase(books[i].getTitle())) {
					System.out.println("���� : "+books[i].getAuthor()+" ���ǻ� : "+books[i].publish+" ���� : "+books[i].price);
					break;
				}
			}
			
			if(i>=insertCnt) System.out.println("�˻� å�� �����ϴ�");
		}
	}
}
