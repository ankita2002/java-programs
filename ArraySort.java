
import java.util.Arrays;
public class ArraySort
{
    public static void main(String[] args)
    {
        String a[]={"Deamon","Dowson","Levi","Katy","Bethany","Edward","Bella","Robbie","Roh"};
        Arrays.sort(a);
        System.out.println("\n\nSorted Array: \n");
        for(int i=0;i<a.length;i++)
        {
        System.out.println(a[i]);
        }
        System.out.println("\n\n");
    }
}