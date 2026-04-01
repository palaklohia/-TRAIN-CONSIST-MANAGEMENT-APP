import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // ==============================
        // LinkedHashSet for Train Formation
        // ==============================
        Set<String> trainFormation = new LinkedHashSet<>();

        System.out.println("\nAttaching bogies to train...");

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate
        System.out.println("\nAttempting to add duplicate bogie: Sleeper");
        boolean isAdded = trainFormation.add("Sleeper");

        if (!isAdded) {
            System.out.println("Duplicate ignored: Sleeper");
        }

        // ==============================
        // Display Formation
        // ==============================
        System.out.println("\nFinal Train Formation (Ordered & Unique):");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }

        System.out.println("\nProgram continues...");
    }
}