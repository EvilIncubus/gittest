import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int[] i= {1,2,3,4,4};
        System.out.println(Arrays.toString(i));
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu email-ul: ");
        String email = sc.nextLine();
        System.out.print("Introdu password: ");
        String password = sc.nextLine();
        System.out.print("Introdu numele: ");
        String numele = sc.nextLine();
        System.out.print("introdu virsta: ");
        int virsta = sc.nextInt();
        System.out.print("Insert MALE/FEMALE: ");
        Gender gender = Gender.valueOf(sc.next().toUpperCase());
        Perosana newUser = new Perosana();
        newUser.setEmail(email);
        newUser.setPassword(password);
        newUser.setAge(virsta);
        newUser.setGender(gender);
        newUser.setName(numele);
        System.out.println(newUser);

        System.out.println("Log in: ");
        System.out.print("Email: ");
        Scanner sc1 = new Scanner(System.in);
        String logUser = sc1.nextLine();
        if (logUser.equals(email)) {
            System.out.print("Password: ");
            String logPass = sc1.nextLine();
            if (logPass.equals(password)) {
                System.out.print("Welcome: " + newUser);
            }
            else {
                System.out.println("Wrong password");
            }
        }
        else {
            System.out.println("Wrong Email");
        }

    }

}