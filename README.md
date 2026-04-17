# TrainConsistManagementApp

The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

**The application supports:**

Passenger bogies (Sleeper, AC Chair, First Class) with seat capacity tracking

Goods bogies (Rectangular, Cylindrical) with cargo type and safety constraints

Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces one or more Java concepts through a realistic railway Scenario.

UC13: Performance Comparison (Loops vs Streams)
-

**Drawback of UC12 Approach**

In UC12, the system uses Java Streams to validate safety rules in a clean and declarative way.
While streams improve readability, many developers assume they are always faster than traditional loops.

In real systems, performance matters because:

• Trains may have thousands of bogies in data sets.

• Validation and filtering may run frequently.

• Inefficient logic can slow down operations.

Without measurement:

❌ Developers guess performance instead of proving it.

❌ Optimization decisions become unreliable.

❌ The system may choose elegance over efficiency blindly.

For example:

A stream pipeline looks modern,
but a simple loop might be faster in some scenarios.
To make informed choices, we must measure execution time, not assume it.
This introduces performance benchmarking using System.nanoTime().

**Goal**

Compare performance of loop-based logic versus stream-based logic using time measurement.

**Actor:** User

**Flow**

User prepares a collection of bogies.

System records start time using System.nanoTime().

Filtering is performed using a loop or stream.

System records end time.

Elapsed time is calculated.

Execution time is displayed.

Program continues.







**Key Concepts Used in UC13**

System.nanoTime() – Provides high-resolution time measurement used for benchmarking small blocks of code accurately.

Performance Benchmarking – Technique to evaluate how long a specific operation takes to execute.

Loop-Based Processing – Traditional iteration using for or enhanced for loops for filtering logic.

Stream-Based Processing – Declarative iteration using Stream API pipelines such as filter() and collect().

Micro-Measurement Awareness – Teaches that small code sections require precise timing instead of coarse clocks like milliseconds.

Evidence-Driven Optimization – Encourages decisions based on measured results rather than intuition.

**Key Requirements**

Create a collection of bogies for testing.

Capture start time using System.nanoTime().

Execute loop-based filtering or stream-based filtering.

Capture end time using System.nanoTime().

Compute elapsed time using (end - start).

Print the execution duration.

**Key Benefits**

Introduces performance awareness to students.

Demonstrates practical benchmarking techniques.

Compares imperative and declarative styles.

Avoids premature optimization assumptions.

Builds mindset of measurement-driven development.
