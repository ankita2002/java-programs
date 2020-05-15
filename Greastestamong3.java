import java.util.Scanner;
public class Greatest
{
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 nos");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        d= a>b?(a>c?a:c):(b>c?b:c);
        
        System.out.println("Greatest:"+d);
    }
}
