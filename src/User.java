import java.util.ArrayList;

public abstract class User {
    private String username;
    private String password;
    public ArrayList<Customer> customerList = new ArrayList<Customer>(0);
    public ArrayList<Book> bookList = new ArrayList<Book>(0);

    public void setUsername(String u) {
        this.username = u;
    }

    public void setPassword(String p) {
        this.password = p;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}