package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getpost")
public class test extends HttpServlet{
	
	
	
   private static final long serialVersionUID= 1L;
   private int nbrOfVisitors;
	
	@Override
	public void init() {
		nbrOfVisitors=1;
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nom=req.getParameter("nom") ;
		PrintWriter out=resp.getWriter();
		out.println("<html><body>");
		//out.println("<h1>"+nom+"<h1>");
		out.println(" hello monsieur  "+nom);
		//out.println("<li> nom ="+nom+"</li>");
		//out.println("<li> protocole ="+req.getProtocol()+"</li>");
		//out.println("<li> IP client = "+req.getRemoteAddr()+"</li>");
		out.println("</body></html>");
	}
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			String nom=req.getParameter("nom") ;
			out.println("<html><body>");
			//out.println("<h1>"+nom+"<h1>");
			out.println(" Welcome bro   "+nom);
			out.println("vous etes le visiteur n£ "+nbrOfVisitors);
			
			out.println("</body></html>");
			nbrOfVisitors++;
			
		}

}
