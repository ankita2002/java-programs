import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        int input1,input2,ops;
        double result=0;
        java.util.Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers");
        input1 = s.nextInt();
        input2 = s.nextInt();
        System.out.println("1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.MODULUS\nSelect Operator:");
        ops = s.nextInt();
        switch(ops)
        {
            case 1: 
                result = (input1 + input2);
                System.out.println("Addition of "+input1+" & "+input2+" is "+result);
                break;
            
            case 2:
                result=(input1-input2);
                System.out.println("Subtraction of "+input1+" & "+input2+" is "+result);
                break;
            case 3:
                 result=(input1*input2);
                 System.out.println("Multiplication of "+input1+" & "+input2+" is "+result);
                 break;
            case 4:
                 result = ((float)input1/input2);
                 System.out.println("Division of "+input1+" & "+input2+" is "+result);
                 break;
            case 5:
                 result = (input1%input2);
                 System.out.println("Modulus of "+input1+" & "+input2+" is "+result);
                 break;
            default:
                 System.out.println("Check input no again (X_X)!!!! ");
                 break;
        }   
    }
}