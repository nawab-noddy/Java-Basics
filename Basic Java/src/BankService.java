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
}