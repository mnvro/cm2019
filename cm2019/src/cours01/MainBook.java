package cours01;

public class MainBook {

	public static void main(String[] args) {
		Book book1 = new Book("A la recherche du temps perdu","Proust",1800);
		
		//Book book2 = new Book("Le trône de fer", "George R. R. Martin",1900);
		System.out.println(book1);
		
		Book book2 = new Book("Le thrône de fer","Martin", 1900);
		System.out.println(book2);
		
	}

}
