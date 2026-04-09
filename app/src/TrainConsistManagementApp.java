//Version 3.0
//Eshan Pankaj Joshi
//UC1: Initialize train consist
//UC2: Passenger Bogie Operations
//UC3: UC3-Track Unique Bogie IDs
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {

        // ---------------- UC1 ----------------
        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // ---------------- UC2 ----------------
        System.out.println("\nAdding passenger bogies...");

        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("Bogies after addition: " + trainConsist);

        System.out.println("\nRemoving 'AC Chair' bogie...");
        trainConsist.remove("AC Chair");

        System.out.println("Bogies after removal: " + trainConsist);

        System.out.println("\nChecking if 'Sleeper' bogie exists...");
        if (trainConsist.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is NOT present in the train.");
        }

        System.out.println("\nFinal bogie list: " + trainConsist);

        // ---------------- UC3 ----------------
        System.out.println("\nTracking unique bogie IDs...");

        // Create HashSet for unique IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (with duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs: " + bogieIds);


    }
}