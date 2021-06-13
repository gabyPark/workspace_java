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
			System.out.println("1.도서 정보 입력 | 2. 책 검색 | 3. 종료");
			System.out.println("--------------------------------");
			System.out.println("메뉴 선택 > ");
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
		System.out.println("프로그램 종료");
	}
	
	static void insertBook() {
		if(insertCnt < books.length) {
			insertCnt++;
			sc.nextLine();
			System.out.println("도서명 입력 : ");
			String title = sc.nextLine();
			System.out.println("저자 입력 : ");
			String author = sc.nextLine();
			System.out.println("출판사 입력 : ");
			String publish = sc.nextLine();
			System.out.println("가격 입력 : ");
			int price = sc.nextInt();
			
			books[insertCnt-1] = new Book(title,author,publish,price);
			System.out.println("입력됨");
		
		} else {System.out.println("더이상 입력할 수 없습니다");}
	}
	
	
	static void searchingBook(){
		if(insertCnt > 0) {
			System.out.println("검색할 책 제목을 입력 : ");
			sc.nextLine();
			String searchinTitle = sc.nextLine();
			int i;
			for(i=0;i<insertCnt;i++) {
				if(searchinTitle.equalsIgnoreCase(books[i].getTitle())) {
					System.out.println("저자 : "+books[i].getAuthor()+" 출판사 : "+books[i].publish+" 가격 : "+books[i].price);
					break;
				}
			}
			
			if(i>=insertCnt) System.out.println("검색 책이 없습니다");
		}
	}
}
