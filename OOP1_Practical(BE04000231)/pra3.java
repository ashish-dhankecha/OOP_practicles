public class pra3 {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Please provide exactly two integer arguments.");
            return;
        }

        int num1 = Integer.valueOf(args[0]);
        int num2 = Integer.valueOf(args[1]);

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);
    }
}

