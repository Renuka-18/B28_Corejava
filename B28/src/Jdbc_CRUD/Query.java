package Jdbc_CRUD;

public class Query {
	
	
	
	// for inserting the data
	public static String insertStudentQuery() {
	return	"INSERT INTO student(stdName,dept,gpa) VALUES(?,?,?)";//'?'placeholder are used to allocate the dynamic values
	}
	
	//for retrieving the data
	
	
	public static String selectAllStudentQuery() {
		return "SELECT * FROM student";
	}



}