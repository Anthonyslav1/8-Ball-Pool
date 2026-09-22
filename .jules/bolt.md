
## 2024-06-25 - Avoid Math.sqrt for hit detection
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (like `potCheck`) is a major performance anti-pattern.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (e.g., `dx*dx + dy*dy <= radius*radius`) for collision and pocket detection to avoid the CPU overhead of square root calculation.
