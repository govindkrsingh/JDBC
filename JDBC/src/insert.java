
// how to insert data in database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class insert {
	public static void main(String[] args) throws Exception  {
		
		//load driver class
		Class.forName("com.mysql.jdbc.Driver");
		
		//get connection object
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/transport", "root", "govi9771");

		// get statement
		Statement st = conn.createStatement();
		String sql = "insert into BUS values('Govind','AC','new delhi','patna','20.30')";
		
		// excute sql statement
		int r = st.executeUpdate(sql);
		System.out.println(r + " records inserted inside table");

		// close the session
		conn.close();

		
		

	}

}
