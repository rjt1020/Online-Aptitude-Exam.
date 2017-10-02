
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
        
        String email = request.getParameter("email");
        String pass = request.getParameter("pwd");
        
        try {
        		if(email.length()==0||pass.length()==0)
        	{
        		RequestDispatcher rs = request.getRequestDispatcher("admin.html");
        		rs.include(request, response);
        	}
        	        	
        		else if(Validate.checkAdmin(email, pass))
 				{
 				    RequestDispatcher rs = request.getRequestDispatcher("Welcome");
 				    rs.include(request, response);
 				}
 				
 			   else
 				{
 				  
 				   RequestDispatcher rs = request.getRequestDispatcher("admin.html");
 				   rs.include(request, response);
 				  out.println("<script>alert('Username or Password is incorrect. Try again');</script>");
 				}
 				
        	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}

