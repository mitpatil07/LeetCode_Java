## 📌 Problem Statement: Search Insert Position

Given a **sorted array of distinct integers** and a **target value**, return the **index** if the target is found.  
If not, return the index **where it would be inserted** in order.

You must write an algorithm with **O(log n)** runtime complexity.

---

### 🔍 Examples

#### Example 1:
Input: nums = [1, 3, 5, 6], target = 5
Output: 2


#### Example 2:
Input: nums = [1, 3, 5, 6], target = 2
Output: 1

shell
Copy
Edit

#### Example 3:
Input: nums = [1, 3, 5, 6], target = 7
Output: 4

yaml
Copy
Edit

---


### 💡 Expected Time Complexity

- **O(log n)** — use **Binary Search** for efficient insertion point lookup.