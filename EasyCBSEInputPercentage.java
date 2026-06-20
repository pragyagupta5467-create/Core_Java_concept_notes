import java.util.Scanner;
public class EasyCBSEInputPercentage{
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        int total=0;
        System.out.println("enter student name");
        String name=r.nextLine();
        System.out.println("enter student marks for subject(80 or 100)");
        int maxmarks=r.nextInt();
        for(int i=1;i<=5;i++){
            System.out.println("enter marks for subject"+i);
            int marks=r.nextInt();
            total=total+marks;
        }
    double percentage=(total*100.0)/(maxmarks*5);
    System.out.printf("percentage:%.2f%%%n",percentage);
    }
}