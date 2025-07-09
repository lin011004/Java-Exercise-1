import java.util.Scanner;

public class DataOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        // Arithmetic operations
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        // Relational operations
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical operations
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Increment and Decrement
        int c = a;
        System.out.println("Original c: " + c);
        System.out.println("Post-increment (c++): " + (c++));
        System.out.println("After post-increment: " + c);
        System.out.println("Pre-decrement (--c): " + (--c));

        // Assignment operations
        int d = a;
        d += b;
        System.out.println("d += b: " + d);
        d -= b;
        System.out.println("d -= b: " + d);
        d *= b;
        System.out.println("d *= b: " + d);
        d /= b;
        System.out.println("d /= b: " + d);
        d %= b;
        System.out.println("d %= b: " + d);

        // Conditional check (if-else)
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("b is greater than a");
        } else {
            System.out.println("a and b are equal");
        }

        // Loop (for loop)
        System.out.print("First 5 natural numbers: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
