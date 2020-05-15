import java.util.Scanner;
public class Marks
{
    public static void main(String[] args) {
        // chem, maths, english, percentage;
        float c,m,P,e;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter marks of chem,maths ,english");
        c=sc.nextFloat();
        m=sc.nextFloat();
        e=sc.nextFloat();
        
        P=(c+m+e)/3;
        System.out.println("Percentage:"+P);
    }
}
