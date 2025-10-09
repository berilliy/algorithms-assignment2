Boyer-Moore Majority Vote Algorithm
Overview
This project implements the Boyer-Moore Majority Vote algorithm for finding the majority element in an array. A majority element is defined as an element that appears more than n/2 times in an array of size n.
Algorithm Description
The Boyer-Moore Majority Vote algorithm works in two phases:

Candidate Selection Phase: Find a potential majority element by maintaining a candidate and a count. When the count reaches zero, select a new candidate.
Verification Phase: Verify that the candidate actually appears more than n/2 times in the array.

Implementation
The implementation includes:

Main algorithm class: BoyerMooreMajorityVote.java
Performance metrics tracking (comparisons and array accesses)
Comprehensive test suite

Key Methods

findMajority(int[] array): Returns the majority element if it exists, otherwise returns null
getComparisons(): Returns the number of comparisons performed
getArrayAccesses(): Returns the number of array accesses performed

Time Complexity

Best Case: Θ(n) - Single pass through the array
Worst Case: Θ(n) - Single pass through the array
Average Case: Θ(n) - Single pass through the array

The algorithm always makes exactly two passes through the array regardless of input.
Space Complexity

Space Complexity: Θ(1) - Only uses a constant amount of extra space for the candidate and count variables

Running Tests
The test suite automatically generates random arrays and verifies the algorithm's correctness:
bashmvn test
Test details:

Runs 400 test cases with arrays of size 100
Uses random values (0 or 1) to test various distributions
Validates results against a brute-force counting method

Example Usage
javaBoyerMooreMajorityVote algorithm = new BoyerMooreMajorityVote();
int[] array = {3, 3, 4, 2, 3, 3, 3};
Integer result = algorithm.findMajority(array);
System.out.println("Majority element: " + result); // Output: 3
Performance Metrics
The implementation tracks:

Number of comparisons between elements
Number of array accesses
These metrics can be retrieved after running the algorithm for analysis

Edge Cases Handled

Empty arrays (returns null)
Single element arrays (returns that element)
Arrays with no majority element (returns null)
Arrays where all elements are the same (returns that element)
