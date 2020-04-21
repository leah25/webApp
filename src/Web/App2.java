package Web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class App2 extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String firstName =req.getParameter("first");
		String secondName = req.getParameter("second");
		String fullName = firstName+" "+ secondName;
		
		// Session management:- used to share data between servlets
				//req.setAttribute("fullName", fullName);
		
		// when calling another servlet we use Request Dispatcher/ Redirect
	
			//RequestDispatcher  rd = req.getRequestDispatcher("Ex");
			//rd.forward(req, res);
		
		//redirect- client/browser is informed
		//Cookie cookie = new Cookie("fullName",fullName);
		//res.addCookie(cookie);
		//res.sendRedirect("Ex");
		
		PrintWriter out = res.getWriter();
		out.println("Name is:" + fullName);
		
	}

}
