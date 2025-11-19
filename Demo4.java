import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int count = input.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
