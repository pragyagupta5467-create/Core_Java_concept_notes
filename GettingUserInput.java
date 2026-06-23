// Getting User Input in Java
// Java me user se input lene ke liye Scanner class use karte hain.
import java.util.Scanner;
public class GettingUserInput {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        sc.close();
    }
}
