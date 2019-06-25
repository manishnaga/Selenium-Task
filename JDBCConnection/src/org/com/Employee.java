package org.com;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
        Connection con=null;
		try {
			//load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//connect to db-open
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
			//write sql query
	        String sql="select * from automation";
	        //prepare the statement
	        PreparedStatement ps = con.prepareStatement(sql);
	        //execute query
	        ResultSet rs = ps.executeQuery();
	        //iterate the results
	        while(rs.next()) {
	        	String firstname = rs.getString("first_name");
	        	String lastname = rs.getString("last_name");
	        	String address = rs.getString("address");
	        	String email = rs.getString("email");
	        	String phone = rs.getString("phone");
	        	String gender = rs.getString("gender");
	        	String hobbies = rs.getString("hobbies");
	        	String language = rs.getString("language");
	        	String skills = rs.getString("skills");
	        	String country = rs.getString("country");
	        	String dob = rs.getString("dob");
	        	String password = rs.getString("password");
	        	String confirmpassword = rs.getString("confirm_password");
	        	System.out.println(firstname);
	        	System.out.println(lastname);
	        	System.out.println(address);
	        	System.out.println(email);
	        	System.out.println(phone);
	        	System.out.println(gender);
	        	System.out.println(hobbies);
	        	System.out.println(language);
	        	System.out.println(skills);
	        	System.out.println(country);
	        	System.out.println(dob);
	        	System.out.println(password);
	        	System.out.println(confirmpassword);
	        }
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
		//close db
			try {
				con.close();
		}
			catch (SQLException e) {
				e.printStackTrace();
			}
	
		}
	}
}
