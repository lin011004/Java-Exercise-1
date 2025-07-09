import java.util.Scanner;

public class BasicIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Output
        System.out.println("Hello " + name + ", you are " + age + " years old!");

        scanner.close();
    }
}
