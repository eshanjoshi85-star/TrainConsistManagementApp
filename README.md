# TrainConsistManagementApp

The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

**The application supports:**

Passenger bogies (Sleeper, AC Chair, First Class) with seat capacity tracking

Goods bogies (Rectangular, Cylindrical) with cargo type and safety constraints

Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces one or more Java concepts through a realistic railway Scenario.

UC14: Handle Invalid Bogie Capacity (Custom Exception)
-

**Drawback of UC13 Approach**

In UC13, the system focuses on performance comparison, but it assumes all data is already valid.
 
 In real railway systems, invalid input can easily enter the system, such as:

• Negative seat capacity.

• Zero capacity bogies.

• Corrupted configuration values.

If such values are allowed:

❌ Passenger allocation becomes meaningless.

❌ Safety and reporting break down.

❌ Bugs propagate silently through later use cases.

Without validation:

The train consist may contain bogies that can never carry passengers.

Instead of allowing bad data and fixing it later, the system 
should fail fast at the moment of creation.

This leads to custom exception handling.

**Goal**

Prevent invalid passenger bogies from being added to the train by enforcing capacity rules using a custom exception.
Actor: User

**Flow**

User attempts to create a passenger bogie.

System validates the capacity value.

If capacity ≤ 0, a custom exception is thrown.

If capacity is valid, the bogie is created successfully

System continues execution safely.

**Key Concepts Used in UC14**

Custom Exception – A user-defined exception class that represents 

domain-specific errors such as invalid bogie capacity.

Exception Inheritance – Creating a new exception by extending 

Exception to represent checked exceptions.

throw Keyword – Used to explicitly raise an exception when business rules are violated.

throws Declaration – Declares that a method or constructor may pass an exception to the caller.

Fail-Fast Validation – Detects errors early and stops incorrect object creation.

Business Rule Enforcement – Encapsulates railway constraints directly into object construction logic.

**Key Requirements**

Create a custom exception class InvalidCapacityException.

Validate capacity inside the passenger bogie constructor.

Throw the exception when capacity is less than or equal to zero.

Declare the constructor with throws InvalidCapacityException.

Ensure invalid bogies are never added to the train consist.

**Key Benefits**

Protects the system from corrupted input.

Encapsulates validation inside domain objects.

Introduces checked exceptions clearly.

Encourages defensive programming.

Prevents downstream failures in later use cases.
