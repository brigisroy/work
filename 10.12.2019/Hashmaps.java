package hashmaps;

import java.util.*;

public class Hashmaps {

    public static void main(String[] args) {
       HashMap<Integer, String> map = new HashMap<>();
       map.put(1,"java");
       map.put(2,"HTMl");
       map.put(3,"CSS");
       map.put(4,"JavaScript");
       map.put(5,"Reactjs");
       map.put(6,"Python");
       map.put(7,"C++");
       System.out.println("Hashmap's :"+map);
       map.remove(2);
        System.out.println("HashMaps after Removel "+map);
        
    }

}
