## 2026-08-02 - Distance Calculation Bottleneck
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (e.g., `potCheck`) is a major performance anti-pattern, as `Math.sqrt` is expensive.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection to reduce CPU overhead in execution loops.
