package ch6;

public class Book {

	// 필드
	private String author;
	int price;
	String title;
	
	// 생성자
	public Book(String author, int price, String title) {
		this.author = author;
		this.price = price;
		this.title = title;
	}

	
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	
}


