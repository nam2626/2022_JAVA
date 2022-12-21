package dao;

public class StudentDAO {
	private static StudentDAO instance = new StudentDAO();

	private StudentDAO() {	}

	public static StudentDAO getInstance() {
		if(instance != null)
			instance = new StudentDAO();
		return instance;
	}

	
}
