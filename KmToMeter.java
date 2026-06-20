import java.util.Scanner;
public class KmToMeter {
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        System.out.println("enter distance in kilometers");
        double kilometers=r.nextDouble();
        double meters=kilometers*1000;
        System.out.printf("%.2f kilometers=%.2f meters%n",kilometers,meters);
    }
    
}
