import java.util.*;
interface result {
    double calc(double phy, double chem, double math);
}

class student implements result{
    public double calc(double phy, double chem, double math)
    {
        return((phy + chem + math)/3);
    }
}

class ClassResult {
    public static void main(String[] args) 
    {
        student a = new student();
        result r;
        r=a;
        System.out.println("Result: " +r.calc(78, 82, 67) +"%");
    }
}
