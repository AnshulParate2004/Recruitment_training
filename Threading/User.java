package Threading;
// public class User {
//     String username ;
//     void setName(String name){
//         this.username=name;
//     }
//     String getName(){
//         return this.username;
//     }
// }

class Account extends Thread{
    double balance=2000;
    double withdraw;
    Account (int amt){
        withdraw = amt;
    }
    public synchronized void withdraw(){
        String name = Thread.currentThread().getName();
        if(balance>=withdraw){
            System.out.println(name+" Transaction successful ");
            balance=balance-withdraw;
        }
        else{
            System.out.println("Sorry "+name+" there is insufficient "+balance+" balance.");
        }
    }
    public void run(){
        withdraw();
    }
    



}
public class User{
    public static void main(String[] args) {
        Account op = new Account(2000);
        Thread t1 = new Thread(op);
        Thread t2 = new Thread(op);

        Account op1 = new Account(3000);
        Thread t3 = new Thread(op1);
        Thread t4 = new Thread(op1);

        t1.setName("Onkar");
        t2.setName("Shubham");
        t3.setName("Anshul");
        t4.setName("Alankar");   

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
