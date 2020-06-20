import java.util.Scanner;

public class Program

{

    public static void main(String[] args) {

        int i;

        float p;

        double result;

        Scanner s = new Scanner(System.in);

        System.out.print("1.CGPA to Percentage \n 2.Percentage to CGPA \n Enter Any No.");

        i=s.nextInt();

        

        if(i==1){

            System.out.println("Enter CGPA:");

            p=s.nextFloat();

            result=7.1*p+11;

           System.out.println("Percentage:"+result);

           }

           else if(i==2)

           {

               System.out.println("Enter CGPA:");

            p=s.nextFloat();

            result=(p-11)/7.1;

           System.out.println("CGPA:"+result);

           }

            

        }

        

    }

