import java.util.Scanner;

public class pra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to be dispensed: ");
        int amount = sc.nextInt();

        int[] notes = {100, 50, 10, 5, 2, 1};

        System.out.println("Currency notes used:");

        for (int note : notes) {
            int count = amount / note;

            if (count > 0) {
                System.out.println(note + " : " + count);
            }

            amount = amount % note;
        }

        sc.close();
    }
}

