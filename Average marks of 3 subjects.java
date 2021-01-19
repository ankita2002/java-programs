import java.util.Scanner;
public class Exp2
{
    public static void main(String ar[])
    {
        System.out.println("Enter Marks of Physics Chemistry and Maths");
        Scanner read= new Scanner(System.in);
        int phy=Integer.parseInt(ar[0]);
        int chem=Integer.parseInt(ar[1]);
        int math=Integer.parseInt(ar[2]);
        System.out.println("The total marks is: "+(phy+chem+math));
        System.out.println("The average marks is: "+(phy+chem+math)/3);
        read.close();
    }
}
