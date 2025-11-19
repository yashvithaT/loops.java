import java.util.Scanner;
public class Demo3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;  // frequency counter
        for (int i = 1; i <= 5; i++) { 
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            if (num > 100) {
                count++;
            }
        }
        System.out.println("Numbers greater than 100: " + count);
       scanner.close();
    }
}
