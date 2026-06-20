import java.util.Scanner;
 class Watermelon {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("enter your value of n:");
        int n = r.nextInt();
          
        if (n > 2 && n % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
