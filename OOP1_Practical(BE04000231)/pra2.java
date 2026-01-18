import java.util.Scanner;

public class pra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        int result = 0;
        int place = 1;

        while (num > 0) {
            int digit = num % 10;

            digit = (digit + 1) % 10;

            result = result + digit * place;
            place = place * 10;

            num = num / 10;
        }

        System.out.println("New number: " + result);

        sc.close();
    }
}

