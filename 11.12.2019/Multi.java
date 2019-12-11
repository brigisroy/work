package multi;
class m1 extends Thread{    
    public void run(){
        for (int i =0 ;i<10;i++){
           System.out.println("m1 :"+i);
            sleep(1000);
       }
        System.out.println("Thread 1 completed");
    }
}
class m2 extends Thread{
    public void run(){
        for (int i =0; i<10;i++){
            System.out.println("m2 :"+i);
            sleep(500);
        }
        System.out.println("Thread 2 completed");
    }
}
class Multi { 

public static void main (String args[]){
        m1 t1=new m1();
        m2 t2=new m2();
        
        t1.start();
        t2.start();
    }
    
}

