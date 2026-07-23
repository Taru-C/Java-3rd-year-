import java.util.Scanner;

public class ReverseSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int rev = 0, sum = 0;

        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println("Reverse = " + rev);
        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}