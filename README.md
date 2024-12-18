# Groovy NullPointerException in Comparison

This repository demonstrates a common Groovy bug related to NullPointerExceptions arising from implicit null handling during comparisons.  The `someMethod` function intends to return the larger of two numbers but fails if one of the inputs is null.

The solution showcases how to explicitly check for null values before comparison to prevent the exception.

## Bug

The `bug.groovy` file contains the faulty code that throws a `NullPointerException` when a null value is passed as an argument.  The root cause is the lack of explicit null checks before the comparison operation.

## Solution

The `bugSolution.groovy` file demonstrates the solution.  This version explicitly handles null values by using the Groovy Elvis operator (`?:`) or a conditional statement to provide a default value or alternative logic if a null value is encountered.