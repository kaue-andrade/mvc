import java.util.Scanner;

public class UserView {
    public void printUserDetails(String name, int age){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public String getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        return scanner.nextLine();
    }

    public int getAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        return scanner.nextInt();
    }
}
