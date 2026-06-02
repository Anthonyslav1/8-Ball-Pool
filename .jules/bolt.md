## 2024-05-18 - Expensive Math.sqrt in Game Loop
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (e.g., `potCheck`) is a major performance drain.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection to gain a ~11-12% performance improvement.

## 2024-05-18 - Repeated Getter Invocations in Game Loop
**Learning:** Repeatedly invoking getter methods like `getCenterX()` and `getCenterY()` inside long conditional checks adds unnecessary execution overhead.
**Action:** Cache the results of repeated method calls into local variables (`cx`, `cy`) before using them in calculations within high-frequency loops.
