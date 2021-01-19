import java.util.Scanner;
public class sub
{
    public static void main(String[] args)
    {
        float sub1,sub2,sub3,total,average;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks for Sub1:");
        sub1=s.nextFloat();
        System.out.println("Enter marks for Sub2:");
        sub2=s.nextFloat();
        System.out.println("Enter marks for Sub3:");
        sub3=s.nextFloat();
        total=(sub1+sub2+sub3);
        average =(total/3);
        System.out.println("Total of "+sub1+" , "+sub2+" and "+sub3+" is "+total);
        System.out.println("Average of "+sub1+" , "+sub2+" and "+sub3+" is "+average);
    }
}