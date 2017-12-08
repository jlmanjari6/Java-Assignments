/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc02;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
import java.sql.*;

public class JDBC02
{
  public static void main(String[] args)
  {
	 Connection conn = null;
	 String url = "jdbc:oracle:thin:@localhost:1521/orclpdb";
	 try
	 {
		conn = DriverManager.getConnection(url, "hr", "hr");
		System.out.println("Success!");
	 }
	 catch (SQLException ex)
	 {
		System.out.println("Problems getting a connection");
	 }
	 
	 try
	 {
		PreparedStatement updateZipCode =
		  conn.prepareStatement(
		  "update tblStudent set zip = ? where city = ?");
		System.out.println("PreparedStatement created");
		updateZipCode.setString(1,"55555");
		updateZipCode.setString(2, "Maryville");
		updateZipCode.executeUpdate();
		System.out.println("PreparedStatement executed");
	 }
	 catch(SQLException ex)
	 {
		System.out.println("Problems with PreparedStatement");
	 }
	 try
	 {
//		CallableStatement updateGpaStmt =
//		  conn.prepareCall("call update_gpa(944, 1.5)");
// OR
// If you want to use parameters
             CallableStatement updateGpaStmt =
                     conn.prepareCall("call update_gpa(?,?)");
             updateGpaStmt.setInt(1,944);
             updateGpaStmt.setDouble(2,1.5);
		System.out.println("CallableStatement created");
		updateGpaStmt.executeUpdate();
		System.out.println("CallableStatement executed");
	 }
	 catch(SQLException ex)
	 {
		System.out.println("Problems with CallableStatement");
	 }
	 
	 if(conn != null)
	 {
		try
		{
		  conn.close();
		  System.out.println("Connection closed");
		}
		catch (SQLException ex)
		{
		  System.out.println("Problems closing connection");
		}
	 }
  }
}
