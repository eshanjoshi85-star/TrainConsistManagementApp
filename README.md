# TrainConsistManagementApp

The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

**The application supports:**

Passenger bogies (Sleeper, AC Chair, First Class) with seat capacity tracking

Goods bogies (Rectangular, Cylindrical) with cargo type and safety constraints

Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces one or more Java concepts through a realistic railway Scenario.

UC6: Map Bogie to Capacity (HashMap)
-

**Drawback of UC5 Approach**

In UC5, the train formation stores only the names of bogies in order and ensures uniqueness.
However, a real railway system does not operate using names alone.
Each bogie has important operational attributes such as:

• Seating capacity for passenger bogies

• Load capacity for goods bogies

• Safety limits and constraints

With only a Set of strings:

❌ There is no way to associate data with a bogie.

❌ Capacity information cannot be stored.

❌ The system cannot perform analytics or validation.

**Goal**

Associate each bogie with its seating or load capacity using a key–value mapping structure.

**Actor:** User

**Flow**

User creates a bogie-capacity mapping.

System stores bogie names as keys and capacities as values.

Entries are inserted into a HashMap.

System iterates through the map.

Capacity details are displayed for each bogie.

Program continues.


**Key Concepts Used in UC6**

HashMap – A hash table based implementation of the Map interface that stores data in key–value pairs, allowing each bogie to be mapped directly to its seating or load capacity.

Map Interface – A collection type in Java that represents a mapping between unique keys and their corresponding values, ideal for associating bogies with operational attributes.

put() Method – Inserts a key–value pair into the map, where the bogie name becomes the key and the capacity becomes the value.

Key–Value Association – Models real-world relationships by binding a bogie to its property, such as binding "Sleeper" to 72 seats.

entrySet() Iteration – Provides a view of the entire map as a set of entries, allowing iteration over both keys and values together.

Fast Lookup Using Keys – HashMap allows constant-time retrieval of capacity using a bogie name as the key, making planning and validation efficient.


**Key Requirements**

Create a HashMap<String, Integer> to store bogie-capacity information.

Insert capacity values for bogies such as Sleeper, AC Chair, and First Class.

Use the put() method to map each bogie to its capacity.

Iterate over the map using entrySet().

Display each bogie along with its corresponding capacity.


**Key Benefits**

Models real-world attribute mapping in software systems.

Introduces key–value data representation instead of flat collections.

Enables fast lookup and validation of bogie properties.

Prepares students for enterprise data modeling patterns.

Builds the foundation for analytics and planning use cases in later UCs.