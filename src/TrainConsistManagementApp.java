import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ==============================
        // Step 1: Ensure Uniqueness (Set)
        // ==============================
        Set<String> uniqueBogieIds = new HashSet<>();

        // ==============================
        // Step 2: Maintain Order (LinkedList)
        // ==============================
        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println("\nAdding bogies to train...");

        // Helper method logic inline (to avoid duplicates)
        addBogie(uniqueBogieIds, trainConsist, "Engine");
        addBogie(uniqueBogieIds, trainConsist, "Sleeper");
        addBogie(uniqueBogieIds, trainConsist, "AC");
        addBogie(uniqueBogieIds, trainConsist, "Cargo");
        addBogie(uniqueBogieIds, trainConsist, "Guard");

        // Try duplicate
        addBogie(uniqueBogieIds, trainConsist, "AC"); // ignored

        // ==============================
        // Insert at specific position
        // ==============================
        System.out.println("\nInserting Pantry Car at position 2...");
        trainConsist.add(2, "Pantry");

        // ==============================
        // Remove operations
        // ==============================
        System.out.println("\nRemoving first bogie...");
        trainConsist.removeFirst();

        System.out.println("Removing last bogie...");
        trainConsist.removeLast();

        // ==============================
        // Final Output
        // ==============================
        System.out.println("\nFinal Train Consist (Ordered):");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }

        System.out.println("\nProgram continues...");
    }

    // Method to ensure uniqueness + ordered insertion
    public static void addBogie(Set<String> set, LinkedList<String> list, String bogie) {
        if (set.add(bogie)) { // only adds if not duplicate
            list.addLast(bogie);
        } else {
            System.out.println("Duplicate ignored: " + bogie);
        }
    }
}