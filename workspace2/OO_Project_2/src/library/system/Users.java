package library.system;


import java.lang.String;
public class Users {
	private LibSystem system;
	private int UserID = 0;
	private boolean Registered = false;
	public int GetUserID() {
		return UserID;
	}
	public void SetUserID(int ID) {
		UserID = ID;
	}
	public boolean GetRegistered() {
		return Registered;
	}
	public void SetRegistered(boolean status) {
		Registered = status;
	}
	public Users(int id, boolean registered) {
		UserID = id;
		Registered = registered;
	}

}
