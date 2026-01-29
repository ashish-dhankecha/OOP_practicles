package OOP_Practicle;
import java.util.*;
class LoanCalculator{
      double calculateEMI(int principal,int time , float rate){
          double mounthly_intrest = rate/(12*100);
          int months = time*12;
          return (principal*mounthly_intrest*Math.pow(mounthly_intrest+1, months))/(Math.pow(mounthly_intrest+1, months)-1);
      }
      double calculateEMI(double principal,int time , float rate){
          double mounthly_intrest = rate/(12*100);
          int months = time*12;
          return (principal*mounthly_intrest*Math.pow(mounthly_intrest+1, months))/(Math.pow(mounthly_intrest+1, months)-1);
      }
      double calculateEMI(int principal,int time ){
          double mounthly_intrest = 10;
          int months = time*12;
          return (principal*mounthly_intrest*Math.pow(mounthly_intrest+1, months))/(Math.pow(mounthly_intrest+1, months)-1);
      }
}
public class pra7 {
    public static void main(String[] args) {
        LoanCalculator loan = new LoanCalculator();
        double homeloan = loan.calculateEMI(5000000, 20, 7.2f);
        double carloan = loan.calculateEMI(50000000, 5, 9);
        double personalloan = loan.calculateEMI(500000,3);
        System.out.printf("homeloan: %.2f\n",homeloan);
        System.out.printf("carloan: %.2f\n",carloan);
        System.out.printf("personalloan: %.2f\n",personalloan);
    }
}
