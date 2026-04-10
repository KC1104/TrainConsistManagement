import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagement {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("  UC2 - Add Passenger Bogies to Train ");
        System.out.println("====================================");

        // Create an ArrayList to hold passenger bogies
        List<String> trainConsist = new ArrayList<>();

        // CREATE (Add bogies)
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("\nAfter Adding Bogies:");
        System.out.println("Passenger Bogies : " + trainConsist);

        // DELETE (Remove bogie)
        trainConsist.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + trainConsist);

        // SEARCH (Check if exists)
        System.out.println("\nChecking if 'Sleeper' exists:");
        boolean exists = trainConsist.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + exists);

        // FINAL OUTPUT
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(trainConsist);

        System.out.println("\nUC2 operations completed successfully...");
    }
}