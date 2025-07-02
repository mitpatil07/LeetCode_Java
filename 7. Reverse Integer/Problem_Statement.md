# Reverse Integer

Given a signed **32-bit integer** `x`, return `x` with its **digits reversed**.

If reversing `x` causes the value to go **outside the signed 32-bit integer range** `[-2³¹, 2³¹ - 1]`, then return `0`.

> ⚠️ **Assumption**:  
> The environment does **not** allow the use of **64-bit integers** (signed or unsigned).

---

## Examples

### Example 1:
- **Input:**  
  `x = 123`
- **Output:**  
  `321`

---

### Example 2:
- **Input:**  
  `x = -123`
- **Output:**  
  `-321`

---

### Example 3:
- **Input:**  
  `x = 120`
- **Output:**  
  `21`

---

## Constraints

- The input must be a **signed 32-bit integer**: `-2³¹ ≤ x ≤ 2³¹ - 1`
- Do **not** use 64-bit data types for calculations.
- If the reversed integer exceeds the 32-bit range, return `0`.

---

## Notes

- The reversal must maintain the **sign** of the original integer.
- Leading zeros in the reversed integer should be **removed** (e.g., 120 → 21).
