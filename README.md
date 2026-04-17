# TrainConsistManagementApp

The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

**The application supports:**

Passenger bogies (Sleeper, AC Chair, First Class) with seat capacity tracking

Goods bogies (Rectangular, Cylindrical) with cargo type and safety constraints

Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces one or more Java concepts through a realistic railway Scenario.

UC16: Sort Passenger Bogies by Capacity (Bubble Sort – Algorithm Intro)
-

**USE CASE:** Manual Sorting Without Collections.sort()

**Drawback of UC15 Approach**

In UC15, the system safely assigns cargo, but it does not address how data is organized for reporting or allocation.
Earlier UCs used built-in tools like streams and comparators to sort data.

However:

• Students may not understand how sorting actually works internally.

• Library methods hide algorithmic logic.

• Without fundamentals, optimization and debugging become harder.

For training purposes, the railway system should demonstrate manual sorting logic before using high-level APIs.

That is why UC16 introduces Bubble Sort, a simple comparison-based sorting algorithm.

**Goal**

Sort passenger bogie capacities using a basic algorithm (Bubble Sort) instead of library methods.

**Actor:** User

**Flow**

User provides passenger bogie capacities.

System iterates through the array.

Adjacent values are compared.

If out of order, values are swapped.

Multiple passes continue until sorted.

Sorted result is displayed.

Program continues.

**Key Concepts Used in UC16**

Bubble Sort Algorithm – A simple comparison-based sorting technique that repeatedly swaps adjacent elements if they are in the wrong order.

Array Manipulation – Direct access and modification of array elements using indexes.

Nested Loop Processing – Uses two loops to perform multiple passes over the dataset.

Swapping Logic – Temporarily stores values to exchange positions safely.

Algorithmic Thinking – Teaches how high-level sorting is built from low-level steps.

Time Complexity Awareness – Demonstrates O(n²) behavior for educational understanding.



**Key Requirements**

Create an array of passenger bogie capacities.

Use nested loops to compare adjacent values.

Swap values when left element is greater than right element.

Repeat passes until the array is sorted.

Display the sorted capacities.

Avoid using Arrays.sort() or Collections.sort().

**Key Benefits**

Builds foundation for understanding sorting internals.

Bridges gap between theory and implementation.

Improves problem-solving skills.

Prepares students for optimized sorting later.

Encourages algorithm-level reasoning.
