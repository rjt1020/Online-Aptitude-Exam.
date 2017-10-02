import java.sql.*;

public class Validate
 {
     public static boolean checkUser(String email,String pass) 
     {
      boolean st =false;
      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","root");
         Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery("Select * from reg");
         while(rs.next()) {
			 String n = rs.getString(2);
			 String p = rs.getString(3);
			 
			if(n.equals(email) && p.equals(pass))
			{	
				st=true;
				break;
			}
	}
        
      }catch(Exception e)
      { 
          e.printStackTrace();
      }
         return st;                 
  }

	public static boolean checkPassword(String email, String secret) {
		// TODO Auto-generated method stub
		boolean st =false;
	      try{

		 //loading drivers for mysql
	         Class.forName("com.mysql.jdbc.Driver");

	 	 //creating connection with the database 
	         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","root");
	         Statement stmt=con.createStatement();
	         ResultSet rs=stmt.executeQuery("Select * from reg");
	         while(rs.next()) {
				 String n = rs.getString(2);
				 String p = rs.getString(5);
				 
				if(n.equals(email) && p.equals(secret))
				{	
					st=true;
					break;
				}
		}
	        
	      }catch(Exception e)
	      { 
	          e.printStackTrace();
	      }
		return st;
	}

	public static boolean existingUser(String email) {
		// TODO Auto-generated method stub
		boolean st = false;
	      try{

		 //loading drivers for mysql
	         Class.forName("com.mysql.jdbc.Driver");

	 	 //creating connection with the database 
	         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","root");
	         Statement stmt=con.createStatement();
	         ResultSet rs=stmt.executeQuery("select * from reg");
	         while(rs.next())
	         {
	        	 String s=rs.getString(2);
	        	 if(s.equals(email))
	        	 {
	        		 st=true;
	        		 break;
	        	 }
	        
	         }
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return st;
}

	public static boolean checkAdmin(String email, String pass) {
		// TODO Auto-generated method stub
		boolean st =false;
	      try{

		 //loading drivers for mysql
	         Class.forName("com.mysql.jdbc.Driver");

	 	 //creating connection with the database 
	         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","root");
	         Statement stmt=con.createStatement();
	         ResultSet rs=stmt.executeQuery("Select * from admin");
	         while(rs.next()) {
				 String n = rs.getString(1);
				 String p = rs.getString(2);
				 
				if(n.equals(email) && p.equals(pass))
				{	
					st=true;
					break;
				}
		}
	        
	      }catch(Exception e)
	      { 
	          e.printStackTrace();
	      }
	         return st; 
	}}