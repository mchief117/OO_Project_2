package library.system;

public class ConferencePapers extends Book {

	private int FirstPage = 0;
	private int LastPage = 0;
	public int GetFirstPage() {
		return FirstPage;
	}
	public void SetFirstPage(int page) {
		FirstPage = page;
	}
	public int GetLastPage() {
		return LastPage;
	}
	public void SetLastPage(int page) {
		LastPage = page;
	}
	public ConferencePapers(String title, int copies, String publisher, int id, String author, String number, int firstpage, int lastpage) {
		super(title, copies, publisher, id, author, number);
		FirstPage = firstpage;
		LastPage = lastpage;
	}
}
