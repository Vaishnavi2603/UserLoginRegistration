package com.fujitsu.LoginAndRegistration.DAO;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class LoginDao {
	
	public boolean verifyUserCredentials(String userName, String password) {
		
		String url = "jdbc:mysql://localhost:3306/test1";
		String db_username = "root";
		String db_password = "Vaishu";
		
		Connection con;
		PreparedStatement pstmt;
		
		String sql = "select * from username where userName = ? and password = ?";
		//System.out.println(userName+password);
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(url, db_username, db_password);
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				//System.out.println("true");
				return true;
				
				}
			
		}
		catch (Exception e) {
			
			e.printStackTrace();
		}
		//System.out.println("false");
		return false;
		
	}

}
