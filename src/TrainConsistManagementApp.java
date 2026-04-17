import java.util.*;
import java.util.stream.*;

// Goods Bogie Class
class GoodsBogie {
    private int bogieId;
    private String type;   // Cylindrical, Open, Box
    private String cargo;  // Petroleum, Coal, Grain, etc.

    public GoodsBogie(int bogieId, String type, String cargo) {
        this.bogieId = bogieId;
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Bogie ID: " + bogieId + ", Type: " + type + ", Cargo: " + cargo;
    }
}

// Main Application
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Step 1: Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie(1, "Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie(2, "Open", "Coal"));
        bogies.add(new GoodsBogie(3, "Box", "Grain"));
        bogies.add(new GoodsBogie(4, "Cylindrical", "Petroleum"));

        System.out.println("=== Goods Bogies ===");
        bogies.forEach(System.out::println);

        // Step 2: Stream + allMatch() safety validation
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        // Rule: Cylindrical → only Petroleum
                        !b.getType().equals("Cylindrical")
                                || b.getCargo().equals("Petroleum")
                );

        // Step 3: Display result
        System.out.println("\n=== Safety Validation ===");
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }

        // Step 4: Verify original list unchanged
        System.out.println("\n=== Original List After Validation (Unchanged) ===");
        bogies.forEach(System.out::println);
    }
}