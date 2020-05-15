import java.util.*;
public class Program
{
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 nos");
        a=sc.nextInt();
        b=a%10;
        a=a/10;
        c=a%10;
        d=a/10;
        System.out.println("First Digit"+d);
        System.out.println("Second Digit"+c);
        System.out.println("Third Digit"+b);
    }
}
