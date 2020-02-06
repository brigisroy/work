package backend;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MyBeanClass {
	static String JdbcString, Username, Password, DbName, TableName;
	Connection con = null;

	public static void Property_File_Reader() throws Exception {
		FileReader read = new FileReader("/home/developer/workspace_new/ServletsBeans/Config.properties");
		Properties props = new Properties();
		props.load(read);
		JdbcString = props.getProperty("JDBCSTRING");
		Username = props.getProperty("USERNAME");
		Password = props.getProperty("PASSWORD");
		DbName = props.getProperty("DBNAME");
		TableName = props.getProperty("TABLENAME");
	}

	public void MySQLConnection() throws Exception {
		Property_File_Reader();
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(JdbcString, Username, Password);
	}

	public String login_fn(String log_username, String log_password) {
		String username = log_username;
		String password = log_password;

		String returnString = null;

		if (con == null) {
			try {
				MySQLConnection();
			} catch (Exception e) {
				returnString = (e.toString());
			}
		} else {
			;
		}
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM " + DbName + "." + TableName);
			boolean status = false;
			while (rs.next()) {
				if ((rs.getString(1).equals(username))
						&& (rs.getString(2).equals(decrypt_password(password, username)))) {
					status = true;
					break;

				}
			}
			if (status) {
				returnString = ("welcome " + username);
			} else {
				returnString = ("Invaild Username and password ");
			}

		} catch (SQLException e) {
			returnString = (e.toString());
		}
		return returnString;
	}

	public String decrypt_password(String drc_password, String drc_username) {
		Statement dcr;
		String RetrunString = null;

		try {
			dcr = con.createStatement();
			String query = "select password from " + DbName + "." + TableName + " where username = '" + drc_username
					+ "';";

			ResultSet rs = dcr.executeQuery(query);

			while (rs.next())
				RetrunString = rs.getString(1);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return RetrunString;
	}

	public String register(String username_Reg, String password_Reg) {
		String returnString = null;
		String username = username_Reg;
		String password = password_Reg;
		if (con == null) {
			try {
				MySQLConnection();
			} catch (Exception e) {
				returnString = (e.toString());
			}
		} else {
			;
		}
		PreparedStatement preStm;
		try {
			preStm = con.prepareStatement("insert into account.logins(username,password) values(?,password(?));");

			preStm.setString(1, username);
			preStm.setString(2, password);
			preStm.executeUpdate();
			returnString = "update done ";
		} catch (SQLException e) {
			String ErrorString = e.toString();
			String error_message = "java.sql.SQLIntegrityConstraintViolationException: Duplicate entry";
			if (ErrorString.contains(error_message)) {
				returnString = "The username is taken try some other";
			} else {
				returnString = ErrorString;
			}
		}

		return returnString;
	}

}
