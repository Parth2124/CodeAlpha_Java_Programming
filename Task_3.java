// @CodeAlpha
// #CodeAlpha

// Travel Agency (Task 3)
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for destination
        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        // Get user input for travel dates
        System.out.print("Enter travel dates (e.g., DD/MM/YYYY - DD/MM/YYYY): ");
        String travelDates = sc.nextLine();

        char option = '\0';
        System.out.println("B. Budget");
        System.out.println("W. Weather");
        System.out.println("M. Map");
        System.out.println("A. All Three of Them");
        System.out.print("Enter your choice: ");
        option = sc.nextLine().toUpperCase().charAt(0);

        System.out.println("Generating travel plan for " + destination + " from " + travelDates);
        switch (option) {
            case 'B':
                System.out.println("=========================================================");
                System.out.println("Calculating budget for the trip to " + destination);
                System.out.println("Your Budget will be around: " + Math.random() * 5939393l);
                System.out.println("=========================================================");
                break;
            case 'W':
                System.out.println("=========================================================");
                System.out.println("Fetching weather information for " + destination);
                System.out.println("Your Weather will be : Cold");
                System.out.println("=========================================================");
                break;
            case 'M':
                System.out.println("=========================================================");
                System.out.println("Fetching maps for " + destination);
                System.out.println("Your Distance will be approx: " + Math.random() * 10000l + "Km");
                System.out.println("=========================================================");
                break;
            case 'A':
                System.out.println("==================================================================");
                System.out.println("Calculating budget for the trip to " + destination + "====================");
                System.out.println("Your Budget will be around: " + Math.random() * 5939393l + "Rs");
                System.out.println("Fetching weather information for " + destination + "====================");
                System.out.println("Your Weather will be : Cold");
                System.out.println("Fetching maps for " + destination + "==============================");
                System.out.println("Your Distance will be approx: " + Math.random() * 10000l + "Km");
                System.out.println("==================================================================");

            default:
                break;
        }

        System.out.println("************ Travel Plan ************");
        System.out.println("Destination: " + destination);
        System.out.println("Travel Dates: " + travelDates);
        System.out.println("Happy Journy Thank you for using our services");
        System.out.println("************ End of Plan ************");

        sc.close();
    }
}
