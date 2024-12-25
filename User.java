import java.util.Scanner;

public class User extends Person {


    private Role role;
    private String email;
    private String password;

    User(String name, int age,String cin, Role role, String email, String password) {
        super(name, age,cin);
        this.role = role;
        this.email = email;
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "User{" +
                "cin='" + cin + '\'' +
                "name='" + name + '\'' +
                ", age=" + age +
                ", role=" + role.getRolename() +
                ", email='" + email + '\'' +
                '}';
    }
}