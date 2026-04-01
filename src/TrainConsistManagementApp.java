import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // ==============================
        // Initialize HashSet for Bogie IDs
        // ==============================
        Set<String> bogieIds = new HashSet<>();

        System.out.println("\nAdding bogie IDs...");

        // Adding bogies (including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // ==============================
        // Display Unique Bogies
        // ==============================
        System.out.println("\nFinal Bogie IDs (Duplicates Automatically Removed):");
        System.out.println(bogieIds);

        // ==============================
        // Show Size to Prove Uniqueness
        // ==============================
        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());

        System.out.println("\nProgram continues...");
    }
}