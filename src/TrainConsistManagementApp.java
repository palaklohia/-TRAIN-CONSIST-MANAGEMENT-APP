import java.util.*;

// Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    private int bogieId;
    private String type;
    private int capacity;

    // Constructor with validation
    public PassengerBogie(int bogieId, String type, int capacity) throws InvalidCapacityException {

        // Fail-Fast Validation
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.bogieId = bogieId;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie ID: " + bogieId + ", Type: " + type + ", Capacity: " + capacity;
    }
}

// Main Application
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        List<PassengerBogie> bogies = new ArrayList<>();

        // Test Cases Simulation
        try {
            // Valid Bogie
            PassengerBogie b1 = new PassengerBogie(1, "Sleeper", 72);
            bogies.add(b1);
            System.out.println("Created: " + b1);

            // Invalid Bogie (negative)
            PassengerBogie b2 = new PassengerBogie(2, "AC Chair", -10);
            bogies.add(b2); // will not execute

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Invalid Bogie (zero)
            PassengerBogie b3 = new PassengerBogie(3, "First Class", 0);
            bogies.add(b3);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Another valid bogie
            PassengerBogie b4 = new PassengerBogie(4, "AC Chair", 60);
            bogies.add(b4);
            System.out.println("Created: " + b4);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Final valid bogies list
        System.out.println("\n=== Valid Passenger Bogies ===");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}