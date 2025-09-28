# DAAAssignment 1 — Divide & Conquer Algorithms
 Project Goal

Implement four classic divide-and-conquer algorithms in Java, analyze their time complexity, and validate their behavior with simple tests. The focus is on recursion, complexity analysis, and practical performance.

Implemented Algorithms
1. MergeSort (O(n log n))

Splits the array into two halves, sorts them recursively, and merges them into one sorted array.

Uses the divide → conquer → combine strategy.

Base case: array of size 1 is already sorted.

Recurrence: T(n) = 2T(n/2) + O(n)
Solution (Master Theorem, Case 2): T(n) = O(n log n)

2.  QuickSort (O(n log n) average)

Chooses a random pivot, partitions the array, and recursively sorts subarrays.

Recurses on the smaller partition to keep recursion depth bounded.

Recurrence (average): T(n) = 2T(n/2) + O(n)
Time Complexity: O(n log n) (worst case: O(n²) but unlikely with random pivot)

3. Deterministic Select — k-th Element (O(n))

Uses the Median of Medians algorithm:

Group by 5 elements

Find medians

Choose the median of medians as pivot

Recurses only into the part containing the k-th element.

Recurrence: T(n) = T(n/5) + T(7n/10) + O(n)
Time Complexity: O(n)

4. Closest Pair of Points (O(n log n))

Sorts points by x, splits recursively, and checks the minimum distance in both halves.

Uses a “strip” check near the dividing line for cross-boundary pairs.

Recurrence: T(n) = 2T(n/2) + O(n)
Time Complexity: O(n log n)

 Complexity Summary
Algorithm	Time Complexity	Space Complexity	Method Used
MergeSort	O(n log n)	O(n)	Master Theorem
QuickSort	O(n log n)	O(log n)	Master Theorem
Deterministic Select	O(n)	O(1)	Akra–Bazzi Intuition
Closest Pair	O(n log n)	O(n)	Master Theorem
 Observations

MergeSort is stable and predictable with guaranteed O(n log n).

QuickSort is often faster in practice due to cache efficiency, despite possible O(n²) worst-case.

Deterministic Select guarantees linear time but has higher constant factors.

Closest Pair demonstrates a classic geometric divide-and-conquer use case.
