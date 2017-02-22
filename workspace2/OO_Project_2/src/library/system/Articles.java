package library.system;

public class Articles extends Journal {

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
	public Articles(String title, int copies, String publisher, int id, String author, int volume, int issue, int firstpage, int lastpage) {
		super(title, copies, publisher, id, author, volume, issue);
		FirstPage = firstpage;
		LastPage = lastpage;
	}
}


