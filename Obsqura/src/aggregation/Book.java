package aggregation;

public class Book {
	String bookName;
	float bookPrice;
	Author author;
	public static void main(String[] args) {
		Author a1 = new Author("Nikki",23,"Gujarat");
		Book b1 = new Book("Terms & Truth",450.50f,a1);
		System.out.println(b1.bookName);
		System.out.println(b1.bookPrice);
		System.out.println(b1.author.aName);
		System.out.println(b1.author.aAge);
		System.out.println(b1.author.aPlace);
	}
	Book(String bName, float bPrice, Author a){
		this.bookName = bName;
		this.bookPrice = bPrice;
		this.author = a;
	}
}
