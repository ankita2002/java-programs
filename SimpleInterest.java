import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) 
    {
        float p,n,r,S;
        //p=Principle amount 
        //n= No of years
        //r= Rate
        // S= Simple Interest 
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter Principle Amount : ");
        p=s.nextFloat();
        System.out.println("Enter No of Years : ");
        n=s.nextFloat();
        System.out.println("Enter Rate : ");
        r=s.nextFloat();
        S=(p*n*r)/100;
        System.out.println("SIMPLE INTEREST: "+S);
    }
}