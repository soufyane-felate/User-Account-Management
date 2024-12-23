public class User extends Person{
    String role,email,password ;

    User(String name, int age,String role,String email,String password) {
        super(name, age);
        this.role=role;
        this.email=email;
        this.password=password;
    }
}
