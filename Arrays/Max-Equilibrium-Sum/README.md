# Maximum Equilibrium Sum

## Problem Statement

Given an integer array, find the maximum equilibrium sum.

An equilibrium position is an index where the sum of elements
from the beginning of the array up to that position is equal
to the sum of elements after that position.

If multiple equilibrium positions exist, return the maximum
equilibrium sum.

---

## Example

### Input
7
-7 1 5 2 -4 3 0

### Output
0

---

## Logic

1. Calculate the total sum of the array.
2. Initialize `leftSum = 0`.
3. Traverse the array.
4. Add the current element to `leftSum`.
5. Calculate:
   
   `rightSum = totalSum - leftSum`

6. If `leftSum == rightSum`, an equilibrium position is found.
7. Store the maximum equilibrium sum.
8. Print the maximum sum.

---

## Algorithm

1. Read `n`.
2. Read the array.
3. Calculate `totalSum`.
4. Set `leftSum = 0`.
5. Set `maxSum = Integer.MIN_VALUE`.
6. For every element:
   - Add element to `leftSum`.
   - Calculate `rightSum`.
   - If `leftSum == rightSum`, update `maxSum`.
7. Print `maxSum`.

---

## Dry Run

Array:

-7  1  5  2  -4  3  0

Total Sum = 0

| Element | Left Sum | Right Sum | Equilibrium |
|--------:|---------:|----------:|-------------|
| -7 | -7 | 7 | No |
| 1 | -6 | 6 | No |
| 5 | -1 | 1 | No |
| 2 | 1 | -1 | No |
| -4 | -3 | 3 | No |
| 3 | 0 | 0 | Yes |
| 0 | 0 | 0 | Yes |

Maximum Equilibrium Sum = **0**

---

## Time Complexity

O(n)

## Space Complexity

O(n)

---

## Java Code

See `MaxEquilibriumSum.java`.