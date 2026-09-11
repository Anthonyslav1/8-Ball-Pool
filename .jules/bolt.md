## 2024-09-11 - Math.sqrt in high-frequency loops
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (e.g., `potCheck`) is a major performance bottleneck, especially when duplicated across multiple classes.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection to save CPU cycles.
