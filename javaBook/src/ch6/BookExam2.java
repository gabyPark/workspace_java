package ch6;

public class BookExam2 {

	public static void main(String[] args) {
		
		
		
	Book b1 = new Book("���", 10000, "�����");
	Book b2 = new Book("�����ϱ�", 10000, "������");
	Book b3 = new Book("ȫ�浿", 20000, "���");
		
	b1.setPrice(20000);
	
	System.out.println(b1.getTitle()+" "+b1.getAuthor()
						+" "+b1.getPrice());
	System.out.println(b2.title+" "+b2.getAuthor()+" "+b2.price);
	System.out.println(b3.title+" "+b3.getAuthor()+" "+b3.price);

	}

}
