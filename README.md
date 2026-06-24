# DSA Journey - Question 01: Set Matrix Zeroes

Welcome to my Data Structures and Algorithms (DSA) journey repository. This repository documents my approach to solving DSA problems, starting from brute force solutions and gradually optimizing them to better and optimal approaches.

## Current Status

**Question 01: Set Matrix Zeroes**

✅ Brute Force Approach Implemented

⏳ Better Approach - Pending

⏳ Optimal Approach - Pending

---

## Problem Statement

Given an `m x n` integer matrix, if an element is `0`, set its entire row and column to `0`.

### Example

#### Input

```text
1 2 3 7
0 6 7 8
9 0 1 2
3 4 5 6
```

#### Output

```text
0 0 3 7
0 0 0 0
0 0 0 0
0 0 5 6
```

---

## Approach 1: Brute Force

### Idea

1. Traverse the matrix and find all positions containing `0`.
2. Store affected row and column indices.
3. Set all recorded rows to `0`.
4. Set all recorded columns to `0`.

### Complexity

**Time Complexity:** `O(M × N + Z × (M + N))`

**Space Complexity:** `O(Z)`

Where:

* `M` = Number of rows
* `N` = Number of columns
* `Z` = Number of zero elements

---

## What I Learned

* Matrix traversal techniques
* Working with nested loops
* Using `ArrayList` for temporary storage
* Separating data collection from data modification
* Time and space complexity analysis

---

## Optimization Roadmap

* [x] Brute Force Approach
* [ ] Better Approach
* [ ] Optimal Approach (O(1) Extra Space)

---

## Repository Progress

### Question 01 - Set Matrix Zeroes

* ✅ Brute Force Version
* ⏳ Optimization in Progress

More problems will be added after completing all approaches for this question.
