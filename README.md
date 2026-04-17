# TrainConsistManagementApp

The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

**The application supports:**

Passenger bogies (Sleeper, AC Chair, First Class) with seat capacity tracking

Goods bogies (Rectangular, Cylindrical) with cargo type and safety constraints

Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces one or more Java concepts through a realistic railway Scenario.

UC15: Safe Cargo Assignment Using try-catch-finally
-

**Drawback of UC14 Approach**

In UC14, validation happens during object creation and stops execution using checked exceptions.
However, not all problems occur at construction time.

In a running railway system:

• Cargo may be assigned dynamically.

• Operators may choose unsafe combinations.

• Runtime conditions may violate safety policies.

For example:

Assigning petroleum to a rectangular bogie is unsafe, but the system might attempt it while running.

If runtime exceptions are not handled:

❌ The application may crash unexpectedly.

❌ Cleanup or logging may never happen.

❌ The user gets no controlled feedback.

So beyond throwing exceptions, the system must also catch and manage them safely using structured handling with:

✔ try

✔ catch

✔ finally

**Goal**

Safely handle unsafe cargo assignments without crashing the Train Consist Management App.

**Actor:** User

**Flow**

User attempts to assign cargo to a goods bogie.

System checks shape and cargo compatibility.

If unsafe, an exception is thrown.

Exception is caught in the catch block.

An error message is displayed.

finally block executes cleanup or logging.

Program continues safely.

**Key Concepts Used in UC15**

try-catch-finally – Structured blocks used to detect, 
handle, and finalize exception-prone logic.

Runtime Exception – An unchecked exception raised during program execution rather than compile time.

Custom Runtime Exception – Domain-specific exception for unsafe cargo assignments.

throw Keyword – Used to signal unsafe operational conditions.

Graceful Failure Handling – Prevents application crashes while informing the user properly.

finally Block – Executes mandatory logic such as logging or cleanup whether an exception occurs or not.

**Key Requirements**

Create a custom runtime exception CargoSafetyException.

Validate cargo and shape compatibility before assignment.

Throw exception when petroleum is assigned to a rectangular bogie.

Catch the exception inside the assignment logic.

Use finally block for completion logging.

Ensure the application continues after failure.


**Key Benefits**

Improves runtime safety of cargo operations.

Demonstrates checked vs unchecked exception usage.

Teaches structured error handling.

Ensures system stability during failures.

Encourages defensive operational coding.
