import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three numbers
        System.out.print("Enter three numbers separated by spaces: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Find the largest number and calculate the average
        int largest = Math.max(num1, Math.max(num2, num3));
        double average = (num1 + num2 + num3) / 3.0;

        // Output the results
        System.out.println("Largest number: " + largest);
        System.out.println("Sum of the largest number: " + largest);
        System.out.println("Average of the three numbers: " + average);

        scanner.close();
    }
}
