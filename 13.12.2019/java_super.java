
package java_super;

class car{
     String color ="Blue";
      car(){
         System.out.println("At base class "+color);
     }
}
class blackcar extends car{
    String color;

    blackcar() {
        this.color = "black";
        // this keyword is used to define the value of color in the local block
       // super();
    }
    
    void print(){
    System.out.println("at inherted class "+color);
    System.out.println("at inherted class "+super.color);
    
}
    
}
public class Java_super {

    
    public static void main(String[] args) {
        blackcar a=new blackcar();
        a.print();
        
        
    }
    
}
