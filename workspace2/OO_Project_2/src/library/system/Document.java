package library.system;


import java.lang.String;
public class Document {

	protected String Title;
	protected String Author; //TODO implement for multiple authors
	protected String Publisher;
	protected int NumberOfCopies = 0;
	private LibSystem system;
	protected int DocumentID = 0;
	public String GetTitle() {
		return Title;
	}
	public void SetTitle(String title) {
		Title = title;
	}
	public int GetNumberOfCopies() {
		return NumberOfCopies;
	}
	public void SetNumberOfCopies(int copies) {
		NumberOfCopies = copies;
	}
	public String GetPublisher() {
		return Publisher;
	}
	public void SetPublisher(String publisher) {
		Publisher = publisher;
	}
	public int GetDocumentID() {
		return DocumentID;
	}
	public void SetDocumentID(int id) {
		DocumentID = id;
	}
	public String GetAuthor() {
		return Author;
	}
	public void SetAuthor(String author) {
		Author = author;
	}
	public Document(String title, int copies, String publisher, int id, String author) {
		Title = title;
		NumberOfCopies = copies;
		Publisher = publisher;
		DocumentID = id;
		Author = author;
	}
}
