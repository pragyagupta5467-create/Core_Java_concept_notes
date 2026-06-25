// Java String Methods

// 1. length()
// Definition: Returns the number of characters in a string.

// public class Stringsmethods {
//     public static void main(String[] args) {
//         String str = "Pragya";
//         System.out.println(str.length());
//     }
// }
// Output : 6

// 2. charAt()
// Definition: Returns the character at the given index.

// public class Stringsmethods  {
//     public static void main(String[] args) {
//         String str = "Pragya";
//         System.out.println(str.charAt(2));
//     }
// }
// Output: a

// 3. substring()
// Definition: Returns a part of the string.

// public class Stringsmethods {
//     public static void main(String[] args) {
//         String str = "Programming";
//         System.out.println(str.substring(3));
//     }
// }
// Output :gramming

// 4. toUpperCase()
// Definition: Converts all characters to uppercase.

// public class Stringsmethods  {
//     public static void main(String[] args) {
//         String str = "java";
//         System.out.println(str.toUpperCase());
//     }
// }
// Output: JAVA

// 5. toLowerCase()
// Definition: Converts all characters to lowercase.

// public class Stringsmethods  {
//     public static void main(String[] args) {
//         String str = "JAVA";
//         System.out.println(str.toLowerCase());
//     }
// }
// Output :java

// 6. trim()
// Definition: Removes spaces from the beginning and end.

// public class Stringsmethods  {
//     public static void main(String[] args) {
//         String str = "   Hello   ";
//         System.out.println(str.trim());
//     }
// }
// Output : Hello

// 7. replace()
// Definition: Replaces characters or words.

// public class Stringsmethods  {
//     public static void main(String[] args) {
//         String str = "Java";
//         System.out.println(str.replace('a', 'o'));
//     }
// }
// Output :Jovo

// 8. equals()
// Definition: Compares two strings.

// public class Stringsmethods {
//     public static void main(String[] args) {
//         String s1 = "Java";
//         String s2 = "Java";
//         System.out.println(s1.equals(s2));
//     }
// }
// Output :true

// 9. equalsIgnoreCase()
// Definition: Compares two strings ignoring uppercase/lowercase.

// public class Stringsmethods  {
//     public static void main(String[] args) {
//         String s1 = "JAVA";
//         String s2 = "java";
//         System.out.println(s1.equalsIgnoreCase(s2));
//     }
// }
// Output : true

// 10. contains()
// Definition: Checks if a string contains a word.

// public class Stringsmethods  {
//     public static void main(String[] args) {
//         String str = "Java Programming";
//         System.out.println(str.contains("Java"));
//     }
// }
// Output : true

// 11. startsWith()
// Definition: Checks if a string starts with a given word.

// public class Stringsmethods  {
//     public static void main(String[] args) {
//         String str = "Java Programming";
//         System.out.println(str.startsWith("Java"));
//     }
// }
// Output :true

// 12. endsWith()
// Definition: Checks if a string ends with a given word.

// public class Stringsmethods  {
//     public static void main(String[] args) {
//         String str = "Java Programming";
//         System.out.println(str.endsWith("Programming"));
//     }
// }
// Output :true

// 13. indexOf()
// Definition: Returns the first index of a character.

// public class Stringsmethods  {
//     public static void main(String[] args) {
//         String str = "Programming";
//         System.out.println(str.indexOf('g'));
//     }
// }
// Output : 3

// 14. lastIndexOf()
// Definition: Returns the last index of a character.

// public class Stringsmethods  {
//     public static void main(String[] args) {
//         String str = "Programming";
//         System.out.println(str.lastIndexOf('g'));
//     }
// }
// Output :10

// 15. isEmpty()
// Definition: Checks whether a string is empty.

// public class Stringsmethods  {
//     public static void main(String[] args) {
//         String str = "";
//         System.out.println(str.isEmpty());
//     }
// }
// Output :true

// 16. concat()
// Definition: Joins two strings.

// public class Stringsmethods  {
//     public static void main(String[] args) {
//         String s1 = "Hello ";
//         String s2 = "World";
//         System.out.println(s1.concat(s2));
//     }
// }
// Output :Hello World

// 17. compareTo()
// Definition: Compares two strings lexicographically.

// public class Stringsmethods  {
//     public static void main(String[] args) {
//         String s1 = "Apple";
//         String s2 = "Banana";
//         System.out.println(s1.compareTo(s2));
//     }
// }
// Output :-1

// 18. split()
// Definition: Splits a string into an array.

// public class Stringsmethods  {
//     public static void main(String[] args) {
//         String str = "Java Python C++";
//         String[] arr = str.split(" ");
//         for(String word : arr){
//             System.out.println(word);
//         }
//     }
// }
// Output :Java  Python  C++

// 19. valueOf()
// Definition: Converts other data types into a string.

// public class Stringsmethods  {
//     public static void main(String[] args) {
//         int num = 100;
//         String str = String.valueOf(num);
//         System.out.println(str);
//     }
// }
// Output :100

// 20. repeat() (Java 11+)
// Definition: Repeats the string multiple times.

// public class Stringsmethods  {
//     public static void main(String[] args) {
//         String str = "Hi ";
//         System.out.println(str.repeat(3));
//     }
// }
// Output :Hi Hi Hi