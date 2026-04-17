# TrainConsistManagementApp

The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

**The application supports:**

Passenger bogies (Sleeper, AC Chair, First Class) with seat capacity tracking

Goods bogies (Rectangular, Cylindrical) with cargo type and safety constraints

Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces one or more Java concepts through a realistic railway Scenario.

UC7: Sort Bogies by Capacity (Comparator)
-

**Drawback of UC6 Approach**

In UC6, the system can store each bogie along with its capacity using a HashMap.
However, the data is still unordered from a planning perspective.
In real railway operations, administration often needs to:

• Identify high-capacity bogies first.

• Arrange bogies for optimal usage.

• Compare passenger capacity across classes.

With only storage:

❌ Bogies are not ranked.

❌ There is no logical ordering.

❌ Planning and reporting become difficult.

For example, knowing that Sleeper has 72 seats and AC Chair has 56 seats is useful,
but it is more useful to see them sorted by capacity.
To introduce ordering based on business logic, we use Comparator for custom sorting of objects.

**Goal**

Sort passenger bogies based on their seating capacity using a custom Comparator.

**Actor:** User

**Flow**

User creates passenger bogie objects.

Bogies are stored in a List.

System applies a Comparator to sort by capacity.

Sorted bogies are displayed in order.

Program continues.

**Key Concepts Used in UC7**

Comparator Interface – A functional interface in Java used to define custom comparison logic so that objects can be ordered based on business rules instead of natural ordering.

Custom Objects – Bogies are modeled as Java objects with properties such as name and capacity, allowing richer behavior than simple strings.

List Collection – Stores multiple bogie objects dynamically so that sorting and iteration can be applied easily.

sort() Method – Applies the Comparator logic to rearrange elements in the list according to the defined comparison criteria.

Lambda Expressions – Provide a concise way to express comparison logic without creating separate classes.

Separation of Data and Logic – Keeps bogie data independent from sorting behavior, improving maintainability and clarity.

**Key Requirements**

Create a Bogie class with fields such as name and capacity.

Create a List<Bogie> to store passenger bogies.

Add bogies like Sleeper, AC Chair, and First Class with capacities.

Use Comparator.comparingInt() to define sorting based on capacity.

Sort the list and display the sorted bogies.

**Key Benefits**

Introduces object-based collection handling instead of primitive lists.

Teaches students how to apply business rules during sorting.

Improves train planning and capacity analysis.

Demonstrates clean separation between data structure and behavior.

Prepares students for enterprise-level collection processing.
