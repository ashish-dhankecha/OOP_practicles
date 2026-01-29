package OOP_Practicle;
import java.util.Scanner;
class BankAccount{
    String accountid;
    String accountHolderName;
    double balance;
    void assighValue(String id,String name , double b){
        accountid = id;
        accountHolderName = name;
        balance = b;
    }
    void display(){
        System.out.println("Account ID of given account is "+accountid);
        System.out.println("name of account holder is "+accountHolderName);
        System.out.println("balance of given account is "+balance);
    }
    void search(BankAccount[] A,String i){
        for(BankAccount j : A){
            if(j.accountid.equals(i)){
                System.out.println("Account no "+j.accountid+" found.");
                return;
            } 
        }
        System.out.println("Account no "+i+" Not found.");
    }
}
public class pra5 {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];
        for(int i =0;i<5;i++){
            accounts[i] = new BankAccount();
        }
        accounts[0].assighValue("101", "ashish", 50000);
        accounts[1].assighValue("102", "meet", 4785102.25);
        accounts[2].assighValue("103","taksh",2488562);
        accounts[3].assighValue("104","Harsh" , 2544545);
        accounts[4].assighValue("105","Ridham",58641213);
        System.out.println("Displaying informatations of account holders...");
        for(int i =0;i<5;i++){
            accounts[i].display();
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("enter account id you want to search:");
        String id = sc.nextLine();
        accounts[0].search(accounts,id);

    }
}
