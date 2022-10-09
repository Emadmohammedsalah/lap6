import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the string:");
        String n=in.next();
        String x="";
        for (int i= n.length()-1;i>=0;i--){
           n.charAt(i);
            System.out.println( n.charAt(i));
        }
    }
}
