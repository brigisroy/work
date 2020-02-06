package backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class register extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		MyBeanClass obj = new MyBeanClass();
		PrintWriter out = res.getWriter();
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		out.println(obj.register(username, password));
		
		
	}
}
