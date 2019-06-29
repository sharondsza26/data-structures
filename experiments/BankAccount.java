package experiments;

class BankAccount{
    int balance;

    void withdraw(int cash){
        if(cash>balance){
            System.out.println("Invalid Amount. Check Balance");
        }
        else {
            balance=balance - cash;
        }
        checkBalance();
        
    }

    void deposit(int amt){
        if(amt<0){
            System.out.println("Invalid Amount");
        
        }
        else {
            balance=balance + amt;
        }
        checkBalance();
    }

    void checkBalance(){
        System.out.println("the balance is "+ balance);
    }
}