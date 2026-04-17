//Version 13.0
//Eshan Pankaj Joshi
//UC1: Initialize train consist
//UC2: Passenger Bogie Operations
//UC3: Track Unique Bogie IDs
//UC4: Maintain Ordered Bogie IDs (TreeSet & SortedSet)
//UC5: Preserve Insertion Order of Bogies
//UC6: Map Bogie to Capacity (HashMap)
//UC7: Sort Bogies by Capacity (Comparator)
//UC8: Filter Passenger Bogies Using Streams
//UC9: Group Bogies by Type
//UC10: Count Total Seats in Train
//UC11: Validate Train ID & Cargo Codes
//UC12: Safety Compliance Check for Goods Bogies
//UC13: Performance Comparison (Loops vs Streams)
//UC14: Invalid Bogie Capacity

import java.util.*;
import java.util.stream.Collectors;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainApp {

    // ----------- UC14: Custom Exception -----------
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ----------- Bogie Class (Updated with Validation) -----------
    static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
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
        System.out.println(trainConsist.contains("Sleeper") ?
                "Sleeper bogie is present in the train." :
                "Sleeper bogie is NOT present in the train.");

        System.out.println("\nFinal bogie list: " + trainConsist);

        // ---------------- UC3 ----------------
        System.out.println("\nTracking unique bogie IDs...");
        Set<String> bogieIds = new HashSet<>();
        bogieIds.addAll(Arrays.asList("BG101", "BG102", "BG103", "BG101", "BG102"));
        System.out.println("Unique Bogie IDs: " + bogieIds);

        // ---------------- UC4 ----------------
        System.out.println("\nMaintaining ordered train consist using LinkedList...");
        LinkedList<String> linkedTrain = new LinkedList<>();
        linkedTrain.addAll(Arrays.asList("Engine", "Sleeper", "AC", "Cargo", "Guard"));

        System.out.println("Initial train consist: " + linkedTrain);

        linkedTrain.add(2, "Pantry Car");
        linkedTrain.removeFirst();
        linkedTrain.removeLast();

        System.out.println("Final ordered train consist: " + linkedTrain);

        // ---------------- UC5 ----------------
        System.out.println("\nPreserving insertion order using LinkedHashSet...");
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();
        trainFormation.addAll(Arrays.asList("Engine", "Sleeper", "Cargo", "Guard", "Sleeper"));
        System.out.println("Train formation: " + trainFormation);

        // ---------------- UC6 ----------------
        System.out.println("\nMapping bogies to capacities...");
        Map<String, Integer> bogieCapacityMap = new HashMap<>();
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 60);
        bogieCapacityMap.put("First Class", 24);

        bogieCapacityMap.forEach((k, v) ->
                System.out.println(k + " -> Capacity: " + v));

        // ---------------- UC7 ----------------
        System.out.println("\nSorting bogies by capacity...");

        List<Bogie> bogieList = new ArrayList<>();

        try {
            bogieList.add(new Bogie("Sleeper", 72));
            bogieList.add(new Bogie("AC Chair", 60));
            bogieList.add(new Bogie("First Class", 24));
        } catch (InvalidCapacityException e) {
            System.out.println("Initialization Error: " + e.getMessage());
        }

        System.out.println("Before sorting:");
        bogieList.forEach(System.out::println);

        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter sorting:");
        bogieList.forEach(System.out::println);

        // ---------------- UC8 ----------------
        System.out.println("\nFiltering bogies with capacity > 60...");
        List<Bogie> filteredBogies = bogieList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        filteredBogies.forEach(System.out::println);

        // ---------------- UC9 ----------------
        System.out.println("\nGrouping bogies by type...");
        Map<String, List<Bogie>> groupedBogies =
                bogieList.stream().collect(Collectors.groupingBy(b -> b.name));

        groupedBogies.forEach((k, v) ->
                System.out.println(k + " -> " + v));

        // ---------------- UC10 ----------------
        System.out.println("\nCalculating total seating capacity...");
        int totalCapacity = bogieList.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
        System.out.println("Total Capacity: " + totalCapacity);

        // ---------------- UC11 ----------------
        System.out.println("\nValidating Train ID & Cargo Code...");

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        System.out.println("Train ID Valid: " + trainPattern.matcher(trainId).matches());
        System.out.println("Cargo Code Valid: " + cargoPattern.matcher(cargoCode).matches());

        // ---------------- UC12 ----------------
        System.out.println("\nChecking safety compliance...");

        class GoodsBogie {
            String type, cargo;
            GoodsBogie(String t, String c) { type = t; cargo = c; }
            public String toString() { return type + " -> " + cargo; }
        }

        List<GoodsBogie> goodsBogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Open", "Coal"),
                new GoodsBogie("Box", "Grain")
        );

        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> !b.type.equalsIgnoreCase("Cylindrical")
                        || b.cargo.equalsIgnoreCase("Petroleum"));

        System.out.println("Safety Status: " + (isSafe ? "SAFE" : "UNSAFE"));

        // ---------------- UC13 ----------------
        System.out.println("\nPerformance: Loop vs Stream...");

        List<Bogie> performanceList = new ArrayList<>();

        try {
            for (int i = 1; i <= 10000; i++) {
                performanceList.add(new Bogie("Sleeper", 50 + (i % 50)));
            }
        } catch (InvalidCapacityException e) {
            System.out.println("Performance Data Error: " + e.getMessage());
        }

        long loopStart = System.nanoTime();
        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : performanceList) {
            if (b.capacity > 60) loopResult.add(b);
        }
        long loopTime = System.nanoTime() - loopStart;

        long streamStart = System.nanoTime();
        List<Bogie> streamResult = performanceList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long streamTime = System.nanoTime() - streamStart;

        System.out.println("Loop Time: " + loopTime);
        System.out.println("Stream Time: " + streamTime);

        // ---------------- UC14 ----------------
        System.out.println("\nCustom Exception Validation...");

        try {
            Bogie valid = new Bogie("Sleeper", 72);
            System.out.println("Created: " + valid);

            Bogie invalid1 = new Bogie("AC Chair", -10);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Bogie invalid2 = new Bogie("First Class", 0);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}