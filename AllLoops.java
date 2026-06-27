// Loops in Java
// Loops are used to execute a block of code repeatedly until a condition becomes false.
// 1. for Loop
// Used when the number of iterations is known.
// 2. Reverse for Loop
// Used to iterate in reverse order (from higher value to lower value).
// 3. while Loop
// Used when the number of iterations is unknown and the condition is checked before execution.
// 4. do-while Loop
// Executes the code at least once because the condition is checked after execution.
// 5. for-each Loop
// Used to iterate through all elements of an array or collection.

import java.util.Scanner;
public class AllLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        //1. for Loop
        //Used when the number of iterations is known.
        System.out.println("\nFor Loop:");
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        //2. Reverse for Loop
        //Used to iterate in reverse order.
        System.out.println("\nReverse For Loop:");
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
        //3. while Loop
        //Used when the number of iterations is unknown.
        System.out.println("\nWhile Loop:");
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
        //4. do-while Loop
        //Executes the code at least once.
        System.out.println("\nDo-While Loop:");
        int j=1;
        do{
            System.out.println(j);
            j++;
        }while(j<=n);
        //5. for-each Loop
        //Used to iterate through an array or collection.
        System.out.println("\nFor-Each Loop:");
        int[] arr={10,20,30,40,50};

        for(int num:arr){
            System.out.println(num);
        }

        sc.close();
    }
}