package Constructor;
class Test{
    Test(){
        System.out.println("This Constructor I will be called when the OBJECT for the class is created ");
        // return System.out.println("hello");
        // return function thorws an error constructor can not retrun anything 
        
    }
    public static String test1(){
        System.out.println("this method i will be called only when the methods are called");
        return "I can Retrun anything NOT like YOU Constructor";
    }
}
public class Constructor {

   
    public static void main(String[] args) {
        System.out.println("hello  ");
        Test t=new Test();
        String a = t.test1();
        System.out.println(a);
        
    }
    
}
