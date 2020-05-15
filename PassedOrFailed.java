import java.util.*;
public class Program
{
    public static void main(String[] args) {
        float P,ED,CP,BEE;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks of ED,CP,BEE");
        ED=sc.nextFloat();
        CP=sc.nextFloat();
        BEE=sc.nextFloat();
        
        if((CP>=0&&CP<+100)&&(BEE>=0&&BEE<=100)&&(ED>=0&&ED<=100))
        {
        P=(ED+BEE+CP)/3;
        if(P>=55)
        System.out.println("Passed");
        else
        System.out.println("Failed");
        }
        else
        System.out.println("CeckEntered Marks again !!!!");
    }
}
