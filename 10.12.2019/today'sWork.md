**Array of class**

where you can an array of class

**syntax**
> <class_name> obj = new <class_name>[\<Number of elements>]; 

it will not create objects,to create a objects otherwise it will throw a `java.lang.NullPointerException`

**syntax**

> obj[0]=new <class_name>( );

  [ObjectArray.java ](https://github.com/brigisroy/work/blob/master/10.12.2019/ObjectArray.java)


**ArrayList**

Array list is not similar to array's this differnt and it is present in the `java.util.ArrayList`

1.Arrays are fixed in size 

2.but ArrayList are flexbile, add( ) and remove( ) such functionalities are not available in Array

|**syntax For Int type**| 
|:---:|
|ArrayList< Integer > NameOfArrayList = new ArrayList< Integer >( );| 
| ArrayList< Integer > numbers = new ArrayList<>();`Diamond interface`|
|**syntax For string type**|
|ArrayList< String > NameOfArrayList = new ArrayList< String >( );|
|ArrayList< String > NameOfArrayList = new ArrayList<>( ); `Diamond interface`|
  
  [ArrayOfList.java](https://github.com/brigisroy/work/blob/master/10.12.2019/ArrayOfList.java)
  
  **Hashmap's in java**
  
 The values can be stored in a map by forming a key-value pair. The value can be retrieved using the key by passing
 
 **`Syntex`**
  ``` 
  HashMap< Integer, String > map = new HashMap<  >( );
  map.put(Interger_value,"string_value");
  map.remove(keyvalue); **keyvalue is Integer or String which you Declare at first**
 ```
 
 [HashMap.java](10.12.2019/Hashmaps.java)
