
package arrayoflist;

import java.util.ArrayList;


public class ArrayOfList {

    
    public static void main(String[] args) {
        int sum=0;
        ArrayList<Integer> numbers= new ArrayList<Integer>();
                System.out.println("Size of array : "+numbers.  size());
                numbers.add(20); 
                numbers.add(20); 
                numbers.add(20); 
                numbers.add(20); 
                numbers.add(20); 
                numbers.add(20); 
                System.out.println("Size of array : "+numbers.  size());
                System.out.println("elements of arraylist : "+numbers);
                for (Integer i: numbers){
                    sum = sum+i;
                }
                 System.out.println("sum of the array is :"+sum);
                
    }
    
}
