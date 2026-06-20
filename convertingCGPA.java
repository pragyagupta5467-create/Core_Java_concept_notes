import java.util.Scanner;
public class convertingCGPA {
    public static void main(String[] args){
    Scanner r=new Scanner(System.in);
        int total=0;
    System.out.println("enter maximum marks of student");
    int marks=r.nextInt();
    for(int i=1;i<=3;i++){
        System.out.println("enter marks of student");
         marks=r.nextInt();
         marks=total+marks;     
}
double CGPA=(marks*10.0)/(marks*3);
System.out.printf("CGPA:%.2f%n",CGPA);
 }

}
