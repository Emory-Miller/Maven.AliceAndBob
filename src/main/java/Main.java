/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args ){
        String name;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");

        name = sc.nextLine();

        sc.close();

        if ( name.equalsIgnoreCase("Alice")) {
            System.out.println("Hello Alice!");

        } else if ( name.equalsIgnoreCase("Bob")) {

            System.out.println("Hello Bob!");

        } else {

            System.out.println("Hello!");

        }

    }
}
