import java.util.Scanner;

public class SumRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int sum = 0;

        if (start <= end) {
            for (int i = start; i <= end; i++) {
                sum = sum + i;
            }
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("Invalid Range");
        }

        sc.close();
    }
}