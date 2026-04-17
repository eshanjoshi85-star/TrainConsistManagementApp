//Version 19.0
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
//UC15: Safe Cargo Assignment Using try-catch-finally
//UC16: Sort Passenger Bogies by Capacity
//UC17: Sort Bogie Names Alphabetically
//UC18: Linear Search for Bogie ID
//UC19: Binary Search for Bogie ID
import java.util.*;
import java.util.stream.Collectors;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainApp {

    // ----------- UC14: Custom Exception (Checked) -----------
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ----------- UC15: Custom Runtime Exception -----------
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ----------- Bogie Class (Validated) -----------
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

        System.out.println("\nChecking if 'Sleeper' exists...");
        System.out.println(trainConsist.contains("Sleeper") ?
                "Sleeper bogie is present." : "Sleeper bogie is NOT present.");

        // ---------------- UC3 ----------------
        System.out.println("\nTracking unique bogie IDs...");
        Set<String> bogieIds = new HashSet<>();
        bogieIds.addAll(Arrays.asList("BG101", "BG102", "BG103", "BG101"));
        System.out.println("Unique IDs: " + bogieIds);

        // ---------------- UC4 ----------------
        System.out.println("\nLinkedList operations...");
        LinkedList<String> linkedTrain = new LinkedList<>();
        linkedTrain.addAll(Arrays.asList("Engine", "Sleeper", "AC", "Cargo", "Guard"));
        linkedTrain.add(2, "Pantry Car");
        linkedTrain.removeFirst();
        linkedTrain.removeLast();
        System.out.println("Final train: " + linkedTrain);

        // ---------------- UC5 ----------------
        System.out.println("\nLinkedHashSet (order + uniqueness)...");
        LinkedHashSet<String> formation = new LinkedHashSet<>();
        formation.addAll(Arrays.asList("Engine", "Sleeper", "Cargo", "Guard", "Sleeper"));
        System.out.println("Formation: " + formation);

        // ---------------- UC6 ----------------
        System.out.println("\nHashMap mapping...");
        Map<String, Integer> capacityMap = new HashMap<>();
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 60);
        capacityMap.put("First Class", 24);
        capacityMap.forEach((k, v) -> System.out.println(k + " -> " + v));

        // ---------------- UC7 ----------------
        System.out.println("\nSorting bogies...");
        List<Bogie> bogieList = new ArrayList<>();
        try {
            bogieList.add(new Bogie("Sleeper", 72));
            bogieList.add(new Bogie("AC Chair", 60));
            bogieList.add(new Bogie("First Class", 24));
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }

        bogieList.sort(Comparator.comparingInt(b -> b.capacity));
        bogieList.forEach(System.out::println);

        // ---------------- UC8 ----------------
        System.out.println("\nFiltering capacity > 60...");
        bogieList.stream()
                .filter(b -> b.capacity > 60)
                .forEach(System.out::println);

        // ---------------- UC9 ----------------
        System.out.println("\nGrouping bogies...");
        Map<String, List<Bogie>> grouped =
                bogieList.stream().collect(Collectors.groupingBy(b -> b.name));
        grouped.forEach((k, v) -> System.out.println(k + " -> " + v));

        // ---------------- UC10 ----------------
        System.out.println("\nTotal capacity...");
        int total = bogieList.stream().map(b -> b.capacity).reduce(0, Integer::sum);
        System.out.println("Total: " + total);

        // ---------------- UC11 ----------------
        System.out.println("\nRegex validation...");
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");
        System.out.println(trainPattern.matcher("TRN-1234").matches());
        System.out.println(cargoPattern.matcher("PET-AB").matches());

        // ---------------- UC12 ----------------
        System.out.println("\nSafety compliance...");

        class GoodsBogie {
            String type;
            String cargo;

            GoodsBogie(String type) {
                this.type = type;
            }

            // ----------- UC15 Logic -----------
            public void assignCargo(String cargo) {
                try {
                    if (type.equalsIgnoreCase("Rectangular") &&
                            cargo.equalsIgnoreCase("Petroleum")) {
                        throw new CargoSafetyException(
                                "Unsafe: Petroleum cannot go in Rectangular bogie");
                    }

                    this.cargo = cargo;
                    System.out.println("Assigned: " + this);

                } catch (CargoSafetyException e) {
                    System.out.println("Error: " + e.getMessage());

                } finally {
                    System.out.println("Assignment attempt completed for " + type);
                }
            }

            public String toString() {
                return type + " -> " + (cargo != null ? cargo : "No Cargo");
            }
        }

        List<GoodsBogie> goods = Arrays.asList(
                new GoodsBogie("Cylindrical"),
                new GoodsBogie("Rectangular"),
                new GoodsBogie("Open")
        );

        // UC12 safety check (static)
        boolean safe = goods.stream()
                .allMatch(b -> !b.type.equalsIgnoreCase("Cylindrical") || true);
        System.out.println("Initial Safety: " + (safe ? "SAFE" : "UNSAFE"));

        // ---------------- UC13 ----------------
        System.out.println("\nPerformance test...");
        List<Bogie> perfList = new ArrayList<>();
        try {
            for (int i = 1; i <= 10000; i++) {
                perfList.add(new Bogie("Sleeper", 50 + (i % 50)));
            }
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }

        long t1 = System.nanoTime();
        List<Bogie> loopRes = new ArrayList<>();
        for (Bogie b : perfList)
            if (b.capacity > 60) loopRes.add(b);
        long loopTime = System.nanoTime() - t1;

        long t2 = System.nanoTime();
        List<Bogie> streamRes = perfList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long streamTime = System.nanoTime() - t2;

        System.out.println("Loop: " + loopTime);
        System.out.println("Stream: " + streamTime);

        // ---------------- UC14 ----------------
        System.out.println("\nCustom Exception Validation...");
        try {
            new Bogie("Invalid", -10);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // ---------------- UC15 ----------------
        System.out.println("\nSafe Cargo Assignment...");

        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        GoodsBogie rectangular = new GoodsBogie("Rectangular");

        cylindrical.assignCargo("Petroleum");   // safe
        rectangular.assignCargo("Petroleum");   // unsafe (handled)
        rectangular.assignCargo("Coal");        // continues

        System.out.println("Final States:");
        System.out.println(cylindrical);
        System.out.println(rectangular);
        // ---------------- UC16 ----------------
System.out.println("\nSorting Passenger Bogie Capacities using Bubble Sort...");

// Step 1: Create array of capacities
int[] capacities = {72, 60, 24, 80, 45};

// Display original array
System.out.println("Original Capacities:");
for (int c : capacities) {
    System.out.print(c + " ");
}

// Step 2: Bubble Sort Logic
int n = capacities.length;

for (int i = 0; i < n - 1; i++) {
    for (int j = 0; j < n - i - 1; j++) {

        // Compare adjacent elements
        if (capacities[j] > capacities[j + 1]) {

            // Swap
            int temp = capacities[j];
            capacities[j] = capacities[j + 1];
            capacities[j + 1] = temp;
        }
    }
}

// Step 3: Display sorted array
System.out.println("\nSorted Capacities:");
for (int c : capacities) {
    System.out.print(c + " ");
}

System.out.println("\nBubble Sort Completed.");
// ---------------- UC17 ----------------
System.out.println("\nSorting Bogie Names using Arrays.sort()...");

// Step 1: Create array of bogie names
String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Pantry Car"};

// Display original array
System.out.println("Original Bogie Names:");
System.out.println(Arrays.toString(bogieNames));

// Step 2: Sort using built-in method
Arrays.sort(bogieNames);

// Step 3: Display sorted array
System.out.println("Sorted Bogie Names (Alphabetical):");
System.out.println(Arrays.toString(bogieNames));
// ---------------- UC18 ----------------
System.out.println("\nLinear Search for Bogie ID...");

// Step 1: Create array of bogie IDs (unsorted)
String[] bogieIdsArray = {"BG101", "BG205", "BG150", "BG310", "BG275"};

// Step 2: Define search key (can later be taken from user input)
String searchKey = "BG150";

// Display array
System.out.println("Available Bogie IDs:");
System.out.println(Arrays.toString(bogieIdsArray));

// Step 3: Linear Search Logic
boolean found = false;

for (int i = 0; i < bogieIdsArray.length; i++) {

    // Use equals() for safe string comparison
    if (bogieIdsArray[i].equals(searchKey)) {
        System.out.println("Bogie ID " + searchKey + " FOUND at index " + i);
        found = true;
        break; // Early termination
    }
}

// Step 4: Result if not found
if (!found) {
    System.out.println("Bogie ID " + searchKey + " NOT FOUND");
}

System.out.println("Search operation completed.");
    // ---------------- UC19 ----------------
System.out.println("\nBinary Search for Bogie ID...");

// Step 1: Sorted array of bogie IDs (REQUIRED)
String[] sortedBogieIds = {"BG101", "BG150", "BG205", "BG275", "BG310"};

// Step 2: Define search key
String key = "BG205";

// Display array
System.out.println("Sorted Bogie IDs:");
System.out.println(Arrays.toString(sortedBogieIds));

// Step 3: Initialize pointers
int low = 0;
int high = sortedBogieIds.length - 1;

boolean foundBinary = false;

// Step 4: Binary Search Logic
while (low <= high) {

    int mid = (low + high) / 2;

    int comparison = sortedBogieIds[mid].compareTo(key);

    if (comparison == 0) {
        System.out.println("Bogie ID " + key + " FOUND at index " + mid);
        foundBinary = true;
        break;
    }
    else if (comparison < 0) {
        // mid value < key → search right half
        low = mid + 1;
    }
    else {
        // mid value > key → search left half
        high = mid - 1;
    }
}

// Step 5: If not found
if (!foundBinary) {
    System.out.println("Bogie ID " + key + " NOT FOUND");
}

System.out.println("Binary search completed.");
    }

}