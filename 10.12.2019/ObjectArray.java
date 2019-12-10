package objectarray;

import java.util.Scanner;

/**
 *
 * @author Brigis Roy
 */
class  data{
    int num1,num2;
   
    
    
    public void get_data(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the 1st number :");
        num1 = sc.nextInt();
        System.out.print("enter the 2nd number :");
        num2 = sc.nextInt();
         
                   
    }
     void display_data(){
        System.out.println("the 1st Number is "+num1);
        System.out.println("the 2nd Number is "+num2);
        
    }

    
}
public class ObjectArray {
         
                      

    public static void main(String[] args) {

        data[] obj = new data[2];
        
           //this statement created only array not the objects for the class
        
         obj[0]=new data();
         obj[1]=new data();
        //if the object are not created it throws a  `java.lang.NullPointerException`
        System.out.println("getting data for 1st object");
        obj[0].get_data();
        System.out.println("getting data for 1st object");
        obj[1].get_data();
        System.out.println("displaying data for object 1");
        obj[0].display_data();
        System.out.println("displaying data for object 2");
        obj[1].display_data();

        
    }

 
}
