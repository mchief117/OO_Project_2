package library.system;

import java.io.*;
import java.util.Scanner;

public class LibSystem {
	
	//Defining how to read them as a string. will be comma delimited
	private Users[] listUsers;
	//(S or F or St),(User ID),(# of books borrowed), (List of Book ID)
	//User type     , User ID ,
	private Document[] listOfDocuments;
	//(B , CP, J, A),                  (DOcument_ID),// have the rest appropraite attributes depending on class   
	//(bbok/confpaper/journal/article),             , 
	private LoanTransaction[] listOfTransactions;
	//
	
	public static Integer input_from_console_int()
	{
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		return num;
	}
	
	/**public static void borrow(int BookID, int UserID)
	{
		
	}
	*/
	
	public static void main(String [ ] args)
	{
		//TODO read in from 3 different text file
		//1 for Users, Documents, and Transactions
		//Also have filenotfound exception handled
		
		//Asking user for input
	    System.out.println("Press 0 for Non-User or Press 1 for user!");
	    //Getting INput have it run a while loop so we can get correct input
	    boolean user_or_not = false;
	    while(user_or_not == false)
	    {
	    	int input;
	    	input = input_from_console_int();
	    	if ((input == 1)||(input == 0))
	    	{
	    		user_or_not = true;
	    	}
	    	//Have an elseif for 000 so you can exit the program
	    	else
	    	{
	    		System.out.println("Incorrect Input please either press 0 or 1");
	    	}
	    	
	    }
	    //Instantiate a user_student
	    Students s1 = new Students(111,true);
	    //Instantiate a book
	    Book s1_book = new Book("Fantastic Beasts and where to find them",1,"UK",101,"J.K Rowling","123456789");
	    
	    //TODO ask for USer ID and confirm its a real user
	    System.out.println("Press 0 for Search, 1 for Return, 2 for Borrow");
	    boolean user_option = false;
	    while(user_option == false)
	    {
	    	int input;
	    	input = input_from_console_int();
	    	if ((input == 0)||(input == 1)||(input == 2))
	    	{
	    		user_option = true;
	    	}
	    	//Have an elseif for 000 so you can exit the program
	    	else
	    	{
	    		System.out.println("Incorrect Input please either press 0 or 1 or 2");
	    	}
	    	
	    }
	    
	    //Call the Borrow function and 
	    // public static void borrow(BookID,UserID)
	    
	    //First step check to see if there is a book like that
	    
	    
	}

}
