package library.system;

public class Faculty extends Users {

	private int BorrowLimit = 12;
	private int NumberBorrowed = 0;

	public int GetBorrowLimit() {
		return BorrowLimit;
	}

	public int GetNumberBorrowed() {
		return NumberBorrowed;
	}

	public void SetNumberBorrowed(int number) {
		NumberBorrowed = number;
	}
	public Faculty(int id, boolean registered) {
		super(id, registered);
	}
}
