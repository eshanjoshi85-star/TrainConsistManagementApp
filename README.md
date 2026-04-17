Train Consist Management App
-
The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

**The application supports:**	

Passenger bogies (Sleeper, AC Chair, First Class) with seat capacity tracking

Goods bogies (Rectangular, Cylindrical) with cargo type 
and safety constraints

Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces one or more Java concepts through a realistic railway Scenario.


UC19: Binary Search for Bogie ID (Optimized Searching)
-

**Drawback of UC18 Approach**

In UC18, the system used Linear Search.

While simple and reliable, Linear Search has limitations:

• It checks elements one by one.

• Time complexity is O(n).

• Performance degrades with large data sets.

In a real railway system:

• Thousands of bogies may be stored.

• Searches happen frequently.

• Slow lookups affect operational speed.

Once bogie IDs are sorted, the system can search smarter instead of harder.

This introduces Binary Search, a divide-and-conquer strategy.

**Goal**

Find a bogie ID efficiently using binary search on sorted data.

**Actor**: User

**Flow**

User provides sorted bogie IDs.

User provides a search key.

System initializes low and high indexes.

System finds the middle index.

Key is compared with middle value.

Search range is halved.

Steps repeat until found or exhausted.

Result is displayed.

Program continues.


**Key Concepts Used in UC19**

Binary Search – An optimized searching technique that repeatedly divides the search range in half.

Divide-and-Conquer Strategy – Breaks the problem into smaller parts each iteration.

Sorted Data Precondition – Binary search only works correctly on ordered data.

Index-Based Traversal – Uses low, high, and mid positions for navigation.

String Comparison – Uses compareTo() for lexicographic ordering checks.

Time Complexity Awareness – Demonstrates O(log n) efficiency compared to O(n).

**Key Requirements**

Ensure bogie IDs are sorted before searching.

Initialize low and high indexes.

Compute mid index correctly.

Compare key with mid element using compareTo().

Adjust search range accordingly.

Stop when found or when range is exhausted.

Display the result.

**Key Benefits**

Improves search performance drastically.

Introduces algorithmic optimization concepts.

Shows importance of preconditions.

Builds efficient lookup capability.

Complements UC18 with an advanced technique.

