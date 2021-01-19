import java.util.Scanner;
public class factorial_method
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to find it's factorial");
        int num = s.nextInt();
        factorial(num);
    }
    static void factorial(int num)
    {
        int i,f=1;
        for(i=1;i<=num;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial of the "+num+" is "+f);
    }
}