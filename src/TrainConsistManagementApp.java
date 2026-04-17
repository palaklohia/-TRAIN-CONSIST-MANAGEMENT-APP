import java.util.*;
import java.util.stream.Collectors;

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

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Bogie ID: " + bogieId + ", Type: " + type + ", Capacity: " + capacity;
    }
}

// Main Application
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create bogie list (reuse from UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie(1, "Sleeper", 72));
        bogies.add(new Bogie(2, "AC Chair", 60));
        bogies.add(new Bogie(3, "Sleeper", 75));
        bogies.add(new Bogie(4, "First Class", 40));
        bogies.add(new Bogie(5, "AC Chair", 65));

        System.out.println("=== Original Bogie List ===");
        bogies.forEach(System.out::println);

        // Step 2: Stream + groupingBy
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.getType()));

        // Step 3: Display grouped result
        System.out.println("\n=== Grouped Bogies by Type ===");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());
            entry.getValue().forEach(System.out::println);
        }

        // Step 4: Verify original list unchanged
        System.out.println("\n=== Original List After Grouping (Unchanged) ===");
        bogies.forEach(System.out::println);
    }
}