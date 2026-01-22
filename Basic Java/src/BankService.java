import java.util.HashMap;

class BankService{
    private HashMap<Integer,String> storeAccounts = new HashMap<>();

//    CREATE ACCOUNT
    public void createAccount(int accNumber) throws IllegalArgumentException{
        if(storeAccounts.containsKey(accNumber)){
            throw new IllegalArgumentException("Account Already Existed");
        }
        else {

        }
    }
}