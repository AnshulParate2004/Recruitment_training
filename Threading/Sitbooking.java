package Threading;

import java.util.*;

class Bus {
    int available = 3;
    Scanner sc = new Scanner(System.in);
    String a;

    void booking() {
        while (true) {
            System.out.println("Number of booking ticks available are :" + available);
            System.out.print("\nPlease Entre your name :");
            a = sc.nextLine();
            System.out.print("How many ticks you want :");
            int booked;
            booked = sc.nextInt();
            sc.nextLine();
            if (booked <= available) {
                System.out.println("Your " + booked + "ticks are booked");
                available=available-booked;
                if(available==0){
                    break;
                }

            } else {
                System.out.println("Available ticks are only :" + available);
            }
        }
    }
}

public class Sitbooking {
    public static void main(String[] args) {
        Bus op = new Bus();
        op.booking();
    }

}
