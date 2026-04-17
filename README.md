Train Consist Management App
-
The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

**The application supports:**	

Passenger bogies (Sleeper, AC Chair, First Class) with seat capacity tracking

Goods bogies (Rectangular, Cylindrical) with cargo type 
and safety constraints

Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces one or more Java concepts through a realistic railway Scenario.


UC17: Sort Bogie Names Using Arrays.sort()
-
**Drawback of UC16 Approach**

In UC16, sorting was performed manually using Bubble Sort.
While useful for learning, Bubble Sort has limitations:

• It is inefficient for large data sets.

• Time complexity is O(n²).

• Real systems should not rely on manual algorithms for production.

In railway reporting and dashboards:

• Bogie names must be sorted frequently.

• Output must be fast and reliable.

• Code should be simple and maintainable.

Instead of reinventing sorting logic, Java provides highly optimized built-in algorithms.

That is why UC17 introduces Arrays.sort().

**Goal**

Sort bogie type names alphabetically using Java’s built-in Arrays.sort() method.

Actor: User

**Flow**

User provides bogie type names.

System calls Arrays.sort() on the array.

Java internally sorts the values.

Sorted bogie names are displayed.

Program continues.


Key Concepts Used in UC17

Arrays.sort() – A built-in Java utility method that sorts arrays using optimized dual-pivot quicksort or TimSort depending on type.

Natural Ordering – Uses default comparison rules such as alphabetical order for strings.

Time Complexity Awareness – Demonstrates efficient O(n log n) sorting compared to manual O(n²) algorithms.

Library Optimization – Shows why standard libraries should be preferred over custom logic.

Readable Code Design – Sorting becomes concise and expressive instead of verbose.

Separation of Algorithm and Usage – Developers focus on what to sort, not how to sort internally.

**Key Requirements**

Create an array of bogie type names.

Use Arrays.sort() to sort the array.

Do not implement manual swap logic.

Print the sorted result using Arrays.toString().

Ensure output is alphabetical.

**Key Benefits**

Improves performance over manual sorting.

Keeps code clean and maintainable.

Introduces standard library usage.

Builds confidence in Java utilities.

Bridges algorithm learning with production practices.
