package firstjava;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in meters: ");
        double distance = scanner.nextDouble();

        System.out.print("Enter the time taken (hours): ");
        int hours = scanner.nextInt();

        System.out.print("Enter the time taken (minutes): ");
        int minutes = scanner.nextInt();

        System.out.print("Enter the time taken (seconds): ");
        int seconds = scanner.nextInt();

        int tsec = (hours * 3600) + (minutes * 60) + seconds;

        double speedInMetersPerSecond = distance / tsec;

        double speedInKilometersPerHour = (distance / 1000) / (tsec / 3600);

        double speedInMilesPerHour = (distance / 1609) / (tsec / 3600);

        System.out.println("Speed in meters per second: " + speedInMetersPerSecond);
        System.out.println("Speed in kilometers per hour: " + speedInKilometersPerHour);
        System.out.println("Speed in miles per hour: " + speedInMilesPerHour);
    }
 
}
