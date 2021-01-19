import java.util.Scanner;
abstract class Area {
    abstract void Rectangle(double length, double breadth);
}
class findArea extends Area {
    void Rectangle(double length, double breadth){
        double area = (breadth*length);
        System.out.println("Area of Rectangle: "+area);
    }
}

class AbstractClassArea{
    public static void main(String[] args) {
        double length ,breadth;
        findArea area = new findArea();
        Scanner get = new Scanner(System.in);

        System.out.println("Enter Length & Breadth of Rectangle: ");
        length = get.nextDouble();
        breadth = get.nextDouble();
        area.Rectangle(length, breadth);
        get.close();
    }
}