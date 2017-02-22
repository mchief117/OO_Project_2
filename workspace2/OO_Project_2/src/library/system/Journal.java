package library.system;

public class Journal extends Document {

	protected int Volume = 0;
	protected int Issue = 0;
	public int GetVolume() {
		return Volume;
	}
	public void SetVolume(int volume) {
		Volume = volume;
	}
	public int GetIssue() {
		return Issue;
	}
	public void SetIssue(int issue) {
		Issue = issue;
	}
	public Journal(String title, int copies, String publisher, int id, String author, int volume, int issue) {
		super(title, copies, publisher, id, author);
		Volume = volume;
		Issue = issue;
	}
}
