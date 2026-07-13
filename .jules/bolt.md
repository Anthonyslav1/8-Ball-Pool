## 2025-01-20 - Exact Distance Anti-pattern in Game Loops
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (e.g., `potCheck`) is a major performance bottleneck, as seen in this codebase.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection to avoid the overhead of `Math.sqrt`. Additionally, cache repeated method calls like `getCenterX()` into local variables within loops.
