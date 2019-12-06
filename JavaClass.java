import java.util.Random;
import java.util.Scanner;

class bank
{
int account,balnace;
String name;
void display()
{
    System.out.println("the account number is "+account);
    System.out.println("name of the account holder is "+name);
    System.out.println("the cash you posses is "+balnace);
}
void getdata()
{
    Scanner input = new Scanner(System.in);
    System.out.println("enter the name");
    name=input.next();
    System.out.println("enter the balance");
    balnace=input.nextInt();
    Random rand = new Random();
    account=rand.nextInt(100000);
    
}
}


class JavaClass{
    public static void main(String[] args) {
        bank b1= new bank();   
        b1.getdata();
        b1.display();     
    }
}
