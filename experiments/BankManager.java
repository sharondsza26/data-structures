package experiments;

class BankManager{
    
    public static void main(String[] args){
        System.out.println("Welcome to the bank");
        //Creating an object tubbusBankAccount of class BankAccount
        BankAccount tubbusBankAccount = new BankAccount();
        tubbusBankAccount.deposit(500);
        tubbusBankAccount.withdraw(100);
        tubbusBankAccount.withdraw(1000);
        BankAccount karensBankAccount = new BankAccount();
        karensBankAccount.deposit(5000);
        karensBankAccount.withdraw(4999);
        karensBankAccount.deposit(-100);
        
    }

}