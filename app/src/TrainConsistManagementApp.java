//Version 1.0
//Eshan Pankaj Joshi
//Use Case 1:  Initialize Train and Display Consist Summary
import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize an empty list of bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train initialized successfully.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

    }
}