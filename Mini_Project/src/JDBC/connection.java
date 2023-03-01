package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;

public class connection 
{
	public static void main(String[] args) 
	{
		student vs = new student(); 
		
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","pavi@1234"); 
			Statement ss=(Statement) con.createStatement();
			ResultSet rs=ss.executeQuery("select Name, Paid_amount, Balance, Status from student2 where ID = 1001"); 
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"    	 "+rs.getString(2)+"    	 "+rs.getString(3)+"  	     "+rs.getString(4));
			}
					
		} catch (Exception e) { 
			System.out.println(e);
		}

		try 
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","pavi@1234"); 
			Statement ss=(Statement) con.createStatement();
			ResultSet rs=ss.executeQuery("select * from student2"); 
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"    	 "+rs.getString(2)+"    	 "+rs.getString(3)+"  	     "+rs.getString(4)+"       "+rs.getString(5)+"            "+rs.getString(6)+"           "+rs.getString(7));
			}
					
		} catch (Exception e) { 
			System.out.println(e);
		}
		
		
	}}
