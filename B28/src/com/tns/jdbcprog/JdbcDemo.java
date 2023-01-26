package com.tns.jdbcprog;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
          try {
			Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/b28","root","kavyaishu@18");
		    Statement st=Conn.createStatement();
		    String str ="select Title, Price, Qty, Bookscol from books_det";
		    System.out.println("The Sql Statement is"+str+"\n");
		    ResultSet rs=st.executeQuery(str);
		    System.out.println("the results are:");
		    int rowCount=0;
		    while(rs.next()) {
		    	String title=rs.getString("Title");
		    	double price=rs.getDouble("Price");
		    	int qty=rs.getInt("Qty");
		    	int bokc=rs.getInt("Bookscol");
		    	System.out.println(title+"   ,"+price+"   ,"+qty+"   ,"+bokc+"   ");
		    	++rowCount;

		    	
		    }
          
          
          } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
