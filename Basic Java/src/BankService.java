import java.util.HashMap;

class BankService{

    private final HashMap<Integer,BankAccount> storeAccounts = new HashMap<>();

//    CREATE ACCOUNT
    public void createAccount(int accNumber, String holderName, int initialBalance) throws IllegalArgumentException{
        if(storeAccounts.containsKey(accNumber)){
            throw new IllegalArgumentException("Account Already Existed");
        }
        else {
            BankAccount newAccount = new BankAccount(accNumber, holderName, initialBalance);
            storeAccounts.put(accNumber,newAccount);
        }
    }
//    DEPOSIT TO ACCOUNT
    public void depositToAccount(int accNumber,int amount) throws IllegalArgumentException{
        if(!storeAccounts.containsKey(accNumber)){
            throw new IllegalArgumentException("Account does not exist");
        }
        else{
            storeAccounts.get(accNumber).deposit(amount);
        }
    }
//     WITHDRAW THE MONEY
    public void withdrawFromAccount(int accNumber,int amount) throws IllegalArgumentException{
        if(!storeAccounts.containsKey(accNumber)){
            throw new IllegalArgumentException("Account does not exist");
        }
        else{
            storeAccounts.get(accNumber).withdraw(amount);
        }
    }
//   CHECKING THE BALANCE
    public int getBalance(int accNumber) throws IllegalArgumentException{
        if(!storeAccounts.containsKey(accNumber)){
            throw new IllegalArgumentException("Account does not exist");
        }
        else{
             return storeAccounts.get(accNumber).getBalance();
        }
    }
}