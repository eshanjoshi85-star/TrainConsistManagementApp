//Version 7.0
//Eshan Pankaj Joshi
//UC1: Initialize train consist
//UC2: Passenger Bogie Operations
//UC3: Track Unique Bogie IDs
//UC4: Maintain Ordered Bogie IDs (TreeSet & SortedSet)
//UC5: Preserve Insertion Order of Bogies
//UC6: Map Bogie to Capacity (HashMap)
//UC7: Sort Bogies by Capacity (Comparator)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;

public class TrainApp {

    // ----------- Bogie Class for UC7 -----------
    static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (Capacity: " + capacity + ")";
        }
    }

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

        linkedTrain.add("Engine");
        linkedTrain.add("Sleeper");
        linkedTrain.add("AC");
        linkedTrain.add("Cargo");
        linkedTrain.add("Guard");

        System.out.println("Initial train consist: " + linkedTrain);

        linkedTrain.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car at position 2: " + linkedTrain);

        linkedTrain.removeFirst();
        linkedTrain.removeLast();

        System.out.println("After removing first and last bogie: " + linkedTrain);
        System.out.println("Final ordered train consist: " + linkedTrain);

        // ---------------- UC5 ----------------
        System.out.println("\nPreserving insertion order with uniqueness using LinkedHashSet...");

        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper"); // duplicate

        System.out.println("Final train formation (no duplicates, ordered): " + trainFormation);

        // ---------------- UC6 ----------------
        System.out.println("\nMapping bogies to their capacities using HashMap...");

        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 24);

        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogie = entry.getKey();
            Integer capacity = entry.getValue();

            System.out.println(bogie + " -> Capacity: " + capacity);
        }

        // ---------------- UC7 ----------------
        System.out.println("\nSorting bogies by capacity using Comparator...");

        List<Bogie> bogieList = new ArrayList<>();

        // Add bogie objects
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 24));

        System.out.println("Before sorting:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        // Sort using Comparator (Lambda)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter sorting by capacity:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }
    }
}