import java.util.*;
import java.util.stream.*;

// Bogie Class
class Bogie {
    private int bogieId;
    private String type;
    private int capacity;

    public Bogie(int bogieId, String type, int capacity) {
        this.bogieId = bogieId;
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie ID: " + bogieId + ", Type: " + type + ", Capacity: " + capacity;
    }
}

// Main Application
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create list of bogies (reuse from previous UC)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie(1, "Sleeper", 72));
        bogies.add(new Bogie(2, "AC Chair", 60));
        bogies.add(new Bogie(3, "Sleeper", 75));
        bogies.add(new Bogie(4, "First Class", 40));
        bogies.add(new Bogie(5, "AC Chair", 65));

        System.out.println("=== Original Bogie List ===");
        bogies.forEach(System.out::println);

        // Step 2: Stream → map → reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.getCapacity())     // extract capacity
                .reduce(0, Integer::sum);      // aggregate (sum)

        // Step 3: Display total
        System.out.println("\n=== Total Seating Capacity ===");
        System.out.println("Total Capacity: " + totalCapacity);

        // Step 4: Verify original list unchanged
        System.out.println("\n=== Original List After Aggregation (Unchanged) ===");
        bogies.forEach(System.out::println);
    }
}