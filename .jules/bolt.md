## 2024-06-25 - Avoid Math.sqrt in Game Loops
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (like collision and pocket detection in `potCheck()`) is a performance anti-pattern that creates significant overhead.
**Action:** Replace `Math.sqrt` distance calculations with short-circuiting squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) to avoid expensive square root operations and early return to reduce CPU load.
