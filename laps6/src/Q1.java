import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the initial investment balance:");
        double n=in.nextDouble();
        System.out.println("How much do you earn annualllly :");
        float x=in.nextFloat();
        int i;
        for ( i=0;n<=1000000;i++){
            n=n+x;

        }
        System.out.println("You need "+(i-1)+"years to have million dollars.");
    }
}
