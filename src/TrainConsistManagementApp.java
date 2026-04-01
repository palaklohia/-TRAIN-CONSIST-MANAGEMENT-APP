import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize Passenger Bogie List
        List<String> passengerBogies = new ArrayList<>();

        System.out.println("\nTrain consist initialized.");
        System.out.println("Initial bogie count: " + passengerBogies.size());

        // ==============================
        // ADD (Create)
        // ==============================
        System.out.println("\nAdding passenger bogies...");

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // ==============================
        // READ (Display)
        // ==============================
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // ==============================
        // DELETE (Remove)
        // ==============================
        System.out.println("\nRemoving 'AC Chair' bogie...");
        passengerBogies.remove("AC Chair");

        // ==============================
        // CHECK EXISTENCE
        // ==============================
        System.out.println("\nChecking if 'Sleeper' exists...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie NOT found.");
        }

        // ==============================
        // FINAL STATE
        // ==============================
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);

        System.out.println("\nProgram continues...");
    }
}