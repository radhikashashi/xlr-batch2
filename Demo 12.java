import java.util.Scanner;

class Demo12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        scanner.close();
    }
}
