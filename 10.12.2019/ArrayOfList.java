package arrayoflist;

import java.util.ArrayList;

public class ArrayOfList {

    public static void main(String[] args) {
        int sum = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Size of array : " + numbers.size());
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("Size of array : " + numbers.size());
        System.out.println("elements of arraylist : " + numbers);
        for (Integer i : numbers) {
            sum = sum + i;
        }
        System.out.println("sum of the array is :" + sum);
        numbers.remove(1); //remove(index)
        
        System.out.println("Array list after removal :" + numbers + "\nThe size of array list after removal : " + numbers.size());

    }

}
