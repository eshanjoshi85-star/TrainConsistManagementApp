//Version 4.0
//Eshan Pankaj Joshi
//UC1: Initialize train consist
//UC2: Passenger Bogie Operations
//UC3: Track Unique Bogie IDs
//UC4: Maintain Ordered Bogie IDs (TreeSet & SortedSet)
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
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

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("Unique Bogie IDs: " + bogieIds);

        // ---------------- UC4 ----------------
        System.out.println("\nMaintaining ordered train consist using LinkedList...");

        LinkedList<String> linkedTrain = new LinkedList<>();

        // Add bogies
        linkedTrain.add("Engine");
        linkedTrain.add("Sleeper");
        linkedTrain.add("AC");
        linkedTrain.add("Cargo");
        linkedTrain.add("Guard");

        System.out.println("Initial train consist: " + linkedTrain);

        // Insert Pantry Car at position 2
        linkedTrain.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car at position 2: " + linkedTrain);

        // Remove first and last bogie
        linkedTrain.removeFirst();
        linkedTrain.removeLast();

        System.out.println("After removing first and last bogie: " + linkedTrain);

        // Final output
        System.out.println("Final ordered train consist: " + linkedTrain);
    }
}