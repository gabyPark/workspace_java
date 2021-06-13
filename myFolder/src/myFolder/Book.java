package myFolder;

public class Book {

	public String title;
	public String author;
	public String publish;

	public int price;

	Book(String title, String author, String publish, int price) {
		this.title = title;
		this.author = author;
		this.publish = publish;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
