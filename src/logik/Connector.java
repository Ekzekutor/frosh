package logik;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
	 // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://35.157.39.26:3306/kursach";
    private static final String user = "root";
    private static final String password = "my-secret-kek";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    
  
    public boolean checkBlackRegion(String region) {
    	 try {
    	con = DriverManager.getConnection(url, user, password);
		stmt = con.createStatement();
		
		String query="select type from regions where name="+region+"'";
	    rs = stmt.executeQuery(query);	
	    if (rs.next()) {
	    	if (rs.getInt("type")<2) {
	    		return true;}
	    	else return false;
	    	}
	    }
    	 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
			return false;
    }

    public ArrayList<String> getRegions(){
    	ArrayList<String> arr= new ArrayList<String>();
   	 String query = "select name from regions";
   	 try {
		con = DriverManager.getConnection(url, user, password);
		stmt = con.createStatement();
	    rs = stmt.executeQuery(query);

	        while (rs.next()) {
	            arr.add(rs.getString("name"));
	        }
	    	stmt.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
   
   	 return arr;
        // getting Statement object to execute query
      
   }
}
