package OOP_Practicle;
import java.util.*;
class BillGenerator{
    void generateBill(int itemTotal){
        System.out.println("Your total bill is "+ itemTotal+".");
    }
    void generateBill(int itemTotal,int f){
        System.out.println("Your total bill is "+ (itemTotal - f)+".");
    }
    void generateBill(int itemTotal,double discountpersentage){
        System.out.println("Your total bill is "+ (itemTotal - (itemTotal*discountpersentage/100))+".");
    }
    
}
public class pra6 {
    public static void main(String[] args) {
        BillGenerator bg = new BillGenerator();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter itmtotal:");
        int total = sc.nextInt();
        System.out.println("1.Regular Customer");
        System.out.println("2.privileged customers");
        System.out.println("3.festive offer");
        System.out.print("enter customer type:");
        int n = sc.nextInt();
        switch(n){
            case 1:
                 bg.generateBill(total);
                 break;
            case 2:
                System.out.print("enter flat discount:");
                int f = sc.nextInt();
                bg.generateBill(total, f);
                break;
            case 3:
                System.out.println("enter discount persantage:");
                double p = sc.nextDouble();
                bg.generateBill(total, p);
                break;
            default :
                System.out.println("please enter valis customer type");
                
        }
    }
}
