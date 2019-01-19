package cours01;

public class Book {
	
	private String title;
	private String author;
	private int page;
	
	public Book(String title, String author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	public Book() {
	}

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.title = "A la recherche du temps perdu";
		book1.author = "Proust";
		book1.page = 1800;
		
		Book book2 = new Book();
		book2.title = "Le trône de fer";
		book2.author = "George R. R. Martin";
		book2.page = 1900;
		
	}

	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", page=" + page + "]";
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

	public double getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
	

}
