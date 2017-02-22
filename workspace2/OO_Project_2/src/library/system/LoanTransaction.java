package library.system;


import java.lang.String;
public class LoanTransaction {

	private LibSystem system;
	private String DocumentTitle;
	private int UserID = 0;
	private String DueDate;
	private int TransactionID = 0;
	public String GetDocumentTitle() {
		return DocumentTitle;
	}
	public void SetDocumentTitle(String title) {
		DocumentTitle = title;
	}
	public int GetUserID() {
		return UserID;
	}
	public void SetUserID(int id) {
		UserID = id;
	}
	public String GetDueDate() {
		return DueDate;
	}
	public void SetDueDate(String date) {
		DueDate = date;
	}
	public int GetTransactionID() {
		return TransactionID;
	}
	public void SetTransactionID (int id) {
		TransactionID = id;
	}
	public LoanTransaction(String title, int user, String date, int transaction) {
		DocumentTitle = title;
		UserID = user;
		DueDate = date;
		TransactionID = transaction;
	}

}
