import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity {
    ArrayList<User> users ;
    Scanner sc ;



    public MainActivity() {
        users=new ArrayList<>();
        sc=new Scanner(System.in);
    }
    void addPerson()
    {
        System.out.print("name : ");
       String name=sc.nextLine();
        System.out.print("age : ");
       int age=sc.nextInt();
        System.out.println("Role : ");
        Role role = new Role(sc.next());
        //sc.nextLine();
        System.out.print("email : ");
       String email=sc.next();
        sc.nextLine();
        System.out.println("password");
        String password=sc.nextLine();
        users.add(new User(name,age,role,email,password));

    }
    void displayPersons()
    {
        for (User user:users)
        {
            System.out.println("name "+ user.getName());
            System.out.println("age "+ user.age);
            System.out.println("Role "+ user.getRole().getRolename());
            System.out.println("email "+ user.getEmail());
        }
    }
    void searchPersons()
    {
        System.out.println("Name for search : ");
        String searchName= sc.nextLine();
        boolean found = false;
        for (User user : users)
        {
          if (user.getName().equals(searchName))
          {
              found = true;
              System.out.println(user);
          }
          else
          {
              System.out.println(searchName + " Not found ");
          }
        }
    }
    void updatePerson()
    {
        System.out.println("");
    }
}
