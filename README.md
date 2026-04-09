# TrainConsistManagementApp

The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

**The application supports:**

Passenger bogies (Sleeper, AC Chair, First Class) with seat capacity tracking

Goods bogies (Rectangular, Cylindrical) with cargo type and safety constraints

Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces one or more Java concepts through a realistic railway Scenario.

UC5: Preserve Insertion Order of Bogies (LinkedHashSet)
-

**Drawback of UC4 Approach**

In UC4, we maintained order using LinkedList.

However, train yards often perform last-minute attachments and emergency removals, where the last attached bogie must be removed first.

Problems with plain list logic:

No enforced removal discipline.


Students don’t see real operational constraints.


LIFO behavior is not modeled.


To simulate real-world rollback and last-attachment handling, we need a Stack.

**Goal**

Maintain insertion order while enforcing uniqueness.

Actor: User
Flow
User adds bogies
LinkedHashSet stores them
Formation is printed in original order

**Key Concepts Used in UC5**

LinkedHashSet – A hash table and linked list implementation of the Set interface that stores unique elements while maintaining the exact insertion order of bogies in the train formation.

Set Interface – A collection type in Java that does not allow duplicate elements, ensuring that the same bogie cannot be attached more than once in the train consist.

add() Method – Inserts a bogie into the formation. If the bogie already exists, the method ignores the insertion automatically, protecting the train from invalid duplicate attachments.

Automatic Deduplication – LinkedHashSet removes duplicate bogies internally without requiring manual validation logic from the developer.

Insertion Order Preservation – Unlike HashSet, LinkedHashSet maintains the sequence in which bogies are added, allowing the train consist to reflect the real physical attachment order.

Ordered Iteration – When iterating or printing the collection, bogies are returned in the same order they were connected to the engine.

**Key Requirements**

Create a LinkedHashSet<String> to represent the train formation.

Attach bogies such as: Engine, Sleeper, Cargo, Guard.

Attempt to attach a duplicate bogie intentionally (for example, Sleeper again).

Display the final formation order using System.out.println().

Ensure that duplicates do not appear in the output.

**Key Benefits**

Enforces real-world business rules by preventing duplicate bogies.

Preserves physical attachment sequence of the train.

Demonstrates how Java combines ordering with uniqueness.

Helps students understand when LinkedHashSet is better than HashSet or List.

Builds foundation for safe and predictable train composition logic.
