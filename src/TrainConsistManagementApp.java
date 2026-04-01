import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainConsistManagementApp {

    // ==============================
    // Bogie Class (Custom Object)
    // ==============================
    static class Bogie {
        private String name;
        private int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String getName() {
            return name;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return name + " → Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // ==============================
        // Create List of Bogies
        // ==============================
        List<Bogie> bogies = new ArrayList<>();

        System.out.println("\nAdding passenger bogies...");

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 40));

        // ==============================
        // Before Sorting
        // ==============================
        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ==============================
        // Sorting using Comparator (by capacity)
        // ==============================
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // ==============================
        // After Sorting
        // ==============================
        System.out.println("\nAfter Sorting (Ascending by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ==============================
        // Optional: Descending Order
        // ==============================
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());

        System.out.println("\nAfter Sorting (Descending by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nProgram continues...");
    }
}