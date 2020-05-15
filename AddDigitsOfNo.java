import java.util.Scanner;
 class AddDigit
{
    public static void main(String[] args) {
        int sum=0,ld;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        
        while(num>0)
        {
            ld=num%10;
            sum=sum+ld;
            num=num/10;
        }
        System.out.println("sum:"+sum);
    }
}
