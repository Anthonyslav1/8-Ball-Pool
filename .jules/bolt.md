## 2024-05-24 - Math.sqrt overhead in game loops
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (e.g., `potCheck`) adds unnecessary overhead.
**Action:** Prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection. Also, cache repeated method calls like `getCenterX()` and `getCenterY()` into local variables within loops.
