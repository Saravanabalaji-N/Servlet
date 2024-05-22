package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.util.DatabaseConnection;
import model.SignupPojo;

public  class SignupPageDAO {
  
	public static void insert(SignupPojo pj) throws ClassNotFoundException, SQLException {
		
		Connection connection = DatabaseConnection.connectionDrive();
		String query="insert into login1 values(?,?,?)";
		PreparedStatement Pst=connection.prepareStatement(query);
		Pst.setString(1, pj.getName());
		Pst.setString(2, pj.getTel());
		Pst.setString(3, pj.getMail());
		System.out.println(pj.getName());
		System.out.println(pj.getTel());
		int rows=Pst.executeUpdate();
		System.out.println(rows+"inserted");

	}
	   
	public static ArrayList<SignupPojo> read() throws ClassNotFoundException, SQLException {
		ArrayList<SignupPojo> list=new ArrayList<SignupPojo>();
		SignupPojo pj = new SignupPojo();
		Connection connection =DatabaseConnection.connectionDrive();
        
        String query = "Select * from login1";
        PreparedStatement prepare = connection.prepareStatement(query);
        
        ResultSet rs=prepare.executeQuery();
        
        while(rs.next()) {
            
            pj.setName(rs.getString("Username"));
            pj.setTel(rs.getString("PhoneNo"));
            pj.setMail(rs.getString("MailId"));
            

            
       
        

            System.out.println(list);
        }
        list.add(pj);
        return list;
        
        
        
    }

}
