import java.util.Scanner;

class Demo6{
    public static void main(String[] args) {
        
        String validUsername = "KLRAHUL";
        String validPassword = "KLRAHUL@123";

        Scanner scanner = new Scanner(System.in);
        boolean isAuthenticated = false;

        // Use a while loop to authenticate the user
        while (!isAuthenticated) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            // Check if the input matches the valid credentials
            if (inputUsername.equals(validUsername) && inputPassword.equals(validPassword)) {
                System.out.println("Welcome KLRAHUL");
                isAuthenticated = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

        scanner.close();
    }
}
