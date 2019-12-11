**Constructor and Methods**

**Methods**
  
    Methods are the function which is created within the class the methods can retrun anything 
  
  `Syntax`
  
  ```
  modifier static returnType nameOfMethod (Parameter List)
  {
	// method body
}	
```



**Constructor**

A constructor is similar to a method (but not actually a method) that is invoked automatically when an object is created.The java Complier Identifies the Constructor by its name, Because the ``name of the Constructor and the class is same`` and it don't return anything 

`Syntax`

```
class Test {
    Test( ) {
        // constructor body
    }
}
```

[Code for Constructor and Methods ](https://github.com/brigisroy/work/blob/master/11.12.2019/Constructor.java)

**Lambda Expressions**

`Lambda operator` **->**

The Lambda Expression can be of single line and milti line for single line the it defaultly returns the values but in the multi line you have to provide the Retrun value `otherwise the Code will not exit form that Lambda block and always the block should end with ;` Interfaces are used in Lambda Expressions and they are knows as Functional Interface

[Code for Lambda Expression](https://github.com/brigisroy/work/blob/master/11.12.2019/LambdaExpressions.java)

**Multi Threading **

```
Syntax for Thread Pool Executor

ExecutorService pool = Executors.newFixedThreadPool(number_of_max_threads);
```
[Code of Multithreading](https://github.com/brigisroy/work/blob/master/11.12.2019/Multi.java)

[Code for MultiThreading using ThreadPoolExectors](https://github.com/brigisroy/work/blob/master/11.12.2019/Threadpool.java)
