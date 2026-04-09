# TrainConsistManagementApp

The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

**The application supports:**

Passenger bogies (Sleeper, AC Chair, First Class) with seat capacity tracking

Goods bogies (Rectangular, Cylindrical) with cargo type and safety constraints

Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces one or more Java concepts through a realistic railway Scenario.

UC4: Maintain Ordered Bogie IDs (TreeSet & SortedSet)
-
**Drawback of UC3 Approach**


In UC3, we ensured the uniqueness of bogie IDs using HashSet.

While this solves duplication, it introduces a new problem:

HashSet does not preserve order.

A train consist must follow a physical sequence:

Locomotive → Passenger → Cargo → Guard Coach.


With HashSet, the arrangement becomes unpredictable, which is unacceptable for real-world train formation.

So, we need a structure that:

✔ Maintains insertion order

✔ Supports fast insertion/removal

✔ Models real train chaining

This leads us to LinkedList.

**Goal**

Ensure no duplicate bogie IDs are added to the train.


**Actor :** User

**Flow**

User adds bogie IDs

System inserts into HashSet

Duplicates are ignored

Unique IDs are displayed.

**Key Concepts Used in UC4**

LinkedList – A doubly linked list implementation of the List interface where elements are connected using node references instead of indexes.


Node Structure Concept – Each element contains data and links to previous and next nodes, enabling efficient insertions and deletions.


addFirst() / addLast() – Methods to attach bogies at the beginning or end of the train.


add(index, element) – Inserts a bogie in the middle of the consist.


removeFirst() / removeLast() – Detaches bogies from the head or tail.


Order Preservation – Maintains the physical sequence of train bogies.

**Key Requirements**

Create a LinkedList<String> for the consist.


Add bogies: Engine, Sleeper, AC, Cargo, Guard.


Insert a Pantry Car at position 2.


Remove the first and last bogie.


Display the final ordered train consist.

**Key Benefits**

Models real-world chaining behavior.


Teaches when LinkedList is better than ArrayList.


Demonstrates insertion and deletion efficiency.


Helps students visualize node-based structures.
