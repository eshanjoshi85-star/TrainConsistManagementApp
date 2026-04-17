# TrainConsistManagementApp

The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

**The application supports:**

Passenger bogies (Sleeper, AC Chair, First Class) with seat capacity tracking

Goods bogies (Rectangular, Cylindrical) with cargo type and safety constraints

Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces one or more Java concepts through a realistic railway Scenario.

UC9: Group Bogies by Type (Collectors.groupingBy)
-

**Drawback of UC8 Approach**

In UC8, the system filters bogies based on a condition such as seating capacity.
While filtering selects relevant data, the result is still a flat list.

In real railway operations, administration often needs to:

• Separate passenger bogies from goods bogies.

• Organize bogies by category or class.

• Produce structured reports instead of raw lists.

With only filtering:

❌ Data is not categorized.

❌ Reporting becomes difficult.

❌ Relationships between bogies are not visible.

For example, having a list of bogies does not clearly show which are Sleeper, AC Chair, or First Class in grouped form.

**Goal**

Group bogies into categories using Stream collectors.

**Actor:** User

**Flow**

User creates a list of bogies.

System converts the list into a stream.

groupingBy() collector is applied.

Bogies are grouped into a Map.

Grouped result is displayed.

Program continues.

**Key Concepts Used in UC9**

Collectors.groupingBy() – A stream collector that classifies elements based on a key function and stores them into a Map where each key represents a group of bogies.

Stream Pipeline – A sequence of operations applied on data, allowing transformation from a list into a structured grouped result.

Map Output Structure – groupingBy produces a Map where the key represents the category and the value represents the list of bogies belonging to that category.

Lambda Classification Logic – Defines how bogies are categorized, such as grouping by bogie name or type.

Data Aggregation – Collects multiple elements into logical clusters for easier analysis and reporting.

Structured Transformation – Converts flat data into hierarchical organization suitable for dashboards and planning.

**Key Requirements**

Reuse the list of Bogie objects.

Create a stream using stream().

Apply Collectors.groupingBy() with a classification function.

Store the result in Map<String, List<Bogie>>.

Print the grouped bogie structure.

**Key Benefits**

Transforms flat collections into meaningful structures.

Supports reporting and monitoring use cases.

Introduces advanced stream collectors.

Improves readability and organization of data.

Builds foundation for analytics and dashboards.

