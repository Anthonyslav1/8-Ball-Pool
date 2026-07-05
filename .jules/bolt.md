## 2024-05-24 - Math.sqrt() in high-frequency loops
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (e.g., `potCheck()`) is a significant performance anti-pattern.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection.

## 2024-05-24 - Repeated Method Call Overhead
**Learning:** Calling `getCenterX()` and `getCenterY()` repeatedly inside distance calculations adds redundant execution overhead.
**Action:** Cache repeated method calls into local variables within loops or frequently called methods to avoid this overhead.
