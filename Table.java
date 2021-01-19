import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("The table is: ");
        for (i = 1; i <= 10; i++) {
            System.out.print(" " + n * i);
        }
        sc.close();
    }
}