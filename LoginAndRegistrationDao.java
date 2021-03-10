package com.fujitsu.LoginAndRegistration.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.fujitsu.LoginAndRegistration.model.User;

public class LoginAndRegistrationDao {
	
	public boolean registrationUser(User user) {
		
		System.out.println("Start of UserRegistrationDAO :: RegisterUser");
		
		String url = "jdbc:mysql://localhost:3306/test1";
		String db_username = "root";
		String db_password = "Vaishu";
		
		Connection con;
		PreparedStatement pstmt;
		
		String sql = "insert into username value(?,?,?,?,?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(url,db_username,db_password);
			pstmt = ((java.sql.Connection) con).prepareStatement(sql);
			pstmt.setInt(1, user.getId());
			pstmt.setString(2, user.getUserName());
			pstmt.setString(3, user.getPassword());
			pstmt.setInt(4, user.getPhone());
			pstmt.setString(5, user.getAddress());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0)
				return true;
			}
		
		catch(Exception e) {
				e.printStackTrace();
			}
		
		System.out.println("End of UserRegistrationDA0 :: registerUser");
		return false;
			
		}
		
}
