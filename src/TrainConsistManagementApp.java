import java.util.*;
import java.util.stream.Collectors;

// Bogie Class
class Bogie {
    private int bogieId;
    private int capacity;

    public Bogie(int bogieId, int capacity) {
        this.bogieId = bogieId;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie ID: " + bogieId + ", Capacity: " + capacity;
    }
}

// Main Application
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create list of bogies (UC7 reused)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie(1, 50));
        bogies.add(new Bogie(2, 70));
        bogies.add(new Bogie(3, 80));
        bogies.add(new Bogie(4, 60));
        bogies.add(new Bogie(5, 90));

        System.out.println("=== Original Bogie List ===");
        bogies.forEach(System.out::println);

        // Step 2: Convert to Stream + Filter + Collect
        int threshold = 70;

        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > threshold) // lambda condition
                .collect(Collectors.toList());

        // Step 3: Display filtered result
        System.out.println("\n=== Filtered Bogies (Capacity > " + threshold + ") ===");
        filteredBogies.forEach(System.out::println);

        // Step 4: Verify original list unchanged
        System.out.println("\n=== Original List After Filtering (Unchanged) ===");
        bogies.forEach(System.out::println);
    }
}