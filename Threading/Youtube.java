package Threading;
import java.util.*;
class Channel{
    List <CustomerSubscriber> c = new ArrayList();
    String title;
    void subscribe(CustomerSubscriber sub){
        c.add(sub);
    }
    void upload(String name){
        this.title=title;
        notifySubscriber();
    }
    void notifySubscriber(){
        for(CustomerSubscriber sub : c )
        {
            sub.update();
        }
    }



}
class CustomerSubscriber{
    String name;
    Channel worldAffairs=new Channel();
    CustomerSubscriber(String name){
        this.name=name;

    }
    void subSubscribeChannel(Channel ch){
        worldAffairs=ch;

    }
    void update(){
        System.out.println("Hello "+name+" New vedio is uploaded by "+ name);
    }
            
}
public class Youtube {
    public static void main(String[] args) {
        Channel ob = new Channel();
        CustomerSubscriber cs1 = new CustomerSubscriber("Onkar");
        CustomerSubscriber cs2 = new CustomerSubscriber("Shubham");
        CustomerSubscriber cs3 = new CustomerSubscriber("Anshul");
        CustomerSubscriber cs4 = new CustomerSubscriber("Soham");
        CustomerSubscriber cs5 = new CustomerSubscriber("Ankit");

        ob.subscribe(cs1);
        ob.subscribe(cs2);
        ob.subscribe(cs3);
        ob.subscribe(cs4);
        ob.subscribe(cs5);

        ob.upload("INDIA-CHINA Relation");















        
    }
    
}
