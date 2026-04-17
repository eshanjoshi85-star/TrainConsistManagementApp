# TrainConsistManagementApp

The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

**The application supports:**

Passenger bogies (Sleeper, AC Chair, First Class) with seat capacity tracking

Goods bogies (Rectangular, Cylindrical) with cargo type and safety constraints

Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces one or more Java concepts through a realistic railway Scenario.

UC10: Count Total Seats in Train (reduce)
-

**Drawback of the UC9 Approach**

In UC9, bogies are organized into logical groups using groupingBy().
While grouping structures the data, it does not provide numerical insight.

In real railway operations, administration often needs to:

• Know the total seating capacity of the train.

• Estimate passenger handling capability.

• Perform utilization planning.

With only grouped lists:

❌ No total metrics are available.

❌ No aggregation is performed.

❌ Decision-making lacks quantitative support.

For example, seeing Sleeper and AC Chair grouped is useful, but it is more useful to know how many total seats the train can offer.
To compute meaningful values, we introduce aggregation using reduce().

**Goal**

Aggregate seating capacities into a single total value using Stream reduction.

**Actor:** User

**Flow**

User creates a list of bogies.

System converts the list into a stream

map() extracts capacity values

reduce() sums the capacities.

Total seating capacity is displayed.

Program continues.

**Key Concepts Used in UC10**

map() Operation – Transforms each bogie object into its numeric capacity value so that mathematical operations can be applied.

reduce() Method – Combines multiple values into a single result, such as summing all seat capacities into one total number.

Method Reference – Uses concise syntax like Integer::sum to define aggregation logic clearly.

Functional Aggregation – Replaces manual loops with declarative computation pipelines.

Stream Pipeline – Chains transformation and aggregation steps into a single readable flow.

Numeric Analytics – Enables quantitative analysis over collection data for planning purposes.

**Key Requirements**

Reuse the list of Bogie objects.

Create a stream using stream().

Apply map(b -> b.capacity) to extract numeric values.

Use reduce(0, Integer::sum) to calculate the total.

Display the total seating capacity.

**Key Benefits**

Introduces aggregation logic in functional style.

Provides real operational metrics for the train.

Improves planning and utilization analysis.

Replaces error-prone manual summation loops.

Builds foundation for advanced analytics use cases.
