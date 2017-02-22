package library.system;

public class Staff extends Users {

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
	public Staff(int id, boolean registered) {
		super(id, registered);
	}

}
