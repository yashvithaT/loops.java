import java.util.Scanner;
public class Demo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want to add together? ");
        int count = input.nextInt();
        int sum = 0;  
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();
            sum += num; 
        }
        System.out.println("The total sum is: " + sum);
    }
}
