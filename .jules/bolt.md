
## 2024-11-09 - Math.sqrt overhead in game loops
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (like `potCheck`) is a significant performance anti-pattern.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection to reduce CPU overhead.
