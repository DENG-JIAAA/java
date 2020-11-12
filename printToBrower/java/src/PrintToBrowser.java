import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;


public class PrintToBrowser implements Servlet {
    public void init(ServletConfig config) throws ServletException {
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>outToBrowser</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1 style=\"color: blue;\" align=\"center\">Hello, HTML string output to browser!!</h1>");
        out.print("<p>一行中文字符串！！</p>");
        out.print("</body>");
        out.print("</html>");

    }

    public void destroy() {
    }

    public String getServletInfo() {
        return null;
    }

    public ServletConfig getServletConfig() {
        return null;
    }
}