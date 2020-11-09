import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class HelloServlet implements Servlet{
	public void init(ServletConfig config) throws ServletException {
		
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("你好，世界。你好，Servlet！");
	}
	
	public void destroy(){
		
	}
	
	public String getServletInfo(){
		return null;
	}
	
	public ServletConfig getServletConfig(){
		return null;
	}
}