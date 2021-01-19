import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Length of Array:");
        int n = s.nextInt();
        int array[] = new int[n];
        int copy[] = new int[n];
        System.out.println("Enter Elements of Array:");
        for(int i=0;i<n;i++)
           array[i] = s.nextInt();
        for(int i=0;i<n;i++)
           copy[n-i-1] = array[i];
        System.out.println("The Reverse array is: ");
        for(int i=0;i<n;i++)
           System.out.print(copy[i]+" ");
        s.close();
    }
}