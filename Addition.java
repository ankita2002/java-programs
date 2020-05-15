import java.util.Scanner;
class add
{
    int a,b;     //Declaration of variables
}
class addition
{
    public static void main(String[] args) 
    {
        int total;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Values");
        add obj1=new add(); //object created
        obj1.a=sc.nextInt();//object given input for a
        obj1.b=sc.nextInt();//object given input for b
        total=obj1.a+obj1.b;
        System.out.println("Total is "+total);
    }
}
