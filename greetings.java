import java.util.Scanner;
public class greetings {
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        System.out.println("enter your name");
        String name=r.nextLine();
        System.out.printf("hello %s ,have a good day!%n",name);
        // %s means insert string(name) here.
        
    }
    
}
