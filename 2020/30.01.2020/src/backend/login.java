package backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		MyBeanClass obj = new MyBeanClass();
		PrintWriter out = res.getWriter();
		String username = req.getParameter("log_username");
		String password = req.getParameter("log_password");

		out.println(obj.login_fn(username, password));
		
	}
}