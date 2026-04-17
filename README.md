Train Consist Management App
-
The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

**The application supports:**	

Passenger bogies (Sleeper, AC Chair, First Class) with seat capacity tracking

Goods bogies (Rectangular, Cylindrical) with cargo type 
and safety constraints

Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces one or more Java concepts through a realistic railway Scenario.


UC18: Linear Search for Bogie ID (Array-Based Searching)
-

**Drawback of UC17 Approach**

In UC17, bogie names were sorted for reporting, but the system still lacks a way to locate a specific bogie by ID in the consist.

In real railway operations:

• Operators search bogies for inspection.

• Maintenance teams locate damaged coaches.

• Systems must retrieve a bogie quickly.

If no search logic exists:

❌ The system can only display all data.

❌ It cannot pinpoint a specific bogie.

❌ Manual scanning becomes necessary.

Before optimizing, the system must first support basic 
searching, even when data is unsorted.

That is why UC18 introduces Linear Search.

**Goal**

Search and identify a specific bogie ID from an unsorted list using Linear Search.
**Actor:** User

**Flow**

User provides a list of bogie IDs.

User provides a search key.

 System traverses the array sequentially.

 Each element is compared with the search key.

 If match found, search stops.

 Result is displayed.

 Program continues.

**Key Concepts Used in UC18*

Linear Search – A simple searching technique that checks each element one by one until a match is found.

Sequential Traversal – Visits elements in order from start to end.

Equality Comparison – Uses equals() to compare string IDs safely.

Early Termination – Stops searching immediately once a match is found.

Unsorted Data Handling – Works correctly even when data is not ordered.

Time Complexity Awareness – Demonstrates O(n) performance characteristics.

**Key Requirements**

Create an array of bogie IDs.

Accept a bogie ID to search.

Traverse the array using a loop.

Compare each ID using equals().

Stop when a match is found.

Print whether the bogie exists.

**Key Benefits**

Works on any data ordering.

Simple and reliable search logic.

Introduces searching fundamentals.

Prepares for optimized search in UC19.

Builds understanding of traversal logic.
