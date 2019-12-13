
package java_super;

class car{
     String color ="Blue";
      car(){
         System.out.println("At base class "+color);
     }
      void hello(){
          System.out.println("Super Class");
      }
}
class blackcar extends car{
    String color;

    blackcar() {
        this.color = "black";
        // this keyword is used to define the value in the local block
       
    }
    
    void print(){
    System.out.println("at inherted class "+color);
    System.out.println("at inherted class "+super.color);
    super.hello();
}
    
}
public class Java_super {

    
    public static void main(String[] args) {
        blackcar a=new blackcar();
        a.print();
        
        
    }
    
}
