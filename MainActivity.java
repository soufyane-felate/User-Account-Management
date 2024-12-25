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
        System.out.print("cin : ");
       String cin=sc.nextLine();
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
        users.add(new User(name,age,cin,role,email,password));

    }
    void displayPersons()
    {
     /*   for (User user:users)
        {
            System.out.println("------Persons --------:");
            System.out.println(user);

          *//*  System.out.println("cin "+ user.getCin());
            System.out.println("name "+ user.getName());
            System.out.println("age "+ user.age);
            System.out.println("Role "+ user.getRole().getRolename());
            System.out.println("email "+ user.getEmail());*//*

        }*/
        users.forEach(System.out::println);
    }
    void searchPersons()
    {
        System.out.println("CIN for search : ");
        String cin= sc.nextLine();
        boolean found = false;
       /* for (User user : users)
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
        }*/
        users.stream().filter(user -> user.getCin().equals(cin)).findFirst()
                .ifPresentOrElse(System.out::print,()-> System.out.println("not found"));





    }
    void updatePerson()
    {
        System.out.println("Enter CIN ");
        String cin=sc.nextLine();

        for (User user : users)
        {
            if (user.getCin().equals(cin))
            {
                System.out.println(" M E N U ");
                System.out.println("1 : name");
                System.out.println("2 : age");
                System.out.println("3 : role");
                System.out.println("4 : email");
                String choice;
                choice= sc.nextLine();
                switch (choice)
                {
                    case "1":
                        System.out.print("Enter new name : ");
                        String newName=sc.nextLine();
                        user.setName(newName);
                        break;
                    case "2":
                        System.out.print("Enter new age : ");
                        int newAge=sc.nextInt();
                        user.setAge(newAge);
                        break;
                    case "3":
                        System.out.print("Enter new Role : ");
                        String role=sc.nextLine();
                        Role newRole = new Role(role);
                        user.setRole(newRole);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }
    void remvePerson()
    {
        System.out.print("Cin remove : ");
        String cin = sc.next();
        sc.nextLine();

        users.removeIf(user -> user.getCin().equals(cin));
    }
}
