# Palindrome String Checker

A phrase is a **palindrome** if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.

> Alphanumeric characters include **letters and numbers**.

## Problem Statement

Given a string `s`, return `true` if it is a palindrome, or `false` otherwise.

---

## Examples

### Example 1:

- **Input:**  
  `s = "A man, a plan, a canal: Panama"`
- **Output:**  
  `true`
- **Explanation:**  
  After cleaning: `"amanaplanacanalpanama"`  
  It reads the same forward and backward.

---

### Example 2:

- **Input:**  
  `s = "race a car"`
- **Output:**  
  `false`
- **Explanation:**  
  After cleaning: `"raceacar"`  
  It is not a palindrome.

---

### Example 3:

- **Input:**  
  `s = " "`
- **Output:**  
  `true`
- **Explanation:**  
  After removing non-alphanumeric characters, the string is empty: `""`  
  An empty string is considered a palindrome.

---

## Constraints

- The function must ignore case and non-alphanumeric characters.
- Return `true` if the cleaned string is a palindrome, otherwise return `false`.
