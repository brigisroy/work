/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files_java;
import java.io.*;
import java.util.Properties;

/**
 *
 * @author Brigis
 */
public class Files_java {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File configFile=new File("/home/developer/Documents/programs/java/18.12.2019/files_java/config.properties");
        //location of the properties file 
        FileReader reader = new FileReader(configFile);
        Properties props= new Properties();
        props.load(reader);
        String s= props.getProperty("data");
        //to get the data form the confi file 
        FileOutputStream fout =fout = new FileOutputStream("Text.txt");
        // creation of the text file 
        byte b[];
        b =  s.getBytes();
        //conversion into bytes form string  
        fout.write(b);
        //Writing to the TEXT file 
        System.out.println("Done !");
        fout.close();
        // File Closing
        
    }
    
}
