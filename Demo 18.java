import java.util.Scanner;

 class Demo18 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        
        long minutesInYear = 60 * 24 * 365; 
        long years = minutes / minutesInYear; 
        long remainingMinutes = minutes % minutesInYear; 
        long minutesInDay = 60 * 24; // 
        long days = remainingMinutes / minutesInDay; 

       
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

        
        scanner.close();
    }
}
