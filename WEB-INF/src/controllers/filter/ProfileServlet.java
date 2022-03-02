package controllers.filter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;
public class ProfileServlet extends HttpServlet
{
     
      
       protected void doGet(HttpServletRequest request, HttpServletResponse   response) throws ServletException, IOException 
       {
        PrintWriter out=response.getWriter();
        System.out.println("Profile Servlet Executed");
        response.setContentType("text/html");
        out.println("<h1>This is Profile Page</h1>");
        out.println("<h1>This is ProfileServlet</h1>");

        }
}