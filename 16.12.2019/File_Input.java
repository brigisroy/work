/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_io;

/**
 *
 * @author Brigis
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class File_Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("test.txt");
            String s="Hello World !";
            //Text Wanted to write on the TEXT doc
            byte b[];
            // byte Array creatation
            b = s.getBytes();
            //conversion of String to bytes
            fout.write(b);
            //Writting to the text file
            System.out.println("Written Done done");
            fout.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(File_io.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fout.close();
                //always close the object file created
            } catch (IOException ex) {
                Logger.getLogger(File_io.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
