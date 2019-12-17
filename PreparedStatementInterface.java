/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparedstatement.pkginterface;

/**
 *
 * @author Brigis 
 */
import java.io.*;
import java.util.*;
import java.sql.*;

class data {
    
    String id,user,pswd;
    void get()
    {
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print("To add user enter the ID :");
        id=input.next();
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
public class PreparedStatementInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        data d= new data();
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        do {                
                
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } 
        catch (ClassNotFoundException e)
        {
            System.out.println("MySQL JDBC Driver not found !!");
            return;
        }
        try{        
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "mobius365");
            System.out.println("SQL Connection to database established!");
            Statement st= conn.createStatement();
            
            
            System.out.println("1 for add user \n2 For login \n3 for deletion \n4 For Password Update \nenter you option:");
            int number = sc.nextInt();
            
            
            switch(number)
            {
            case 1  :
            System.out.println("YOU can add user by entering the data");
            
            d.get();
            //String sql="INSERT INTO `web`.`login` (`id`, `user`, `pswd`) "+ "VALUES('"+d.id+"','"+d.user+"','"+d.pswd+"');";
            /*INSERT INTO `web`.`login` (`id`, `user`, `pswd`) VALUES ('@@@', '#### ', '$$$$$');*/
            
            PreparedStatement stmt=conn.prepareStatement("INSERT INTO web.login(`id`, `user`, `pswd`) VALUES(?,?,?)");
            stmt.setString(1,d.id);
            stmt.setString(2,d.user);
            stmt.setString(3,d.pswd);
            stmt.executeUpdate(); 
            conn.close();
            break;
            
            case 2:
            String log_id,log_user,log_pwsd;
            System.out.print("enter your id_number :");
            log_id=sc.next();
            PreparedStatement log_in_St =conn.prepareStatement("SElECT * FROM web.login where id = ?");
            log_in_St.setString(1,log_id);
            ResultSet rs=log_in_St.executeQuery();
                    
            //ResultSet rs = st.executeQuery("SELECT * FROM web.login where id = "+log_id+";");
            while(rs.next())
            {
                System.out.print("|"+rs.getString(1)+"|");    //First Column
                System.out.print(rs.getString(2)+"|");    //Second Column
                System.out.println(rs.getString(3)+"|");    //Third Column
                System.out.print("\nenter the username : ");
                log_user=sc.next();
                System.out.print("\nenter the password : ");
                log_pwsd=sc.next();
                if((log_id.equals(rs.getString(1))) && (log_user.equals(rs.getString(2)) && log_pwsd.equals(rs.getString(3))))
                {
                    System.out.print("\nlogged in!!");
                    
                }
                else
                {
                    System.out.print("\nInvaild user name and password");
                }
            }
            conn.close();
            break;
            case 3 : // for deletion of user login in the database 
            System.out.print("enter your id_number :");
            log_id=sc.next();
            PreparedStatement delStatement =conn.prepareStatement("SELECT * FROM web.login where id = ?");
            delStatement.setString(1,log_id);
            ResultSet Rs=delStatement.executeQuery();
            //ResultSet Rs = st.executeQuery("SELECT * FROM web.login where id = "+log_id+";");
            while(Rs.next())
            {
                    //Third Column
                System.out.print("\nenter the username : ");
                log_user=sc.next();
                System.out.print("\nenter the password : ");
                log_pwsd=sc.next();
                if((log_id.equals(Rs.getString(1))) && (log_user.equals(Rs.getString(2)) && log_pwsd.equals(Rs.getString(3))))
                {
                    System.out.print("\n**|" + Rs.getString(1) + "|");    //First Column
                    System.out.print(Rs.getString(2) + "|");    //Second Column
                    System.out.println(Rs.getString(3) + "|**");
                    System.out.print("\nDo you Want to delete this user login\nTo delete press Y or N  ");
                    
                    String del=sc.next();
                    if (del.equalsIgnoreCase("y"))
                    {
                       
                        PreparedStatement deleteStatement = conn.prepareStatement("delete FROM web.login where id = ? "); 
                        deleteStatement.setString(1,log_id);
                        deleteStatement.executeUpdate();
                        //deleteStatement.executeUpdate("delete FROM web.login where id = "+log_id+";");
                        //should use executeUpdate for deletation INSERT 

                        System.out.print("\ndeletaion done");
                    }
                    
                    
                }
                else
                {
                    System.out.print("\nInvaild user name and password");
                }
            }
            conn.close();
            break;
            
            case 4:
            System.out.print("enter your id_number :");
            log_id=sc.next();
            PreparedStatement UpdateStatement=conn.prepareStatement("SELECT * FROM web.login where id = ?");
            UpdateStatement.setString(1, log_id);
            ResultSet RS=UpdateStatement.executeQuery();
            //ResultSet RS = st.executeQuery("SELECT * FROM web.login where id = "+log_id+";");
            while(RS.next())
            {
                    //Third Column
                System.out.print("\nenter the username : ");
                log_user=sc.next();
                System.out.print("\nenter the password : ");
                log_pwsd=sc.next();
                
                if((log_id.equals(RS.getString(1))) && (log_user.equals(RS.getString(2)) && log_pwsd.equals(RS.getString(3))))
                {
                    System.out.print("\n**|" + RS.getString(1) + "|");    //First Column
                    System.out.print(RS.getString(2) + "|");    //Second Column
                    System.out.println(RS.getString(3) + "|**");
                    /*System.out.print("\nDo you Want to update pasword this user login\nTo delete press Y or N  ");*/
                    
                    System.out.print("Enter the New password :");
                    String new_pswd=sc.next();
                    System.out.print("Retype the New password : ");
                    String new_pswd1=sc.next();
                    if (new_pswd.equals(new_pswd1))
                    {
                       
                        Statement deleteStatement = conn.createStatement(); 
                        //UPDATE `web`.`login` SET `pswd`='password' WHERE `id`='2' and`user`='hello';

                        deleteStatement.executeUpdate("update web.login set pswd='"+new_pswd+"' where id = "+log_id+";");
                        //should use executeUpdate for deletation INSERT 

                        System.out.print("\nupdating done");
                    }
                    else{
                        System.err.println("Password dont match ");
                    }
                }
                    
                    else
                        {
                            System.out.println("Invaild user name and password");
                        }
            }
            break;

            
            default:
               System.out.println("invaild option");
            
    

            }
            
            System.out.print("\nTo exit enter N");
            String ex=sc.next();
            flag=ex.equalsIgnoreCase("y");
             }catch (SQLException e)
            {
                System.out.println(e);
            } 
            } while (flag);
        
        
        
    
}


