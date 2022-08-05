package dec_add_0318;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class add
 */
@WebServlet("/add")
public class add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add() {
        super();
        // TODO Auto-generated constructor stub
    }
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		
		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		
		out.println("<form>");
		out.println( "<h2>2 + 1 = " + add(2,1) +"</h2>");
		out.println( "<h2>3 + 1 = " + add(3,1) +"</h2>");
		out.println( "<h2>4 + 1 = " + add(4,1) +"</h2>");
		out.println( "<h2>5 + 1 = " + add(5,1) +"</h2>");
		
		out.println("</form>");
		
		out.println("</body>");
		out.println("</head>");
		out.println("<html>");

	}
	  private int add(int num1,int num2) {
	    	return  num1 +num2;
	    	
	    }
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
