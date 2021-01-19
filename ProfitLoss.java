import java.util.Scanner;
 class ProfitLoss {
    public static void main(String[] args) {
        float result,sellingPrice,costPrice;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Selling Price:");
        sellingPrice = s.nextFloat();
        System.out.println("Enter Cost Price");
        costPrice = s.nextFloat();
        result = (sellingPrice-costPrice);
        if (result==0)
          System.out.println("There is no Profit Or Loss (#_#) ");
        else if (result>0)
           System.out.println("You made a profit of "+result+" (0_<)");
        else 
           System.out.println("You had a loss of -"+result+"(0_0) ");
           s.close();
    }
}