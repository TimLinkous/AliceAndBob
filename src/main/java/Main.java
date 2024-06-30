import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
public class Main {

    public static void main(String[] args ){
        // create a new object of class Main
       compute();
        // call the compute() method on that new object
    }

    public static void compute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob")) {
            System.out.println("Hello " + name + "!");
        } else{ System.out.println("You are neither Alice nor Bob.");
        }

    }
}
