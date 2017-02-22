package library.system;


import java.lang.String;
public class Book extends Document {

	private String ISBN;
	public String GetISBN() {
		return ISBN;
	}
	public void SetISBN(String number) {
		ISBN = number;
	}
	public Book(String title, int copies, String publisher, int id, String author, String number) {
		super(title, copies, publisher, id, author);
		ISBN = number;
	}
}
