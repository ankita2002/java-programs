import java.util.Scanner;
import Arithmetic.Arithmetic;

class test
{
    public static void main(final String[] args) {
        System.out.println("Choice: \n1.Add\n2.Subtract\n3.Multiply\n4.Division\n5.Mod");
        final Scanner s = new Scanner(System.in);
        final int option = s.nextInt();
        final Arithmetic m = new Arithmetic();
        System.out.println("Enter Two Values");
        final int a = s.nextInt();
        final int b = s.nextInt();
        switch (option) {
            case 1:
               System.out.println(m.add(a, b));
               break;
            case 2:
               System.out.println(m.sub(a, b));
               break;
            case 3:
               System.out.println(m.mul(a, b));
               break;
            case 4:
               System.out.println(m.div(a, b));
               break;
            case 5:
               System.out.println(m.mod(a, b));
               break;
            default:
               System.out.println("INVALID CHOICE");
        }
        s.close();
    }
}