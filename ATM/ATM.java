package ATM;

import java.util.*;
import java.text.*;

class Account {
    //
    Scanner sc = new Scanner(System.in);
    DecimalFormat df1 = new DecimalFormat("###,##0.00' Rupee'");
    DecimalFormat df2 = new DecimalFormat("###,##0.00' Doller'");
    private int cn;
    private int pn;

    double CB = 2000;
    double SB = 1000;

    void setCustomerNumber(int cn) {
        this.cn = cn;
    }

    void setPinNumber(int pn) {
        this.pn = pn;
    }

    int getCustomerNumber() {
        return this.cn;
    }

    int getPinNumber() {
        return this.pn;
    }

    void getCurrentBalance() {
        System.out.println("\nCurrent Account Balance : " + df1.format(CB));
    }

    void getSavingBalance() {
        System.out.println("\nSaving Account Balance : " + df1.format(SB));
    }
    
    // ---------------- CURRENT ACCOUNT ----------------

    void getCurrentWithdrawInput() {
        getCurrentBalance();
        System.out.print("Enter Withdraw Amount : ");
        double amount = sc.nextDouble();

        if (amount > 0 && CB >= amount) {
            calcCurrentWithdraw(amount);
            System.out.println("Transaction Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
        getCurrentBalance();
    }

    void calcCurrentWithdraw(double amt) {
        CB = CB - amt;
    }

    void getCurrentDepositInput() {
        getCurrentBalance();
        System.out.print("Enter Deposit Amount : ");
        double amt = sc.nextDouble();

        if (amt > 0) {
            calcCurrentDeposit(amt);
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Enter a valid amount");
        }
        getCurrentBalance();
    }

    void calcCurrentDeposit(double amt) {
        CB = CB + amt;
    }

    // ---------------- SAVING ACCOUNT ----------------

    void getSavingWithdrawInput() {
        getSavingBalance();
        System.out.print("Enter Withdraw Amount : ");
        double amt = sc.nextDouble();

        if (amt > 0 && SB >= amt) {
            SB = SB - amt;
            System.out.println("Withdraw Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
        getSavingBalance();
    }

    void getSavingDepositInput() {
        getSavingBalance();
        System.out.print("Enter Deposit Amount : ");
        double amt = sc.nextDouble();

        if (amt > 0) {
            SB = SB + amt;
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Enter a valid amount");
        }
        getSavingBalance();
    }
}


class OptionMenu extends Account {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Integer> data = new HashMap<>();

    void getCurrentAccount() {
        System.out.println("\nCURRENT ACCOUNT");
        System.out.println("\nType 1: Balance Enquiry");
        System.out.println("Type 2: Withdraw Money");
        System.out.println("Type 3: Deposite Money");
        System.out.println("Type 4: Exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                getCurrentBalance();
                getAccountType();
                break;
            case 2:
                getCurrentWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCurrentDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("\nThank You for Visiting:");
                System.out.println("Visit Again:");
                break;
            default:
                System.out.println("\nInvalid Choice");
                System.out.println("Enter the VALID CHOICE");
                break;
        }
    }

    void getSaving() {
        System.out.println("\nSAVING ACCOUNT");
        System.out.println("\nType 1: Balance Enquiry");
        System.out.println("Type 2: Withdraw Money");
        System.out.println("Type 3: Deposite Money");
        System.out.println("Type 4: Exit");
        System.out.println("\nChoice");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                getSavingBalance();
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("\nThank You for Visiting:");
                System.out.println("Visit Again:");
                break;
            default:
                System.out.println("\nInvalid Choice");
                System.out.println("Enter the VALID CHOICE");
                break;
        }

    }

    void getLogin() {
        do {
            try {
                data.put(1111, 111);
                data.put(1234, 123);
                data.put(1456, 128);
                data.put(1777, 777);
                System.out.println("Welcome to the RCOEM ATM :");
                System.out.print("Enter the Customer Number :");
                setCustomerNumber(sc.nextInt());
                System.out.print("\nEnter the PIN Number :");
                setPinNumber(sc.nextInt());
                int P = getCustomerNumber();
                int Q = getPinNumber();
                if (data.containsKey(P) && data.get(P) == Q) {
                    System.out.println("Login Successful :");
                    getAccountType();
                } else {
                    System.out.println("\nWrong Customer Number OR PIN Number.");
                    System.out.println("Enter the Valid Customer nUmber or choice.");
                }

            } catch (InputMismatchException e) {
                System.out.println("\nEnter only Numbers");
                System.out.println("Characters and Symbols not allowed.\n");
                sc.next();
            }
        } while (true);
    }

    void getAccountType() {
        System.out.println("\nACCOUNT TYPE");
        System.out.println("\nType 1: Current Account");
        System.out.println("Type 2: Saving Account:");
        System.out.println("Type 3: Exit");
        System.out.print("\nChoice :");

        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                getCurrentAccount();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("\nThank You for Visiting:");
                System.out.println("Visit Again:");
                break;
            default:
                System.out.println("\nInvalid Choice");
                System.out.println("Enter the VALID CHOICE");
                getAccountType();
                break;

        }
    }

}

public class ATM extends OptionMenu {
    public static void main(String[] args) {
        OptionMenu op = new OptionMenu();
        // op.getLogin();
        op.getAccountType();
    }
}
