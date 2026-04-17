# TrainConsistManagementApp

The Train Consist Management App is a console-based Java application that simulates how a railway system manages a train’s consist, which is a collection of bogies attached to an engine.

**The application supports:**

Passenger bogies (Sleeper, AC Chair, First Class) with seat capacity tracking

Goods bogies (Rectangular, Cylindrical) with cargo type and safety constraints

Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces one or more Java concepts through a realistic railway Scenario.

UC11: Validate Train ID & Cargo Codes (Regex)
-

**Drawback of UC10 Approach**

In UC10, the system successfully calculates total seating capacity.
However, all previous use cases assume that the input data is already valid and well-formed.

In real railway systems, user input can be:

• Incorrectly formatted.

• Inconsistent with business rules.

• Prone to human error.

For example:

✔ Valid Train ID: TRN-1234

❌ Invalid Train ID: TRAIN12, TRN12A, 1234-TRN

If such values are accepted blindly:
❌ Data integrity is broken.

❌ Downstream processing fails.

❌ Reports become unreliable.

To ensure correctness before processing, the system must validate input formats.

This leads us to Regular Expressions (Regex) using Pattern and Matcher.


**Goal**

Validate Train ID and Cargo Code formats using Regular Expressions.

**Actor:** User

**Flow**

The user enters the Train ID and Cargo Code.

System compiles a regex pattern.

Matcher checks input against the pattern.

If the format matches, input is accepted.

If not, validation fails, and an error message is shown.

Program continues.


**Key Concepts Used in UC11**

Regular Expressions (Regex) – A pattern language used to describe valid text formats, enabling the system to enforce structure rules such as TRN-1234.

Pattern Class – Represents a compiled regular expression that can be reused to validate multiple inputs efficiently.

Matcher Class – Applies a Pattern to a given input string and determines whether the input matches the required format.

matches() Method – Verifies whether the entire input string conforms exactly to the regex pattern.

Format Enforcement – Ensures that Train IDs and Cargo Codes follow strict business rules before being processed further.

Data Integrity Validation – Prevents malformed data from entering the system and corrupting train operations.

**Key Requirements**

Define a regex pattern for Train ID such as TRN-\\d{4}.

Define a regex pattern for Cargo Code such as PET-[A-Z]{2}.

Compile patterns using the Pattern class.

Create Matcher objects for user input.

Use matches() to validate input formats.

Display whether the input is valid or invalid.

**Key Benefits**

Ensures correctness of user and system input.

Protects downstream processing from invalid data.

Introduces regex-based validation techniques.

Teaches students format enforcement in enterprise applications.

Builds foundation for robust input handling.
