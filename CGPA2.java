import java.util.Scanner;
public class CGPA2 {
    public static void main(String[] args) {
     int i;
     float p;
     double result;
     Scanner s = new Scanner(System.in);
     System.out.println("\n\n1.CGPA to Percentage \n2.Percentage to CGPA \nEnter your choice: ");
     i=s.nextInt();
     
     if(i==1)
     {
         System.out.println("Enter CGPA: ");
         p=s.nextFloat();
         result= (7.1*p+11);
         System.out.println("\nPercentage: "+result);
     }
     else if(i==2) 
     {
         System.out.println("Enter Percentage: ");
         p=s.nextFloat();
         result= (p-11)/7.1;
         System.out.println("\nCGPA: "+result);
     }
     else
     {
         System.out.println("ERROR \nCHECK YOUR INPUT AND TRY AGAIN");
     }
     System.out.println("\n\n");
    }
}