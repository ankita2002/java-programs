  import java.util.Scanner;

class Account {
    static int account_number;
    
    void accept_account() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number :");
        account_number = sc.nextInt();
        //sc.close();
    }
}

class Savings extends Account {
    static int balance =0, withdraw, spare;

    void balance() {
        System.out.println("Your Savings Balance is: "+balance+" for account no "+account_number);
    }

    void spare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to add in Savings: ");
        spare = sc.nextInt();
        balance += spare;
       // sc.close();
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to withdraw: ");
        withdraw = sc.nextInt();
        if(withdraw > balance)   System.out.println("ERROR!!! Low Balance ");
        else balance -= withdraw;
       // sc.close();
    }
}

//*******************************************************Current Account Status*******************************************************// 

class Account1 extends Account {    
    static int balance1=0 , withdraw1 ,spare1 ;

    void balance() {
        System.out.println("Current Balance: "+balance1+" for Account number "+account_number);
    }

    void spare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to Add to Savings: ");
        spare1 = sc.nextInt();
        balance1 += spare1;
       // sc.close();
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to withdraw: ");
        withdraw1 = sc.nextInt();
        if(withdraw1 > balance1 ) System.out.println("ERROR!!! Low Balance");
        else balance1 -= withdraw1;
       //// sc.close();
    }
}

public class ATM {
    public static void main(String[] args) {
        Account obj = new Account();
        Scanner sc = new Scanner(System.in);
        int option =1;
        while(true) {
            obj.accept_account();
            System.out.println("Select Action:\n1.Savings\n2.Current\n3.Exit");
            option = sc.nextInt();

            if(option==1) {
                Savings savings_object = new Savings();
                System.out.println("1.Withdraw\n2.Add\n3.Balance");
                int choice = sc.nextInt();
                if(choice==1) savings_object.withdraw();
                else if(choice==2) savings_object.spare();
                else if (choice==3) savings_object.balance();
                else System.out.println("ERROR: IMPROPER OPERATION!!!!");
            }
            else if(option==2) {
                Account1 account1_object = new Account1();
                System.out.println("1.Withdraw\n2.Add\n3.Balance");
                int choice = sc.nextInt();
                if(choice==1) account1_object.withdraw();
                else if(choice==2) account1_object.spare();
                else if(choice==3) account1_object.balance();
                else System.out.println("ERROR:IMPROPER OPERATION!!!!");
            }
            else if(option==3) break;
            else System.out.println("ERROR: INVALID INPUT !!!!");
        }
        sc.close();
    }
}
