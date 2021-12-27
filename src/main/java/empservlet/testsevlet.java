package empservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Employee;


@WebServlet("/newone")
public class testsevlet extends HttpServlet{
	
	private static final long serialVersionUID=1L;
	
	private List<Employee> emp;
	
	@Override
	public void init() {
		emp=new ArrayList<Employee>();
		emp.add(new Employee(1,"nom1","prenom1","dep1"));
		emp.add(new Employee(2,"nom2","prenom2","dep2"));
		emp.add(new Employee(3,"nom3","prenom3","dep3"));
       }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		pw.println("<html><body>");  
		pw.println("<h2>List des employés</h2>");  
		pw.println("<table>");  
		pw.println("<tr>");  
		pw.println("<th>");
		pw.println("Id");
		pw.println("</th>");  
		pw.println("<th>");  
		pw.println("Prenom");
		pw.println("</th>");  
		pw.println("<th>");  
		pw.println("Nom");
		pw.println("</th>");  
		pw.println("<th>");  
		pw.println("Département");
		pw.println("</th>");  
		pw.println("</tr>");  
		
		for(Employee e : emp){
	    pw.println("<tr>");
		pw.println("<td>");
		pw.println(e.getId());
		pw.println("</td>");
		pw.println("<td>");
		pw.println(e.getFname());
		pw.println("</td>");
		pw.println("<td>");
		pw.println(e.getLname());
		pw.println("</td>");
		pw.println("<td>");
		pw.println(e.getDep());
		pw.println("</td>");
		pw.println("</tr>");
		
		}
		
		
		pw.println("</table>");
		pw.println("<br/><br/>");
		pw.println("<a href=\""+getServletContext().getContextPath()+"\">Accueil</a>");
		pw.println("</body></html>");  
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String firstName=req.getParameter("fname");
		String lastName=req.getParameter("lname");
		String department=req.getParameter("dep");
		
		emp.add(new Employee(id, firstName, lastName, department));
		
		doGet(req, resp);
	}
}
