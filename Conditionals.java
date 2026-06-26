// // Conditional Statements in Java
// Used to make decisions based on a condition (true/false).
// Types:>>>>>>>>>>>>>>>>>>>>
// 1. if        -> Executes code if condition is true.
// 2. if-else   -> Executes one block if true, another if false.
// 3. else-if   -> Checks multiple conditions.
// 4. Nested if -> if statement inside another if.
// 5. switch    -> Selects one option from multiple fixed cases.

public class Conditionals {
    public static void main(String[] args){
        int age = 24;
        if(age==18){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}


// // 1. if
// if (age >= 18) {
//     System.out.println("Eligible");
// }

// 2. if-else
// if (marks >= 33) {
//     System.out.println("Pass");
// } else {
//     System.out.println("Fail");
// }

// 3. else-if
// if (marks >= 90) {
//     System.out.println("A");
// } else if (marks >= 75) {
//     System.out.println("B");
// } else {
//     System.out.println("C");
// }

// 4. Nested if
// if (age >= 18) {
//     if (hasID) {
//         System.out.println("Entry Allowed");
//     }
// }

// 5. switch
// switch (day) {
//     case 1:
//         System.out.println("Monday");
//         break;
//     case 2:
//         System.out.println("Tuesday");
//         break;
//     default:
//         System.out.println("Invalid Day");
// }
