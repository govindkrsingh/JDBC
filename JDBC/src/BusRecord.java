import java.sql.*;

public class BusRecord {
	public static void main(String[] args) throws Exception {
		// load driver class
				Class.forName("com.mysql.jdbc.Driver");
				// get connection object
				Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/transport", "root", "govi9771");
				// get statement
				Statement st = conn.createStatement();
				// execute sql statement
				// note: all the data of table is stored inside Result set
				ResultSet rs = st.executeQuery("select * from BUS");

while (rs.next())
{	

	// fetch all the coloms of this record


String i = rs.getString("Name");
String n = rs.getString("BusType");
String a = rs.getString("FromDestination");
String pp = rs.getString("ToDestination");
float p = rs.getFloat("Time");

System.out.println("name " + i);
System.out.println("bus type " + n);
System.out.println("from destination " + a);
System.out.println("to destination " + pp);
System.out.println("time " + p + " IND");
}

// close the session
conn.close();
		
		
	}

}
