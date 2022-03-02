package controllers.filter;
import javax.servlet.ServletResponse;
import javax.servlet.ServletRequest;
import javax.servlet.Filter;
import java.io.IOException;
import javax.servlet.FilterConfig;
import javax.servlet.FilterChain;
import javax.servlet.Filter;
import javax.servlet.ServletException;
import java.io.PrintWriter;
public class MyFilter implements Filter
{
	@Override
	public void init(FilterConfig filterConfig)throws ServletException{

	}

	@Override
	public void doFilter(ServletRequest req,ServletResponse resp,FilterChain chain)throws IOException,ServletException
	{
     PrintWriter out=resp.getWriter();  
    out.print("filter is invoked before");  
          
    chain.doFilter(req, resp);//sends request to next resource  
          
    out.print("filter is invoked after");  
	}

	@Override
	public void destroy()
	{

	}


}