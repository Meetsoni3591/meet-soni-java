package practiceproblems;
//question 4
public class BookDemo {

	public static void main(String[] args) {
		Author a = new Author("Meet","Soni");
		Author a1 = new Author("James","Gosling");
		Book b = new Book("book1 " , a, 1000.0);
		Book b1 = new Book("java " , a1, 1234.5);
		System.out.println(b);
		System.out.println(b1);

	}

}
