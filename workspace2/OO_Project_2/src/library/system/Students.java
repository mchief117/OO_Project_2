package library.system;

public class Students extends Users {

	private int BorrowLimit = 6;
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
	public Students(int id, boolean registered) {
		super(id, registered);
	}

}
