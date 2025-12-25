package Threading;
import java.lang.*;
import java.util.*;
/*
Step 1: import the java.lang pkg.
Step 2: A) by extending Thread class.
        B) by implementing Runnble Interface (Best approach).
Step 3: intilized the run() method. 
Step 4: give the public access to the run() method.
Step 5: implement the run method.
Step 6: Create the number of threads (users).
Step 7: call the start method (start the threads of users).
*/
class looping extends Thread{
    public void run(){
        try{
            for(int i=1;i<=3;i++){
                System.out.println("bye");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
            System.out.println("What are you doing it is an Exception");
        }
    }
}
public class Threads {
    public static void main(String[] args) {
        looping op = new looping();
        op.start();
        try{
            for(int i =1;i<=3;i++){
                System.out.println("Hello");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("");
        }

    }
    
}
