package Constructor;

import java.util.*;

class Super{
    Super(){
        System.out.println("Supper class counstructor");
    }

    void print(){
        System.out.println("Supper class");
    }

}
class sub extends Super{
    sub(){
        System.out.println("Sub Class constructor");
    }
    void show(){
        System.out.println("Sub class");
    }

}
public class Main {
    public static void main(String[] args) {
        sub op = new sub();
        op.print();
        op.show();


        
    }
    
}
