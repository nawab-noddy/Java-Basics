import java.util.Objects;

public class User {
    private String email;
    private String password;

    public User(String email, String password){
        this.email = email;
        this.password = password;
    }

    public boolean checkPassword(String input) {
        return Objects.equals(this.password, input);
    }
}
