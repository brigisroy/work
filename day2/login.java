package login;

import java.io.File;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class data
{
    int id;
    String user,pswd;
    void get()
    {
        Scanner input = new  Scanner(System.in);
        System.err.println("To add user enter the ID :");
        id=input.nextInt();
        id=String.valueOf(id);
        System.out.print("Enter the username : ");
        user=input.next();
        System.out.print("enter the password : ");
        pswd=input.next();
    }
    void display()
    {
        System.out.println("\nID :"+id+"\nuser name :"+user+"\npassword :"+pswd);
    }
}

public class Login
{
    public static void main(String[] args) throws SQLException
    {
      
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } 
        catch (ClassNotFoundException e)
        {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "<password>");
            System.out.println("SQL Connection to database established!");
            Statement st= conn.createStatement();
            Scanner sc = new Scanner(System.in);
    
        System.out.print("1 for add user \n2 For login \nenter you option:");
        int number = sc.nextInt();
            switch(number)
        {
        case 1  :
            System.out.println("YOU can add user by entering the data");
            data d=new data();
            d.get();
            st.executeUpdate("INSERT INTO `web`.`login` (`id`, `user`, `pswd`)"+ "VALUES ('"d.id','+d.user','+d.pswd=")'");

            break;
        case 2 :
            //System.out.println("enter the id,username and password for login");
            ResultSet rs = st.executeQuery("SELECT * FROM web.login;");
            while(rs.next())
            {
                System.out.print("|"+rs.getString(1)+"|");    //First Column
                System.out.print(rs.getString(2)+"|");    //Second Column
                System.out.println(rs.getString(3)+"|");    //Third Column
            }
            conn.close();
            break;
             default:
            System.out.println("invaild option");
            }
       } 
        
        
        catch (SQLException e)
        {
            System.out.println("Connection Failed! Check output console");
        } 
        
           
    
      
              
    }
    
}
