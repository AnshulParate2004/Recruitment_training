package Threading;
import java.util.*;
import java.lang.*;

class Print{ 
    // Main object
    synchronized void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }
    }
}
class Five extends Thread{
    Print F;
    Five(Print f){
        F=f;
    }
    public void run(){
      F.printTable(5);
    }
}
class Seven extends Thread{
    Print s;
    Seven(Print s){
        this.s=s;
    }
    public void run(){
        s.printTable(7);
    }

}

public class MultiThreading {
    public static void main(String[] args) {
        Print op =new Print();

        Five t1 = new Five(op);
        Seven t2 = new Seven(op);
        t1.start();
        t2.start();

        
    }
    
}
