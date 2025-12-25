package Threading;

import java.util.*;
import java.lang.*;

class BookingPrinting extends Thread {
    int available = 2;
    Scanner sc = new Scanner(System.in);
    int seat;

    BookingPrinting(int n){
        this.seat=n;
    }
    void mix (int seat){
        
    }

    public void run(){
  
        

    }

    // void booking() {
    //     System.out.println("Number of booking ticks available are :" + available);
    //     System.out.print("\nPlease Entre your name :");
    //     name = sc.nextLine();
    //     System.out.print("How many ticks you want :");

    //     booked = sc.nextInt();
    //     sc.nextLine();

    // }
    // Bus(int seat){
    //     this.seat = seat;
    // }

    // public synchronized void run() {
    //     String name = Thread.currentThread().getName();
    //     if (1 <= available) {
    //         System.out.println(name + " your " + 1 + " ticks are booked ");
    //         available = available - 1;
    //     } else {
    //         System.out.println("Sorry "+ name +" Available ticks are only :" + available);
    //     }
    // }


}
public class Sitbooking {
    public void run(){
            
        }
    public static void main(String[] args) {
        BookingPrinting op = new BookingPrinting();

        // //op.booking();
        // String names[] = {"Anshul","Ansh","Another"};
        // int numberofticks[] = {1,2,3};
        Thread t1 = new Thread(op);
        Thread t2 = new Thread(op);

        // Thread t3 = new Thread(op);
        t1.setName("Onkar");
        t2.setName("Anshul");
                       
        t1.seat = 6;
        t2.seat = 7;

        t1.start();
        t2.start();


    }
}
