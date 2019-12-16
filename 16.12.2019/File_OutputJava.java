/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_output.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Brigis
 */ 
public class File_OutputJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileInputStream  fout = new FileInputStream("test.txt");
        //object creatation for file Writing
        int i =0;
        while((i=fout.read())!=-1)
            //
        {
        System.out.print((char)i);
            //to print the text in the text file
        }
        System.out.println();
        fout.close();     
        
    }
    
}
