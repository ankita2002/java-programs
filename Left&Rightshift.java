import java.util.*;
public class Program
{
    public static void main(String[] args) {
        int a,b,d;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=a>>3;
        d=a<<3;
        System.out.println("left shift:"+b);
        System.out.println("Right shift:"+d);
    }
}
