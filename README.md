# TrainConsistManagementApp

The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

**The application supports:**

Passenger bogies (Sleeper, AC Chair, First Class) with seat capacity tracking

Goods bogies (Rectangular, Cylindrical) with cargo type and safety constraints

Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces one or more Java concepts through a realistic railway Scenario.

UC8: Filter Passenger Bogies Using Streams
-

**Drawback of UC7 Approach**

In UC7, bogies are sorted based on seating capacity using Comparator.
While sorting organizes data, it does not allow the system to select specific bogies based on conditions.

In real railway operations, administrators often need to:

• Display only high-capacity bogies.

• Exclude low-capacity or special-purpose bogies.

• Apply business rules dynamically.

Using traditional loops:

❌ Code becomes verbose and imperative.

❌ Logic is mixed with iteration.

❌ Harder to read and maintain.

For example, manually looping through each bogie to check capacity adds boilerplate code and hides the business intent.
To express filtering logic clearly and concisely, we introduce the Java Stream API

**Goal**

Filter passenger bogies using Stream pipelines based on seating capacity.

**Actor:** User

**Flow**

User creates a list of bogies.

The system converts the list into a stream.

filter() is applied with a condition.

Matching bogies are collected into a new list.

Filtered bogies are displayed.

Program continues.


**Key Concepts Used in UC8**

Stream API – A modern Java feature that processes collections in a declarative style, allowing operations such as filtering, mapping, and aggregation without manual loops.

stream() Method – Converts a collection into a stream pipeline so that functional operations can be applied to bogie data.

filter() Operation – Selects elements that satisfy a given condition, such as capacity greater than a specific value.

Lambda Expressions – Provide concise behavior definition for filtering logic instead of long conditional loops.

collect() / toList() – Converts the processed stream back into a collection that can be stored or displayed.

Declarative Programming Style – Focuses on what to do instead of how to iterate, improving readability and intent clarity.

**Key Requirements**

Reuse the Bogie list created in UC7.

Create a stream from the list using stream().

Apply filter(b -> b.capacity > 60) as the condition.

Collect the result into a new list.

Display the filtered bogies.

**Key Benefits**

Reduces boilerplate looping code.

Improves clarity of business rules.

Introduces functional-style programming in Java.

Enhances maintainability of collection processing.

Prepares students for advanced stream operations in later use cases.
