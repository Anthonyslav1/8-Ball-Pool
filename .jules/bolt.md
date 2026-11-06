## 2024-05-23 - Optimize Distance Calculations in Game Loops
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (like `potCheck()`) is a significant performance anti-pattern due to CPU overhead.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection in tight execution loops.
