package pe.eggc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet({"/Sumar","/Restar","/Multiplicar"})
public class Mate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
	{
	String path=request.getServletPath();
	System.out.println(path);
	if(path.equals("/Sumar"))
	{
		sumar(request,response);		
		
	}
	else if (path.equals("/Restar")){
		
		restar(request,response);			
	}
	else if (path.equals("/Multiplicar")){
		multiplicar(request,response);			
	}
	
	}
	
	
	 void restar (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Datos
		int num1= Integer.parseInt(request.getParameter("n1"));
		int num2= Integer.parseInt(request.getParameter("n2"));
		
		//Proceso
		int resta = num1-num2;
		
		//reporte
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Restar</title>");
		out.println("</head>");
		out.println("<h1>RESTAR</h1>");
		out.println("<p>Numero 1:" + num1+ "</p>");
		out.println("<p>Numero 2:" + num2+ "</p>");
		out.println("<p>Resta:" +resta+  " </p> ");
		out.println("</body>");
		out.println("</html>");
	}
 void multiplicar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Datos
		int num1= Integer.parseInt(request.getParameter("n1"));
		int num2= Integer.parseInt(request.getParameter("n2"));
		
		//Proceso
		int multiplicar = num1*num2;
		
		//reporte
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Multiplicar</title>");
		out.println("</head>");
		out.println("<h1>MULTIPLICAR</h1>");
		out.println("<p>Numero 1:" + num1+ "</p>");
		out.println("<p>Numero 2:" + num2+ "</p>");
		out.println("<p>Multiplicar" +multiplicar+  " </p> ");
		out.println("</body>");
		out.println("</html>");
	}
	
	 void sumar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Datos
		int num1= Integer.parseInt(request.getParameter("n1"));
		int num2= Integer.parseInt(request.getParameter("n2"));
		
		//Proceso
		int suma = num1+num2;
		
		//reporte
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Sumar</title>");
		out.println("</head>");
		out.println("<h1>SUMAR</h1>");
		out.println("<p>Numero 1:" + num1+ "</p>");
		out.println("<p>Numero 2:" + num2+ "</p>");
		out.println("<p>Suma:" +suma+  " </p> ");
		out.println("</body>");
		out.println("</html>");
	}

}
