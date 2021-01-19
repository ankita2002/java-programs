import java.util.Scanner;

public class Even_nos {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Even numbers");
        do {

            System.out.println(i * 2);
            i += 1;
        } while (i <= n);
        sc.close();
    }
}

