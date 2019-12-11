package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class multi extends Thread{
    String name;
    public multi(String str){
        name=str;
    }
    public void run(){
        for (int i=1 ; i<=5;i++){
            System.out.println("Running "+name);
            sleep(700);
        }
        System.out.println("completed "+name);
        
    }
}
public class Threadpool {

   
    public static void main(String[] args) {
      // for(int j =1;j<=5;j++) {
           //String s ="task"+String.valueOf(j);
          // multi s=new multi(s);
           
      // }
      multi t1=new multi("Task 1");
      multi t2=new multi("Task 2");
      multi t3=new multi("Task 3");
      multi t4=new multi("Task 4");
      multi t5=new multi("Task 5");
      multi t6=new multi("Task 6");
      
      
       ExecutorService pool = Executors.newFixedThreadPool(3);
       //for(int j =1;j<=5;j++){
          //String s ="task"+String.valueOf(j);
          // pool.execute(s);
       //}
       pool.execute(t1);
       pool.execute(t2);
       pool.execute(t3);
       pool.execute(t4);
       pool.execute(t5);
       pool.execute(t6);
       pool.shutdown();
       //pool.shutdown() is used to end the threads otherwise it will get keep on running 
    }
    
}
