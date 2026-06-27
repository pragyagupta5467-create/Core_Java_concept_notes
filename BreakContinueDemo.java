// break Statement>>>>>>>>>>>
// Exits the loop immediately.

// continue Statement>>>>>>>>
// Skips the current iteration and moves to the next.
public class BreakContinueDemo {
    public static void main(String[] args) {

        // break Statement>>>>>>>
        System.out.println("Break Example:");
        for(int i=1;i<=10;i++){
            if(i==6){
                break;
            }
            System.out.println(i);
        }

        // continue Statement>>>>>
        System.out.println("\nContinue Example:");
        for(int i=1;i<=10;i++){
            if(i==6){
                continue;
            }
            System.out.println(i);
        }
    }
}