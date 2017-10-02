

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Forgot
 */
@WebServlet("/forgot")
public class Forgot extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String email = request.getParameter("email");
        String secret = request.getParameter("secret");
        
        try {
        	if(email.length()==0||secret.length()==0)
        	{
        		RequestDispatcher rs = request.getRequestDispatcher("forgot.html");
 			   rs.include(request, response);
        	}
 			else if(Validate.checkPassword(email, secret))
 				{
 				    RequestDispatcher rs = request.getRequestDispatcher("passReset.html");
 				    rs.include(request, response);
 				}
 				
 			   else
 				{
 				   RequestDispatcher rs = request.getRequestDispatcher("wrongDetails.html");
 				   rs.include(request, response);
 				}
 				
        	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	}

