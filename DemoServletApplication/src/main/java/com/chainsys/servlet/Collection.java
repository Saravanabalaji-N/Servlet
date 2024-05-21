package com.chainsys.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Collection {

public static void insert(ServletPojo pj) throws SQLException, ClassNotFoundException{
	String query="insert into login1 values(?,?,?)";
	Connection connection=connectionDrive();
    PreparedStatement prepare=connection.prepareStatement(query);
    
    
    prepare.setString(1,pj.getName());
    prepare.setString(2,pj.getTel());
    prepare.setString(3,pj.getMail());
    prepare.executeUpdate();
//    System.out.println(pj.getName());
//System.out.println(pj.getName());
}

	public static Connection connectionDrive() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/details", "root",
				"Saravana#026");
		return connection;
}
}
