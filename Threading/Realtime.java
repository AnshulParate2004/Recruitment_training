package Threading;
import java.util.Scanner;

class Bus extends Thread {
    int available = 2;
    Scanner sc = new Scanner(System.in);
    int seat;

    Bus(int seat){
        this.seat = seat;
    }

    public synchronized void run() {
        String name = Thread.currentThread().getName();
        if (1 <= available) {
            System.out.println(name + " your " + 1 + " ticks are booked ");
            available = available - 1;
        } else {
            System.out.println("Sorry "+ name +" Available ticks are only :" + available);
        }
    }
}
public class Realtime {

    int available = 2;
    Scanner sc = new Scanner(System.in);
    int seat;
    

    public static void main(String[] args) {
        Bus op1 = new Bus("Onkar",3);
        Bus op2 = new Bus("Anshul",1);
        Bus op3 = new Bus("Aryan",2);
        
    }
    
}
