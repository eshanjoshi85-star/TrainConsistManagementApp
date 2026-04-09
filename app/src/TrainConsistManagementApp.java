//Version 2.0
//Eshan Pankaj Joshi
//UC1: Initialize train consist
//UC2: Passenger Bogie Operations
import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        // Welcome message (UC1)
        System.out.println("=== Train Consist Management App ===");

        // Initialize train consist (UC1)
        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // ---------------- UC2: Passenger Bogie Operations ----------------

        System.out.println("\nAdding passenger bogies...");

        // Add bogies
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        // Display bogies after insertion
        System.out.println("Bogies after addition: " + trainConsist);

        // Remove a bogie (AC Chair)
        System.out.println("\nRemoving 'AC Chair' bogie...");
        trainConsist.remove("AC Chair");

        // Display after removal
        System.out.println("Bogies after removal: " + trainConsist);

        // Check if Sleeper exists
        System.out.println("\nChecking if 'Sleeper' bogie exists...");
        if (trainConsist.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is NOT present in the train.");
        }

        // Final state
        System.out.println("\nFinal bogie list: " + trainConsist);

        // Program continues...
    }
}