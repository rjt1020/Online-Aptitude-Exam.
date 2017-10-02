import javax.servlet.annotation.WebServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;


    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
	
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pass = request.getParameter("pwd");
        String mobile = request.getParameter("mobile");
        String secret=request.getParameter("secret");
    	String qualification=request.getParameter("qualification");
    	String domain=request.getParameter("domain");
    	String experience=request.getParameter("experience");
        try{

        Class.forName("com.mysql.jdbc.Driver");

        Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/exam","root","root");
         if(Validate.existingUser(email))
			{
			    RequestDispatcher rs = request.getRequestDispatcher("userExists.html");
			    rs.include(request, response);
			}
			
		   else
			{
			   PreparedStatement ps=con.prepareStatement("insert into reg values(?,?,?,?,?,?,?,?)");

		        ps.setString(1, name);
		        ps.setString(2, email);
		        ps.setString(3, pass);
		        ps.setString(4, mobile);
		        ps.setString(5, secret);
		        ps.setString(6, qualification);
		        ps.setString(7, domain);
		        ps.setString(8, experience);
		        int i=ps.executeUpdate();
		        
		          if(i>0)
		          {
		        	  RequestDispatcher rs = request.getRequestDispatcher("welcome.html");
					    rs.include(request, response);
		          }
		        
		        }
			}
      
        catch(Exception se)
        {
            se.printStackTrace();
        }
	
      }
  }