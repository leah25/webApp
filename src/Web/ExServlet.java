/**package Web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex")
public class ExServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		//fetching from request object
		
		//the client receives the cookie as a request
		Cookie cookies[] = req.getCookies();
		for(Cookie c: cookies) {
			if(c.getName().equals("fullName")) {
				
				String fullName = c.getValue();
				}
		}
		
		
		 String fullName =(String)req.getAttribute("fullName");
		
		PrintWriter out = res.getWriter();
		
		out.println("Name: " +fullName );
	}

}*/
