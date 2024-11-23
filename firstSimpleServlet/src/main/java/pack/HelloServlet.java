package pack;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;


/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
//	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
//    public HelloServlet() {
//        super();
        // TODO Auto-generated constructor stub
//    }

    //@Override
	String output="Hello world of Servlet";
	public void init() throws ServletException{
		
	}
    protected void doGet(HttpServletRequest req,HttpServletResponse res)
    throws ServletException,IOException{
    	res.setContentType("text/html");
    	PrintWriter out=res.getWriter();
    	out.println(output);
    	out.println("<h1>"+"Prajwal"+"</h1>");
    }
    public void destroy(){
    	System.out.println("Execution is complete");
    }
}
