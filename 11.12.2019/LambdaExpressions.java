package lambdaexpressions;

import java.util.ArrayList;
interface name{
    public int add(int a,int b);
}
interface reverseString{
    public String reverse(String str1);
}
public class LambdaExpressions {
    public static void main(String[] args) {
        name a=(q,w)-> q+w; //for single line no return keyword is used  
        System.out.println("addition using lambdaexpressions : "+a.add(20, 40));
        String str2 = "hello";
        reverseString rev;
        rev = (str2)->
        {
            int len=str2.length()-1;
            for(int i = len;i>=0;i--)
            {
                System.out.print(str2.charAt(i));
            }
            return null; // must have retrun type otherwise the program will not halt
        };
        //must terminate with terminater for milti line lambda Expressions and should return something or else use null
           rev.reverse(str2);
    }
    
}
