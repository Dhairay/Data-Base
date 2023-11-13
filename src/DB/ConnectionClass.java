/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;
import java.sql.*;
/**
 *
 * @author My Pc
 */
public class ConnectionClass 
{
Connection conn;              //To Establish connect with DB
PreparedStatement pst;        //To Prepare a Statement in JAVA
ResultSet rst;                //To fetch a values of select statement

public void Connect()
{
    try
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Student;integratedSecurity=true");
	       System.out.println("Connected");       
    }
     catch(Exception ex)
    {
        System.out.println("Error in connection"+ex);
    }
}
public void DisConnect()
{
    try
    {
        conn.close();
        System.out.println("Dissconnected");        
    }
    catch(Exception ex)
    {
        System.out.println("Error in Dissconnection"+ex);
    } 
}
/*void ShowData()
{
    try
    {
     pst=conn.prepareStatement("Select * from tbCustomer");
     rst=pst.executeQuery();
     while(rst.next())
     {
         System.out.println(rst.getString(1));
         System.out.println(rst.getString(2));
         System.out.println(rst.getString(3));
         System.out.println(rst.getString(4));
         System.out.println(rst.getString(5));
        
        
     }
     rst.close();
    } 
    catch(Exception ex)
    {
        System.err.println("Error in show table"+ex);
    }
}*/
public static void main(String [] args)
{
ConnectionClass cobj=new ConnectionClass();
cobj.Connect();
//cobj.ShowData();
cobj.DisConnect();

}
}
