import java.util.Scanner;
public class AddMatrix {
    public static void main(String[] args)
    {
        int a,b,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nOUTPUT\n \nEnter No of Rows and Columns: ");
        a=sc.nextInt();
        b=sc.nextInt();

        int first[][] = new int[a][b];
        int second[][] = new int[a][b];
        int sum[][] = new int[a][b];

        System.out.println("\nEnter Elements of First Matrix: ");

        for(i=0;i<a;i++) {
            for(j=0;j<b;j++) {
                first[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nEnter Elements of Second Matrx: ");

        for(i=0;i<a;i++) {
            for(j=0;j<b;j++) {
                second[i][j] = sc.nextInt();
            }
        }

        for(i=0;i<a;i++) {
            for(j=0;j<b;j++) {
                sum[i][j] = first[i][j] + second[i][j];
            }
        }
        System.out.println("\nSum of Matrix: ");

        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++) {
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}