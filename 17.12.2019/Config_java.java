/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Brigis
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Config_java {

	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
      
        File configFile = new File("<Location of the file>");
	    //add the location of the file

        try {
            FileReader reader = new FileReader(configFile);
            Properties props = new Properties();
            props.load(reader);

            String host = props.getProperty("db_link");
		// data keyvalue you have to fetch
            System.out.println("Host name is: " + host);
            reader.close();
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
