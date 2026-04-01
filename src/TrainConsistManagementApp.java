import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // ==============================
        // HashMap for Bogie → Capacity
        // ==============================
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        System.out.println("\nAdding bogie capacity details...");

        // Insert bogie-capacity mapping
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 40);

        // ==============================
        // Display using entrySet()
        // ==============================
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogie = entry.getKey();
            Integer capacity = entry.getValue();

            System.out.println("Bogie: " + bogie + " → Capacity: " + capacity);
        }

        // ==============================
        // Fast Lookup Example
        // ==============================
        System.out.println("\nChecking capacity of Sleeper...");
        int sleeperCapacity = bogieCapacityMap.get("Sleeper");
        System.out.println("Sleeper Capacity: " + sleeperCapacity);

        System.out.println("\nProgram continues...");
    }
}