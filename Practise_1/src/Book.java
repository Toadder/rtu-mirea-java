public class Book {
	private String name;
	private String author;
	private int pageQty;

	// Constructor
	public Book(String name, String author, int pageQty) {
		this.name = name;
		this.author = author;
		this.pageQty = pageQty;
	}

	public Book(String name, String author) {
		this.name = name;
		this.author = author;
		this.pageQty = 0;
	}
	// /Constructor

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPageQty(int pageQty) {
		this.pageQty = pageQty;
	}
	// /Setters

	// Getters
	public String getName() {
		return this.name;
	}

	public String getAuthor() {
		return this.author;
	}

	public int getPageQty() {
		return this.pageQty;
	}
	// /Getters

	// toString
	public String toString() {
		return "Book ==> name: " + this.name + " | author: " + this.author + " | pages: " + this.pageQty;
	}
	// /toString
}
