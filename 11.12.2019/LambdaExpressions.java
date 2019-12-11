package lambdaexpressions;

import java.util.ArrayList;
interface name{
    public int add(int a,int b);
}
interface reverseString{
    //interfaces are needed for lambda Expressions
    public String reverse(String str1);
}
public class LambdaExpressions {
    public static void main(String[] args) {
        name a=(q,w)-> q+w;
        //return function is not needed for single line lambda expressions it defaultly the values
        System.out.println("addition using lambdaexpressions : "+a.add(20, 40));
        String str2 = "lambdaexpressions";
        reverseString rev;
        rev = (str2)->
        {
            String word="";
            int len=str2.length()-1;
            for(int i = len;i>=0;i--)
            {
                word = word + (str2.charAt(i));
            }
            return word; // must have retrun type otherwise the program will not halt
        };
        //must terminate with terminater for milti line lambda Expressions and should return something or else use null
       
        System.out.println("Reversing of string using lambda Expressions :"+rev.reverse(str2));
        
        
        //lambda Expressions using ArrayList
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.forEach(n -> System.out.println(+n)); 
    }
    
}

