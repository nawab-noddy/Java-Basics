
public class BankAccount {

    private int accountNumber;
    private String holderName;
    private int balance;


//    CONSTRUCTORS
    public BankAccount(int accountNumber, String holderName, int balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

//    Deposit Method
    public void deposit(int amount) throws IllegalArgumentException {
        if(amount <= 0){
            throw new IllegalArgumentException("Please Enter amount Greater than 0");
        }
        this.balance += amount;
    }

//    Withdraw Method
    public void withdraw(int amount) throws IllegalArgumentException{
        if(amount <= 0){
         throw new IllegalArgumentException("Please Enter a valid amount to withdraw");
        }
        if(amount > this.balance){
            throw new IllegalArgumentException("Please Enter a valid amount to withdraw");
        }
        this.balance -= amount;
    }

//    Check Balance

    public int getBalance(){
        return this.balance;
    }

}