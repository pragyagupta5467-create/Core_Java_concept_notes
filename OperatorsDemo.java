//  Operators: Special symbols used to perform operations on variables and values.
// Expression: A combination of variables, values, and operators that produces a result.
// Arithmetic Operators (+, -, *, /, %): Used for mathematical calculations.
// Assignment Operators (=, +=, -=, *=, /=, %=): Used to assign values to variables.
// Relational Operators (==, !=, >, <, >=, <=): Used to compare two values and return true or false.
// Logical Operators (&&, ||, !): Used to combine or invert boolean conditions.
// Unary Operators (+, -, ++, --, !): Operate on a single operand.
// Increment Operator (++): Increases a variable's value by 1.
// Decrement Operator (--): Decreases a variable's value by 1.
// Bitwise Operators (&, |, ^, ~, <<, >>): Perform operations at the bit level.
// Ternary Operator (condition ? value1 : value2): A shorthand form of if-else.
// instanceof Operator: Checks whether an object belongs to a particular class.
// Operator Precedence: Determines the order in which operators are evaluated.
// Associativity: Determines the direction of evaluation when operators have the same precedence.

import java.util.Scanner;
public class OperatorsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        // 1. Arithmetic Operators
        System.out.println("\n=== Arithmetic Operators ===");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        // 2. Assignment Operators
        int x = a;
        x += b;
        System.out.println("\nAssignment (+=): " + x);
        // 3. Relational Operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        // 4. Logical Operators
        System.out.println("\n=== Logical Operators ===");
        System.out.println("(a > 0 && b > 0): " + (a > 0 && b > 0));
        System.out.println("(a > 0 || b > 0): " + (a > 0 || b > 0));
        System.out.println("!(a > b): " + !(a > b));
        // 5. Unary Operators
        int num = a;
        System.out.println("\n=== Unary Operators ===");
        System.out.println("Original Value: " + num);
        System.out.println("Post Increment: " + (num++));
        System.out.println("After Increment: " + num);
        System.out.println("Post Decrement: " + (num--));
        System.out.println("After Decrement: " + num);
        // 6. Bitwise Operators
        System.out.println("\n=== Bitwise Operators ===");
        System.out.println("a & b : " + (a & b));
        System.out.println("a | b : " + (a | b));
        System.out.println("a ^ b : " + (a ^ b));
        // 7. Ternary Operator
        System.out.println("\n=== Ternary Operator ===");
        String result = (a > b) ? "a is Greater" : "b is Greater or Equal";
        System.out.println(result);
        // 8. instanceof Operator
        String name = "Pragya";
        System.out.println("\n=== instanceof Operator ===");
        System.out.println(name instanceof String);
        // 9. Expression
        int expression = (a + b) * 2;
        System.out.println("\n=== Expression ===");
        System.out.println("(a + b) * 2 = " + expression);
        sc.close();
    }
}

