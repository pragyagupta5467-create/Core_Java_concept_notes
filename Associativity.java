// Associativity: Associativity determines the direction in which operators of the same precedence are evaluated.

// Left-to-Right Associativity: Operators are evaluated from left to right.
// Example: 20 - 10 - 5 = (20 - 10) - 5 = 5

// Right-to-Left Associativity: Operators are evaluated from right to left.
// Example: a = b = c = 10 assigns 10 to c, then b, then a.

import java.util.Scanner;
public class Associativity {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        System.out.print("Enter third number: ");
        int z = sc.nextInt();
        // Left to Right Associativity
        int result = x - y - z;
        System.out.println("\nLeft to Right Associativity:");
        System.out.println(x + " - " + y + " - " + z + " = " + result);
        // Right to Left Associativity
        int a, b, c;
        System.out.print("\nEnter a value to assign: ");
        int value = sc.nextInt();
        a = b = c = value;
        System.out.println("\nRight to Left Associativity:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        sc.close();
    } 
}
