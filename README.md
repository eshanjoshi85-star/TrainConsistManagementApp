# TrainConsistManagementApp

The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

**The application supports:**

Passenger bogies (Sleeper, AC Chair, First Class) with seat capacity tracking

Goods bogies (Rectangular, Cylindrical) with cargo type and safety constraints

Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces one or more Java concepts through a realistic railway Scenario.

UC12: Safety Compliance Check for Goods Bogies
-

**Drawback of UC11 Approach**

In previous use cases, goods bogies were added, filtered, and processed without enforcing domain safety rules.
The system trusted that cargo assignments were always valid.

In real railway logistics, this is dangerous:

• Certain bogie shapes are designed only for specific cargo.

• Cylindrical bogies are meant for liquids like petroleum.

• Assigning wrong cargo can cause leaks, fire hazards, or derailment risks.

Without validation:

❌ Unsafe cargo may enter the system.

❌ Business rules are violated silently.

❌ The train formation becomes operationally risky.

For example:

A Cylindrical bogie carrying Coal is invalid,
but earlier logic would still allow it.
To ensure safety compliance, we must verify rules before proceeding.
This is where Streams with conditional logic help enforce business constraints declaratively.

**Goal**

Encapsulate bogie rules using functional interfaces and apply them using lambda expressions.

**Actor:** User

**Flow**

User prepares a list of goods bogies.

System converts the list into a stream.

allMatch() checks every bogie against safety rules.

Conditional logic verifies cylindrical bogie cargo.

If all checks pass, the train is marked safe.

Result is displayed to the user.

Program continues.


**Key Concepts Used in UC12**

Streams API – Provides a declarative way to process collections by transforming and validating data without manual loops.

allMatch() Terminal Operation – Evaluates whether every element in the stream satisfies a given condition, ideal for safety compliance checks.

Lambda Expressions – Express validation rules inline, making business logic readable and concise.

Conditional Logic in Streams – Combines logical operators inside stream predicates to enforce domain-specific constraints.

Short-Circuit Evaluation – Stops processing as soon as a rule fails, improving performance and safety validation speed.

Business Rule Modeling – Converts real-world safety policies into executable Java logic.


**Key Requirements**

Create a collection of goods bogies with type and cargo fields.

Convert the collection to a stream using stream().

Use allMatch() to validate every bogie.

Apply conditional logic:

Cylindrical → only Petroleum allowed.

Store the result in a boolean variable.

Display whether the train is safety compliant.

**Key Benefits**

Enforces real-world safety constraints programmatically.

Prevents unsafe cargo configurations early.

Introduces stream-based validation patterns.

Replaces manual loops with declarative rules.

Improves reliability of train formation logic.
