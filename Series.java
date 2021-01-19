import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        double sum = 0;
        int n, x;
        System.out.println("1/1! + 2/2! + 3/3! + ..N/N!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of terms in series:");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            x = i;
            int mul = 1;
            while (x > 0) {
                mul = mul * x;
                x--;
            }
            sum += (double) i / (double) mul;
        }
        System.out.println("Sum of series:" + sum);
        sc.close();
    }
}