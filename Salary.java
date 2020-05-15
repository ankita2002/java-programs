import java.util.Scanner;
public class Salary 
{
    public static void main(String[] args) {
        double HRA,TA,GS;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary");
        int BS= sc.nextInt();
        
         HRA=0.40*BS;
         TA=0.10*BS;
         GS=BS+HRA+TA;
         
         System.out.println("\n Basic SAlary:"+BS);
         System.out.println("\n HRA:"+HRA);
         System .out.println("\n TA:"+TA);
         System.out.println("\n GS:"+GS);
    }
}
