import java.util.Scanner;

 class Demo17 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the variable to hold the sum of digits
        int sum = 0;

        // Calculate the sum of digits
        while (number != 0) {
            sum += number % 10; // Get the last digit
            number /= 10;       // Remove the last digit
        }

        // Display the result
        System.out.println("The sum of the digits is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
