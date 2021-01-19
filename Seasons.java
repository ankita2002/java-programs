import java.util.Scanner;
public class Seasons {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter any month From 1-12");
       int month = s.nextInt(); 
       System.out.println("Season of the entered month is");
       switch (month) {
           case 12:
           case 11:
           case 10:
           case 1: 
               System.out.println("Winter");
               break;
           case 2:
           case 3:
           case 4:
           case 5:
              System.out.println("Summer");
              break;
            case 6:
            case 7:
            case 8:
            case 9:
               System.out.println("Monsoon");
               break;
           default: System.out.println("INVALID INPUT");
               break;
       } 
    }
}