import java.util.HashMap;

public class AuthService {

    private final HashMap<String,User> storeUser = new HashMap<>();

//    Register User
    public void registerUser(String email, String password) throws IllegalArgumentException{
        if(storeUser.containsKey(email)){
            throw new IllegalArgumentException("email already in use");
        }
        else {
            User  user = new User(email, password);
            storeUser.put(email,user);
        }
    }

//    Login User
    public void logInUser(String email, String password) throws IllegalArgumentException{
        if(!storeUser.containsKey(email)) {
            throw new IllegalArgumentException("email does not exists");
        }
        else {
           if (!storeUser.get(email).checkPassword(password)){
               throw new IllegalArgumentException("Your password is wrong");
           }
        }
    }
}
